package br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.api.controller;

import br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.api.model.VehiclePurchaseDTO;
import br.com.fiap.tech.sub_tech_challenge_api.application.client.entities.ClientEntity;
import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.services.VehiclePurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicle/purchase")
@RequiredArgsConstructor
public class VehiclePurchaseController {

    private final VehiclePurchaseService vehiclePurchaseService;

    @PostMapping
    public ResponseEntity<ClientEntity> purchase(@RequestBody VehiclePurchaseDTO vehiclePurchaseDTO) throws Exception {


        return ResponseEntity
                .ok()
                .body(vehiclePurchaseService
                        .purchaseVehicle(vehiclePurchaseDTO.getCpf(), vehiclePurchaseDTO.getVehicle()));
    }

}
