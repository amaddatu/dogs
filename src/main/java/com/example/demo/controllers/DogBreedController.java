package com.example.demo.controllers;

import com.example.demo.models.DogBreed;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dog-breed")
public class DogBreedController {
    //    public Job save(@RequestBody Job job) { return jobService.saveJob(job); }
    @PostMapping("") // POST at the url "/dog-breed"
    public DogBreed createDogBreed(@RequestBody DogBreed dogBreed){
        return null;
    }

    @GetMapping("/{id}")
    public DogBreed readDogBreed(@PathVariable Long id){
        return null;

    }

    @PutMapping("/{id}")
    public DogBreed updateDogBreed(@PathVariable Long id, @RequestBody DogBreed dogBreed) {
        return null;
    }

    @DeleteMapping("/{id}")
    public boolean deleteDogBreed(@PathVariable Long id){
        return false;

    }
}
