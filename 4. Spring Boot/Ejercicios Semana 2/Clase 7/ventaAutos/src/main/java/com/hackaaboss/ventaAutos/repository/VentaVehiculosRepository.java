package com.hackaaboss.ventaAutos.repository;

import com.hackaaboss.ventaAutos.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class VentaVehiculosRepository {

    private List<Vehicle> vehicles = new ArrayList<>();

    public String setVehiculos(Vehicle vehicle) {

        this.vehicles.add(vehicle);

        return "Vehiculo " + vehicle.getBrand() + " " + vehicle.getModel() + " insertado";
    }

    public List<Vehicle> getVehicles() {

        return vehicles;
    }

    public Optional<Vehicle> seeOneVehicle(Long id) {

        return vehicles.stream()
                .filter( vehicle -> vehicle.getId().equals(id))
                .findFirst();
    }
}
