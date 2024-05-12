package com.kodlama.io.inventory_service.business.abstracts;

import com.kodlama.io.inventory_service.business.dto.requests.create.CreateBrandRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateBrandRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateBrandResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllBrandsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetBrandResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateBrandResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getALl();
    GetBrandResponse getById(int id);
    CreateBrandResponse add(CreateBrandRequest request);
    UpdateBrandResponse update(int id, UpdateBrandRequest request);
    void delete(int id);
}
