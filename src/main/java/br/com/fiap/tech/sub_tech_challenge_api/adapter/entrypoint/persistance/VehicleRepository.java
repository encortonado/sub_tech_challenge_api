package br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.persistance;

import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
}
