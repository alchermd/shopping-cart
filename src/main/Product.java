/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JCheckBox;

/**
 *
 * @author alchermd
 */
public class Product {
    private String name;
    private double price;
    private JCheckBox checkbox;

    public Product(String name, double price, JCheckBox checkbox) {
        this.name = name;
        this.price = price;
        this.checkbox = checkbox;
    }
    
    public JCheckBox getCheckbox() {
        return checkbox;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
}
