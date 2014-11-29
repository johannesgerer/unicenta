/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.ticket;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.DataWrite;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.data.loader.SerializableWrite;
import java.io.Serializable;

/**
 *
 * @author johannes
 */
public class Price implements SerializableWrite, SerializableRead, Serializable{
    private double price;
    public double discount;

    public Price(double price, double discount) {
        this.price=price;
        this.discount=discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double Price) {
        this.price = Price;
    }

    @Override
    public void writeValues(DataWrite dp) throws BasicException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readValues(DataRead dr) throws BasicException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}


