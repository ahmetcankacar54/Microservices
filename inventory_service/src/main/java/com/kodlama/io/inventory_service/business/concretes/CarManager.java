package com.kodlama.io.inventory_service.business.concretes;

import com.kodlama.io.inventory_service.business.abstracts.CarService;
import com.kodlama.io.inventory_service.business.dto.requests.create.CreateCarRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateCarRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllCarsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateCarResponse;
import com.kodlama.io.inventory_service.entities.State;
import com.kodlama.io.inventory_service.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private CarRepository carRepository;
    @Override
    public List<GetAllCarsResponse> getAll(boolean includeMaintenance) {
        return null;
    }

    @Override
    public GetCarResponse getById(int id) {
        return null;
    }

    @Override
    public CreateCarResponse add(CreateCarRequest request) {
        return null;
    }

    @Override
    public UpdateCarResponse update(int id, UpdateCarRequest request) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void changeState(int id, State state) {

    }
}
