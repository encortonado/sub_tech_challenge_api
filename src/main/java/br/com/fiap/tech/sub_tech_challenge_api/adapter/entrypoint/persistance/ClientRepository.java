package br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.persistance;

import br.com.fiap.tech.sub_tech_challenge_api.application.client.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    Optional<ClientEntity> findByCpf(String cpf);

}
