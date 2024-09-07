package br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.services;

import br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.persistance.ClientRepository;
import br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.persistance.VehicleRepository;
import br.com.fiap.tech.sub_tech_challenge_api.application.client.entities.ClientEntity;
import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class VehiclePurchaseService {


    private final VehicleRepository vehicleRepository;
    private final ClientRepository clientRepository;


    @Transactional
    public ClientEntity purchaseVehicle(String cpf, Long vehicleId) throws Exception {

        ClientEntity client = clientRepository.findByCpf(cpf)
                .orElseThrow(() -> new Exception("Client not found"));

        VehicleEntity vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new Exception("Vehicle not found"));

        client.getVehicles().add(vehicle);
        clientRepository.save(client);
        vehicleRepository.save(vehicle);

        return client;
    }

}
