package com.hackaaboss.ventaAutos.service;

import com.hackaaboss.ventaAutos.model.Vehicle;

import java.util.List;

public interface IVentaVehiculoService {
    String addVehicle(Vehicle vehicle);

    List<Vehicle> getVehicles();

    List<Vehicle> vehiclesOrderByPrices();

    Vehicle seeOneVehicle(Long id);
}
