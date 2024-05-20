package com.kodlama.io.inventory_service.repository;

import com.kodlama.io.inventory_service.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModelRepository extends JpaRepository<Model, UUID> {
}
