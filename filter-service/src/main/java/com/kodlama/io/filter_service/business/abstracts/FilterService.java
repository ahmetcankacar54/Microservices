package com.kodlama.io.filter_service.business.abstracts;

import com.kodlama.io.filter_service.business.dto.responses.GetAllFiltersResponse;
import com.kodlama.io.filter_service.business.dto.responses.GetFilterResponse;
import com.kodlama.io.filter_service.entities.Filter;

import java.util.List;
import java.util.UUID;

public interface FilterService {
    List<GetAllFiltersResponse> getAll();
    GetFilterResponse getById(UUID id);
    void add(Filter filter);
    void delete(UUID id);
    void deleteAllByBrandId(UUID brandId);
    void deleteAllByModelId(UUID modelId);
}
