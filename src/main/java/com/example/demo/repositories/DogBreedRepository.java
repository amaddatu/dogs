package com.example.demo.repositories;


import com.example.demo.models.DogBreed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogBreedRepository extends CrudRepository<DogBreed, Long> {
//    Job findJobModelByJobID(Long jobID);
}
