/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdaguiar.ericssontest;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author bdagu
 */

@Entity
public class Stock {
    
    @Id
    private String name;
    
    @OneToMany(mappedBy="stock")
    private List<Quote> quotes;

    public Stock(String name) {
        this.name = name;
    }

    public Stock() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }
    
    
}
