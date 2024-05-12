package com.kodlama.io.inventory_service.business.abstracts;

import com.kodlama.io.inventory_service.business.dto.requests.create.CreateModelRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateModelRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllModelsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateModelResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    GetModelResponse getById(int id);
    CreateModelResponse add(CreateModelRequest request);
    UpdateModelResponse update(int id, UpdateModelRequest request);
    void delete(int id);
}
