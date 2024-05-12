package com.kodlama.io.inventory_service.api.controllers;

import com.kodlama.io.inventory_service.business.abstracts.CarService;
import com.kodlama.io.inventory_service.business.dto.responses.get.GetAllCarsResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cars")
public class CarsController {

}
