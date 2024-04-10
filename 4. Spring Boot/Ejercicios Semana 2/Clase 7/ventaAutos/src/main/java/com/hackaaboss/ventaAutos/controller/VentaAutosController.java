package com.hackaaboss.ventaAutos.controller;

import com.hackaaboss.ventaAutos.model.Vehicle;
import com.hackaaboss.ventaAutos.service.IVentaVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vehicles")
public class VentaAutosController {

    private final IVentaVehiculoService ventaVehiculoSV;

    @Autowired
    public VentaAutosController(IVentaVehiculoService ventaVehiculoSV) {
        this.ventaVehiculoSV = ventaVehiculoSV;
    }


    @PostMapping
    public String addVehicle(@RequestBody Vehicle vehicle){

        return ventaVehiculoSV.addVehicle(vehicle);
    }


    @GetMapping
    public List<Vehicle> getVehicles() {

        return ventaVehiculoSV.getVehicles();
    }



    @GetMapping("/prices")
    public List<Vehicle> vehiclesOrderByPrices(){

        return ventaVehiculoSV.vehiclesOrderByPrices();
    }


    @GetMapping("/{id}")
    public Vehicle  seeOneVehicle(@PathVariable Long id){

        return ventaVehiculoSV.seeOneVehicle(id);
    }

}
