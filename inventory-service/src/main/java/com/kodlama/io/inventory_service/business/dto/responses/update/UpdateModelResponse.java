package com.kodlama.io.inventory_service.business.dto.responses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelResponse {
    private UUID id;
    private UUID brandId;
    private String name;
}

