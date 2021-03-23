/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bdaguiar.ericssontest;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bdagu
 */
@RestController
public class StockController {
    
    @Autowired
    private StockRepository stockRepository;
    
    @Autowired
    private QuoteRepository quoteRepository;
    
    @GetMapping("/stocks")
    public List<Stock> getStocks()
    {
        return stockRepository.findAll();
    }
    
    @GetMapping("/stock")
    @ResponseBody
    public List<Stock> getStock(@RequestParam(required=false) String name)
    {
        if(name == null)
        {
            return stockRepository.findAll();
        }
        else
        {
            List<Stock> stocks = new ArrayList();
            stocks.add(stockRepository.findById(name).get());
            return stocks;
        }
    }
    
    @DeleteMapping("/stock/{name}")
    public void deleteStock(@PathVariable String name)
    {
        stockRepository.deleteById(name);
    }
    
    @PostMapping("/stock")
    public Stock postStock(@RequestBody StockPoster stock)
    {
        Stock savedStock = stockRepository.save(new Stock(stock.getName()));
        for(double quote : stock.getQuotes())
        {
            Quote addedQuote = new Quote(quote, stockRepository.findById(stock.getName()).get());
            quoteRepository.save(addedQuote);
        }
        return stockRepository.findById(stock.getName()).get();
    }
    
    @PatchMapping("/stock/{name}")
    public Stock patchStock(@PathVariable String name, @RequestBody QuotePatcher quotes)
    {
        for(double quote : quotes.getQuotes())
        {
            Quote addedQuote = new Quote(quote, stockRepository.findById(name).get());
            quoteRepository.save(addedQuote);
        }
        
        return stockRepository.findById(name).get();
    }
}
