package com.kodlama.io.inventory_service.business.dto.responses.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetModelResponse {
    private UUID id;
    private UUID brandId;
    private String name;
}

