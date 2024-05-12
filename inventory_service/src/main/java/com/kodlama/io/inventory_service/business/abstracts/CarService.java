package com.kodlama.io.inventory_service.business.abstracts;

import com.kodlama.io.inventory_service.business.dto.requests.create.CreateCarRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateCarRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllCarsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateCarResponse;
import com.kodlama.io.inventory_service.entities.State;

import java.util.List;

public interface CarService {
    List<GetAllCarsResponse> getAll(boolean includeMaintenance);
    GetCarResponse getById(int id);
    CreateCarResponse add(CreateCarRequest request);
    UpdateCarResponse update(int id, UpdateCarRequest request);
    void delete(int id);
    void changeState(int id, State state);
}
