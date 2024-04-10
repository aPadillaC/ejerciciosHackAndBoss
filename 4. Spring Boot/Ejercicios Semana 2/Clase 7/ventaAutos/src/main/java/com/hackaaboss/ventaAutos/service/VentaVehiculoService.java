package com.hackaaboss.ventaAutos.service;

import com.hackaaboss.ventaAutos.model.Vehicle;
import com.hackaaboss.ventaAutos.repository.VentaVehiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class VentaVehiculoService implements IVentaVehiculoService{

    @Autowired
    VentaVehiculosRepository ventaVRepo;


    @Override
    public String addVehicle(Vehicle vehicle) {

        return ventaVRepo.setVehiculos(vehicle);
    }


    @Override
    public List<Vehicle> getVehicles() {

        return ventaVRepo.getVehicles();
    }


    @Override
    public List<Vehicle> vehiclesOrderByPrices() {

        return ventaVRepo.getVehicles().stream()
                .sorted(Comparator.comparingDouble(Vehicle::getPrice))
                .toList();
    }


    @Override
    public Vehicle seeOneVehicle(Long id) {

        return ventaVRepo.seeOneVehicle(id).orElse(null);
    }
}
