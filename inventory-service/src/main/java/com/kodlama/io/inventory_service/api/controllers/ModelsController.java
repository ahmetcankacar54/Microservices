package com.kodlama.io.inventory_service.api.controllers;

import com.kodlama.io.inventory_service.business.abstracts.ModelService;
import com.kodlama.io.inventory_service.business.dto.requests.create.CreateModelRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateModelRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllModelsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetModelResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateModelResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/models")
public class ModelsController {
    private final ModelService service;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetModelResponse getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllModelsResponse> getAll() {
        return service.getAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateModelResponse add(@Valid @RequestBody CreateModelRequest request) {
        return service.add(request);
    }

    @PutMapping("/{id}")
    public UpdateModelResponse add(@PathVariable UUID id, @Valid @RequestBody UpdateModelRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }
}
