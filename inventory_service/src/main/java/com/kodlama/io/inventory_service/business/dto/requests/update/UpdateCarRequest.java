package com.kodlama.io.inventory_service.business.dto.requests.update;

import com.kodlama.io.inventory_service.entities.State;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {
    @NotNull
    private UUID modelId;
    @Min(2000)
    // TODO: NotFuture custom annotation
    private int modelYear;
    @NotNull
    @NotBlank
    // TODO: add regex
    private String plate;
    @NotNull
    @NotBlank
    private State state;
    @Min(1)
    private double dailyPrice;
}

