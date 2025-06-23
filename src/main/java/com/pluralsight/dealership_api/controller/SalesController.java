package com.pluralsight.dealership_api.controller;


import com.pluralsight.dealership_api.dao.SalesContractDao;
import com.pluralsight.dealership_api.model.SalesContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sales-contracts")
public class SalesController {
    private SalesContractDao salesContractDao;

    @Autowired
    public SalesController(SalesContractDao salesContractDao) {
        this.salesContractDao = salesContractDao;
    }
    // Returns a sales contract by ID
    @GetMapping("/{id}")
    public SalesContract getById(@PathVariable int id) {

        return salesContractDao.getById(id);
    }
    // Adds a new sales contract
    @PostMapping
    public void add(@RequestBody SalesContract contract) {
        salesContractDao.add(contract);
    }
}
