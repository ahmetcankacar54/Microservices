package com.kodlama.io.filter_service.business.concretes;

import com.kodlama.io.filter_service.business.abstracts.FilterService;
import com.kodlama.io.filter_service.business.dto.responses.GetAllFiltersResponse;
import com.kodlama.io.filter_service.business.dto.responses.GetFilterResponse;
import com.kodlama.io.filter_service.entities.Filter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FilterManager implements FilterService {
    @Override
    public List<GetAllFiltersResponse> getAll() {
        return List.of();
    }

    @Override
    public GetFilterResponse getById(UUID id) {
        return null;
    }

    @Override
    public void add(Filter filter) {

    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public void deleteAllByBrandId(UUID brandId) {

    }

    @Override
    public void deleteAllByModelId(UUID modelId) {

    }
}
