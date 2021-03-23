/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdaguiar.ericssontest;

import java.util.List;

/**
 *
 * @author bdagu
 */
public class StockPoster {
    private String name;
    private List<Double> quotes;

    public StockPoster(String name) {
        this.name = name;
    }

    public StockPoster(String name, List<Double> quotes) {
        this.name = name;
        this.quotes = quotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Double> quotes) {
        this.quotes = quotes;
    }
    
}
