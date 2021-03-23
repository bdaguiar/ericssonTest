/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdaguiar.ericssontest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author bdagu
 */

@Entity
public class Quote {
    
    @Id
    @GeneratedValue
    @JsonIgnore
    private Integer id;
    
    @JsonProperty(" ")
    private double value;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JsonIgnore
    private Stock stock;

    public Quote(double value, Stock stock) {
        this.value = value;
        this.stock = stock;
    }

    public Quote() {
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
}
