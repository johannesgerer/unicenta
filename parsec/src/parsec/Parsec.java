/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.codehaus.jparsec.*;
import org.codehaus.jparsec.functors.Map;
import org.codehaus.jparsec.pattern.CharPredicates;

/**
 *
 * @author johannes
 */
public class Parsec {

    /**
     * @param args the command line arguments
     * eLine:  amount? price ArticleKey
            |  article amount? price Enter;
     */
    public static class Line {
        public Integer price;
        public Integer article;
        public Integer amount;
        public Line(Integer price, Integer article, Integer amount){
            this.price=price;
            this.article=article;
            this.amount=amount;
        }
        public String toString(){
            return "Price: "+price+", Article: "+article+", Amount: "+amount;
        }
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Parser<Integer> Int=Scanners.INTEGER.map((String from) -> Integer.parseInt(from));
        
        Parser<String> always=Parsers.always();
        Parser<Integer> One=always.map((String v) -> 1);
                
        Parser<Integer> amount=Parsers.longer(
                    Parsers.sequence(Int,Scanners.isChar('*'),(Integer i,Void v) -> i)
                    ,One);
        Parser<Integer> article=Parsers.sequence(Int,Scanners.isChar('/'),(Integer i,Void v) -> i);
        Parser<Integer> price=Int;
        Parser<Integer> articleKey=Scanners.IDENTIFIER.map((String s)-> Character.getNumericValue(s.charAt(0))); //Scanners.isChar(CharPredicates.IS_ALPHA);
        Parser<Line> shortForm=Parsers.sequence(amount,price,articleKey,Scanners.isChar('\n')
                ,(Integer am,Integer p,Integer ar,Void v)-> new Line(p,ar,am));
        Parser<Line> longForm=Parsers.sequence(article,amount,price,
                Scanners.isChar('\n')
                ,(Integer ar,Integer am,Integer p,Void v)-> new Line(p,ar,am));
        Parser<Line> p=Parsers.or(shortForm,longForm);
        
       /* p.parse("5/45*78\n");
        p.parse("5/78\n");
        p.parse("4g");
        p.parse("3*4g"); */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str;
        Line l; 
        while(true) {
            str = br.readLine();
            try{l=p.parse(str+"\n");System.out.println(l);}
            catch(Exception e){
                    System.out.println(e);
                }
            }
    }    
}
