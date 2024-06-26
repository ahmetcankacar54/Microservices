package com.kodlama.io.filter_service.business.concretes;

import com.kodlama.io.common_package.utils.mappers.ModelMapperService;
import com.kodlama.io.filter_service.business.abstracts.FilterService;
import com.kodlama.io.filter_service.business.dto.responses.GetAllFiltersResponse;
import com.kodlama.io.filter_service.business.dto.responses.GetFilterResponse;
import com.kodlama.io.filter_service.entities.Filter;
import com.kodlama.io.filter_service.repository.FilterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FilterManager implements FilterService {
    private final FilterRepository repository;
    private final ModelMapperService mapper;
    @Override
    public List<GetAllFiltersResponse> getAll() {
        var filters = repository.findAll();
        var response = filters
                .stream()
                .map(filter -> mapper.forResponse().map(filter, GetAllFiltersResponse.class))
                .toList();
        return response;
    }

    @Override
    public GetFilterResponse getById(UUID id) {
        var filter = repository.findById(id).orElseThrow();
        var response = mapper.forResponse().map(filter, GetFilterResponse.class);
        return response;
    }

    @Override
    public void add(Filter filter) {
        filter.setId(UUID.randomUUID());
        repository.save(filter);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAllByBrandId(UUID brandId) {
    }

    @Override
    public void deleteAllByModelId(UUID modelId) {

    }
}
