package br.com.fiap.tech.sub_tech_challenge_api.adapter.entrypoint.persistance;

import br.com.fiap.tech.sub_tech_challenge_api.application.vehicle.entities.VehicleEntity;
import br.com.fiap.tech.sub_tech_challenge_api.utils.TestUtils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class VehicleRepositoryTest {

    @Mock
    private VehicleRepository vehicleRepository;

    AutoCloseable openMocks;

    @BeforeEach()
    void setup() {
        openMocks = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception{
        openMocks.close();
    }

    @Nested
    class VehicleRepo {

        @Nested
        class createVehicle {

            @Test
            void createVehicleRegisterTest() {

                VehicleEntity vehicleEntity = TestUtils.buildVehicleEntity();

                when(vehicleRepository.save(any(VehicleEntity.class))).thenReturn(vehicleEntity);

                var vehicleRegistered = vehicleRepository.save(vehicleEntity);

                Assertions.assertThat(vehicleRegistered)
                        .isNotNull()
                        .isInstanceOf(VehicleEntity.class)
                        .isEqualTo(vehicleEntity);

                verify(vehicleRepository, times(1)).save(any(VehicleEntity.class));

            }

        }

    }
}