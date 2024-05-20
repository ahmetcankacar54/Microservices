package com.kodlama.io.filter_service.api.controllers;

import com.kodlama.io.filter_service.business.abstracts.FilterService;
import com.kodlama.io.filter_service.business.dto.responses.GetAllFiltersResponse;
import com.kodlama.io.filter_service.business.dto.responses.GetFilterResponse;
import com.kodlama.io.filter_service.entities.Filter;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/filters")
public class FilterController {
    private final FilterService service;
    
    @GetMapping
    public List<GetAllFiltersResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetFilterResponse getById(@PathVariable UUID id) {
        return service.getById(id);
    }
}
