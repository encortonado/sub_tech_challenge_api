package br.com.fiap.tech.sub_tech_challenge_api.application.client.entities;

import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TB_CLIENT")
@Data

@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {

    @NotBlank(message = "CPF is required")
    @Pattern(regexp = "\\d{11}", message = "CPF must contain 11 digits")
    @Id
    private String cpf;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must have at least 6 characters")
    private String password;

    @ManyToMany
    @JoinTable(
            name = "TB_CLIENT_VEHICLE", // Tabela de associação
            joinColumns = @JoinColumn(name = "client_cpf"),  // Chave estrangeira para Client
            inverseJoinColumns = @JoinColumn(name = "vehicle_id")  // Chave estrangeira para Vehicle
    )
    private Set<VehicleEntity> vehicles = new HashSet<>();
}

