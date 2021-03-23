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
public class QuotePatcher {
    private List<Double> quotes;

    public QuotePatcher(List<Double> quotes) {
        this.quotes = quotes;
    }
    
    public QuotePatcher() {
        
    }

    public List<Double> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Double> quotes) {
        this.quotes = quotes;
    }
    
}
