/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.ticket;

/**
 *
 * @author johannes
 */
public class Price {
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

    
}


