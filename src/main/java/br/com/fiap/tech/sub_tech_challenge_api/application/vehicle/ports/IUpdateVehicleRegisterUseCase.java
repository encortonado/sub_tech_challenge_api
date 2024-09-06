package br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.ports;

import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;

public interface IUpdateVehicleRegisterUseCase {

    VehicleEntity updateVehicleRegister(VehicleEntity vehicleEntity);

}
