package com.pluralsight.dealership_api.controller;

import com.pluralsight.dealership_api.dao.VehicleDao;
import com.pluralsight.dealership_api.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/vehicles")

public class VehiclesController {

    private VehicleDao vehicleDao;

    @Autowired
    public VehiclesController(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;
    }
    //crate new vehicle
        @PostMapping
    public void addVehicle(@RequestBody Vehicle vehicle){
        vehicleDao.add(vehicle);

    }
    //retrive all the vehicles
    public List<Vehicle> getAllVehicles(){
        return vehicleDao.getAll();
    }
    //update
    @PutMapping("/{vin}")
    public void updateVehicle(@PathVariable String vin, @RequestBody Vehicle vehicle) {
        vehicle.setVin(vin);
        vehicleDao.update(vehicle);

    }
    // delete using the vin
    @DeleteMapping("/{vin}")
    public void deleteVehicle(@PathVariable String vin) {
        vehicleDao.delete(vin);
    }
}
