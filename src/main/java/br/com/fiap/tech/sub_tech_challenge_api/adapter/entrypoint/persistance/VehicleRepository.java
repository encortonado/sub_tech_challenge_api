package br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.persistance;

import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {

    List<VehicleEntity> findAllByOrderByPriceAsc();

    @Query("SELECT v FROM VehicleEntity v WHERE SIZE(v.clients) > 0")
    List<VehicleEntity> findAllSoldVehicles();

}
