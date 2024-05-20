package com.kodlama.io.inventory_service.business.concretes;

import com.kodlama.io.common_package.utils.mappers.ModelMapperService;
import com.kodlama.io.inventory_service.business.abstracts.BrandService;
import com.kodlama.io.inventory_service.business.dto.requests.create.CreateBrandRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateBrandRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateBrandResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllBrandsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetBrandResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateBrandResponse;
import com.kodlama.io.inventory_service.entities.Brand;
import com.kodlama.io.inventory_service.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private final BrandRepository repository;
    private final ModelMapperService mapper;
    @Override
    public List<GetAllBrandsResponse> getALl() {
        var brands = repository.findAll();
        var response = brands
                .stream()
                .map(brand -> mapper.forResponse().map(brand, GetAllBrandsResponse.class))
                .toList();

        return response;
    }

    @Override
    public GetBrandResponse getById(UUID id) {
        checIfBrandExistsById(id);
        var brand = repository.findById(id);
        var response = mapper.forResponse().map(brand, GetBrandResponse.class);

        return response;
    }



    @Override
    public CreateBrandResponse add(CreateBrandRequest request) {
        var brand = mapper.forRequest().map(request, Brand.class);
        repository.save(brand);
        var response = mapper.forResponse().map(brand, CreateBrandResponse.class);

        return response;
    }

    @Override
    public UpdateBrandResponse update(UUID id, UpdateBrandRequest request) {
        checIfBrandExistsById(id);
        var brand = mapper.forRequest().map(request, Brand.class);
        brand.setId(id);
        var updatedBrand = repository.save(brand);
        var response = mapper.forResponse().map(updatedBrand, UpdateBrandResponse.class);

        return response;
    }

    @Override
    public void delete(UUID id) {
        checIfBrandExistsById(id);
        repository.deleteById(id);
    }

    private void checIfBrandExistsById(UUID id) {
        repository.findById(id).orElseThrow();
    }
}
