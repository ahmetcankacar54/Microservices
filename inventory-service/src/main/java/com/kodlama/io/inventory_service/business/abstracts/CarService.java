package com.kodlama.io.inventory_service.business.abstracts;

import com.kodlama.io.inventory_service.business.dto.requests.create.CreateCarRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateCarRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllCarsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateCarResponse;
import com.kodlama.io.inventory_service.entities.State;

import java.util.List;
import java.util.UUID;

public interface CarService {
    List<GetAllCarsResponse> getAll();
    GetCarResponse getById(UUID id);
    CreateCarResponse add(CreateCarRequest request);
    UpdateCarResponse update(UUID id, UpdateCarRequest request);
    void delete(UUID id);
    void changeState(UUID id, State state);
}
