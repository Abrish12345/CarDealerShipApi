package com.pluralsight.dealership_api.controller;

import com.pluralsight.dealership_api.dao.LeaseContractDao;
import com.pluralsight.dealership_api.model.LeaseContracts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
// Base URL for lease contract-related endpoints
@RequestMapping("/api/lease-contracts")
public class LeaseController {

    private LeaseContractDao leaseContractDao;

    @Autowired
    public LeaseController(LeaseContractDao leaseContractDao) {
        this.leaseContractDao = leaseContractDao; // Inject LeaseContractDao to handle data operations
    }
    @GetMapping("/{id}")
    public LeaseContracts getById(@PathVariable int id) {
        return leaseContractDao.getById(id); // Fetch lease contract by ID
    }

    @PostMapping
    public void add(@RequestBody LeaseContracts contract) {
        leaseContractDao.add(contract); // Add a new lease contract from request body
    }

}
