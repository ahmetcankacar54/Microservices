package com.kodlama.io.inventory_service.business.concretes;

import com.kodlama.io.inventory_service.business.abstracts.ModelService;
import com.kodlama.io.inventory_service.business.dto.requests.create.CreateModelRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateModelRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllModelsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    @Override
    public List<GetAllModelsResponse> getAll() {
        return null;
    }

    @Override
    public GetModelResponse getById(int id) {
        return null;
    }

    @Override
    public CreateModelResponse add(CreateModelRequest request) {
        return null;
    }

    @Override
    public UpdateModelResponse update(int id, UpdateModelRequest request) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
