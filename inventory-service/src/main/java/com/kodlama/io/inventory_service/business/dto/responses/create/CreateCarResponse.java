package com.kodlama.io.inventory_service.business.dto.responses.create;

import com.kodlama.io.inventory_service.entities.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarResponse {
    private UUID id;
    private String modelName;
    private int modelYear;
    private String plate;
    private State state;
    private double dailyPrice;
}
