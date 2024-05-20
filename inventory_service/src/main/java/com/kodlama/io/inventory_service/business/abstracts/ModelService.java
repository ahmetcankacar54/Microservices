package com.kodlama.io.inventory_service.business.abstracts;

import com.kodlama.io.inventory_service.business.dto.requests.create.CreateModelRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateModelRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllModelsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateModelResponse;

import java.util.List;
import java.util.UUID;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    GetModelResponse getById(UUID id);
    CreateModelResponse add(CreateModelRequest request);
    UpdateModelResponse update(UUID id, UpdateModelRequest request);
    void delete(UUID id);
}
