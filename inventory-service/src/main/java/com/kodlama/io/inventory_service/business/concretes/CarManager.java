package com.kodlama.io.inventory_service.business.concretes;

import com.kodlama.io.common_package.utils.mappers.ModelMapperService;
import com.kodlama.io.inventory_service.business.abstracts.CarService;
import com.kodlama.io.inventory_service.business.dto.requests.create.CreateCarRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateCarRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllCarsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetCarResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateCarResponse;
import com.kodlama.io.inventory_service.entities.Car;
import com.kodlama.io.inventory_service.entities.State;
import com.kodlama.io.inventory_service.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CarManager implements CarService {
    private final CarRepository repository;
    private final ModelMapperService mapper;
    @Override
    public List<GetAllCarsResponse> getAll() {
        var cars = repository.findAll();
        var response = cars
                .stream()
                .map(car -> mapper.forResponse().map(car, GetAllCarsResponse.class))
                .toList();
        return response;
    }

    @Override
    public GetCarResponse getById(UUID id) {
        checkIfCarExistsById(id);
        var car = repository.findById(id).orElseThrow();
        var response = mapper.forResponse().map(car, GetCarResponse.class);
        return response;
    }

    @Override
    public CreateCarResponse add(CreateCarRequest request) {
        var car = mapper.forRequest().map(request, Car.class);
        car.setState(State.Available);
        var createdCar = repository.save(car);
        var response = mapper.forResponse().map(createdCar, CreateCarResponse.class);

        return response;
    }

    @Override
    public UpdateCarResponse update(UUID id, UpdateCarRequest request) {
        checkIfCarExistsById(id);
        var car = mapper.forRequest().map(request, Car.class);
        car.setId(id);
        var updatedCar = repository.save(car);
        var response = mapper.forResponse().map(updatedCar, UpdateCarResponse.class);

        return response;
    }

    @Override
    public void delete(UUID id) {
        checkIfCarExistsById(id);
        repository.deleteById(id);
    }

    @Override
    public void changeState(UUID id, State state) {
        checkIfCarExistsById(id);
        var car = repository.findById(id).orElseThrow();
        car.setState(state);
        repository.save(car);
    }

    private void checkIfCarExistsById(UUID id) {
        repository.findById(id).orElseThrow();
    }
}
