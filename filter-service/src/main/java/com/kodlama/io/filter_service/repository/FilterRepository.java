package com.kodlama.io.filter_service.repository;

import com.kodlama.io.filter_service.entities.Filter;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface FilterRepository extends MongoRepository<Filter, UUID> {
}
