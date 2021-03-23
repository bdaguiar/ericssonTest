/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdaguiar.ericssontest;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bdagu
 */
public interface QuoteRepository extends JpaRepository<Quote, Integer>{
    
}
