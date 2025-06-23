package com.pluralsight.dealership_api.dao;

import com.pluralsight.dealership_api.model.Vehicle;

import java.util.List;

public interface VehicleDao {
    void add(Vehicle vehicle);

    List<Vehicle> getAll();

    void update(Vehicle vehicle);

    void delete(String vin);
}
