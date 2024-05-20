package com.kodlama.io.inventory_service.business.dto.requests.create;


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
public class CreateCarRequest {
    @NotNull
    private UUID modelId;
    @Min(2000)
    // TODO: NotFuture custom annotation
    private int modelYear;
    @NotNull
    @NotBlank
    // TODO: add regex
    private String plate;
    @Min(1)
    private double dailyPrice;
}

