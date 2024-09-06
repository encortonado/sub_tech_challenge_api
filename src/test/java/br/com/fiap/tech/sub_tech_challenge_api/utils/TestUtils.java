package br.com.fiap.tech.sub_tech_challenge_api.utils;

import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;

public class TestUtils {

    public static VehicleEntity buildVehicleEntity() {

        VehicleEntity vehicleEntity = new VehicleEntity();
        vehicleEntity.setId(1L);
        vehicleEntity.setYear(2023);
        vehicleEntity.setBrand("Ford");
        vehicleEntity.setModel("Ka");
        vehicleEntity.setColor("Red");
        vehicleEntity.setPrice(244400.00);

        return vehicleEntity;
    }

    public static VehicleEntity anotherBuildVehicleEntity() {

        VehicleEntity vehicleEntity = new VehicleEntity();
        vehicleEntity.setId(5L);
        vehicleEntity.setYear(2021);
        vehicleEntity.setBrand("toyota");
        vehicleEntity.setModel("etios");
        vehicleEntity.setColor("gray");
        vehicleEntity.setPrice(232400.00);

        return vehicleEntity;
    }
}
