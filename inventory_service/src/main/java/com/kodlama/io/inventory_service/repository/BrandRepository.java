package com.kodlama.io.inventory_service.repository;

import com.kodlama.io.inventory_service.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BrandRepository extends JpaRepository<Brand, UUID> {
}
