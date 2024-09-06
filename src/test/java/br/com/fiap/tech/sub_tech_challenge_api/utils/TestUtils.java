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
        vehicleEntity.setPrice(2400.00);

        return vehicleEntity;
    }
}
