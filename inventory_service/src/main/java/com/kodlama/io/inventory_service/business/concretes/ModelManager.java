package com.kodlama.io.inventory_service.business.concretes;

import com.kodlama.io.common_package.utils.mappers.ModelMapperService;
import com.kodlama.io.inventory_service.business.abstracts.ModelService;
import com.kodlama.io.inventory_service.business.dto.requests.create.CreateModelRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateModelRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllModelsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateModelResponse;
import com.kodlama.io.inventory_service.entities.Model;
import com.kodlama.io.inventory_service.repository.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private final ModelRepository repository;
    private final ModelMapperService mapper;

    @Override
    public List<GetAllModelsResponse> getAll() {
        var models = repository.findAll();
        var response = models
                .stream()
                .map(model -> mapper.forResponse().map(model, GetAllModelsResponse.class))
                .toList();

        return response;
    }

    @Override
    public GetModelResponse getById(UUID id) {
        checkIfModelExistsById(id);
        var model = repository.findById(id).orElseThrow();
        var response = mapper.forResponse().map(model, GetModelResponse.class);

        return response;
    }

    @Override
    public CreateModelResponse add(CreateModelRequest request) {
        var model = mapper.forRequest().map(request, Model.class);
        var createdModel = repository.save(model);
        var response = mapper.forResponse().map(createdModel, CreateModelResponse.class);

        return response;
    }

    @Override
    public UpdateModelResponse update(UUID id, UpdateModelRequest request) {
        checkIfModelExistsById(id);
        var model = mapper.forRequest().map(request, Model.class);
        model.setId(id);
        var updatedModel = repository.save(model);
        var response = mapper.forResponse().map(updatedModel, UpdateModelResponse.class);

        return response;
    }

    @Override
    public void delete(UUID id) {
        checkIfModelExistsById(id);
        repository.deleteById(id);
    }

    private void checkIfModelExistsById(UUID id) {
        repository.findById(id).orElseThrow();
    }
}
