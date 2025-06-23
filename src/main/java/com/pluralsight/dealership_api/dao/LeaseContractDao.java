package com.pluralsight.dealership_api.dao;


import com.pluralsight.dealership_api.model.LeaseContracts;

public interface LeaseContractDao {
    LeaseContracts getById(int id);

    void add(LeaseContracts contract);
}
