package br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.services;

import br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.persistance.VehicleRepository;
import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;
import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.ports.IVehicleService;
import br.com.fiap.tech.sub_tech_challenge_api.infrastructure.exceptions.CustomErrorTypeException;

import java.util.List;

public class VehicleService implements IVehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }


    @Override
    public List<VehicleEntity> listVehicles() {
        return vehicleRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public VehicleEntity registerVehicle(VehicleEntity vehicleEntityDTO) {
        return vehicleRepository.save(vehicleEntityDTO);
    }

    @Override
    public VehicleEntity updateVehicleRegister(VehicleEntity vehicleEntity) {

        VehicleEntity vehicle = findById(vehicleEntity.getId());
        return vehicleRepository.save(vehicleEntity);
    }

    @Override
    public VehicleEntity findById(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new CustomErrorTypeException("Veículo nao encontrado"));
    }
}
