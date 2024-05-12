package com.kodlama.io.inventory_service.repository;

import com.kodlama.io.inventory_service.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {
}
