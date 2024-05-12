package com.kodlama.io.inventory_service.business.dto.requests.create;

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
public class CreateCarRequest {
    @NotNull
    @NotBlank
    private UUID id;
    private String name;
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

