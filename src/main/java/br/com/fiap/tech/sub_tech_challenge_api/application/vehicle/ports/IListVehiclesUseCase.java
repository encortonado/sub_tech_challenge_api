package br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.ports;

import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;

import java.util.List;

public interface IListVehiclesUseCase {

    List<VehicleEntity> listVehicles();

}
