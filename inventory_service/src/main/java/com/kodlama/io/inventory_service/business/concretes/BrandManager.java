package com.kodlama.io.inventory_service.business.concretes;

import com.kodlama.io.inventory_service.business.abstracts.BrandService;
import com.kodlama.io.inventory_service.business.dto.requests.create.CreateBrandRequest;
import com.kodlama.io.inventory_service.business.dto.requests.update.UpdateBrandRequest;
import com.kodlama.io.inventory_service.business.dto.responses.create.CreateBrandResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllBrandsResponse;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetBrandResponse;
import com.kodlama.io.inventory_service.business.dto.responses.update.UpdateBrandResponse;
import com.kodlama.io.inventory_service.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository repository;
    @Override
    public List<GetAllBrandsResponse> getALl() {
        return null;
    }

    @Override
    public GetBrandResponse getById(int id) {
        return null;
    }

    @Override
    public CreateBrandResponse add(CreateBrandRequest request) {
        return null;
    }

    @Override
    public UpdateBrandResponse update(int id, UpdateBrandRequest request) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
