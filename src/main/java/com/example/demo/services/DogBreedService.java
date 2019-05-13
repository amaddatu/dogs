package com.example.demo.services;

import com.example.demo.models.DogBreed;
import com.example.demo.repositories.DogBreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogBreedService {

    @Autowired
    private final DogBreedRepository dogBreedRepository;

    public DogBreedService(DogBreedRepository dogBreedRepository) {
//        this.employeeRepository = employeeRepository;
        this.dogBreedRepository = dogBreedRepository;
    }

    public DogBreed save(DogBreed dogBreed){
        return this.dogBreedRepository.save(dogBreed);

    }

}
