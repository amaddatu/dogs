package com.example.demo.controllers;

import com.example.demo.models.DogBreed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.lang.reflect.*;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DogBreedControllerTests {

    @Test
    public void contextLoaderTest(){

    }

    @Test
    public void classTest(){
        try{
            Class.forName("com.example.demo.controllers.DogBreedController");
        }
        catch(ClassNotFoundException e){
//            assertTrue(false);
            fail();
        }
    }

    //Legacy function test - whenever there are new functions, these basic functions will still work with the same signature
    @Test
    public void controllerEndPointTest(){
        try{
            DogBreedController dc = new DogBreedController();
            dc.getClass().getDeclaredMethod("createDogBreed", DogBreed.class);
        }
        catch(NoSuchMethodException e){
            assertTrue(false);
        }

        try{
           DogBreedController dc = new DogBreedController();
            dc.getClass().getDeclaredMethod("readDogBreed", Long.class);
        }
        catch(NoSuchMethodException e){
            assertTrue(false);
        }

        try{
            DogBreedController dc = new DogBreedController();
            dc.getClass().getDeclaredMethod("updateDogBreed", Long.class, DogBreed.class);
        }
        catch(NoSuchMethodException e){
            assertTrue(false);
        }

        try{
            DogBreedController dc = new DogBreedController();
            dc.getClass().getDeclaredMethod("deleteDogBreed", Long.class);
        }
        catch(NoSuchMethodException e){
            assertTrue(false);
        }
    }
}
