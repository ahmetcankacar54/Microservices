package com.kodlama.io.inventory_service.business.abstracts;

import com.kodlama.io.inventory_service.business.dto.requests.create.CreateBrandRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateBrandRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateBrandResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllBrandsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetBrandResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateBrandResponse;

import java.util.List;
import java.util.UUID;

public interface BrandService {
    List<GetAllBrandsResponse> getALl();
    GetBrandResponse getById(UUID id);
    CreateBrandResponse add(CreateBrandRequest request);
    UpdateBrandResponse update(UUID id, UpdateBrandRequest request);
    void delete(UUID id);
}
