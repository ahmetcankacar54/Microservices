package com.kodlama.io.inventory_service.api.controllers;

import com.kodlama.io.inventory_service.business.abstracts.CarService;
import com.kodlama.io.inventory_service.business.dto.requests.create.CreateCarRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateCarRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllCarsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateCarResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cars")
public class CarsController {
    private final CarService service;
    @GetMapping
    public List<GetAllCarsResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetCarResponse getById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCarResponse add(@Valid @RequestBody CreateCarRequest request) {
        return service.add(request);
    }

    @PutMapping("/{id}")
    public UpdateCarResponse update(@PathVariable UUID id , @Valid @RequestBody UpdateCarRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }

}
