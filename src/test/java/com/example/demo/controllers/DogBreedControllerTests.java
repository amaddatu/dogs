package com.example.demo.controllers;

import com.example.demo.models.DogBreed;
import com.example.demo.repositories.DogBreedRepository;
import com.example.demo.services.DogBreedService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.lang.reflect.*;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DogBreedControllerTests {

    @Mock
    private DogBreedRepository dogBreedRepository;


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
        DogBreedService dbs = new DogBreedService(dogBreedRepository);
        try{
            DogBreedController dc = new DogBreedController(dbs);
            dc.getClass().getDeclaredMethod("createDogBreed", DogBreed.class);
        }
        catch(NoSuchMethodException e){
            assertTrue(false);
        }

        try{
           DogBreedController dc = new DogBreedController(dbs);
            dc.getClass().getDeclaredMethod("readDogBreed", Long.class);
        }
        catch(NoSuchMethodException e){
            assertTrue(false);
        }

        try{
            DogBreedController dc = new DogBreedController(dbs);
            dc.getClass().getDeclaredMethod("updateDogBreed", Long.class, DogBreed.class);
        }
        catch(NoSuchMethodException e){
            assertTrue(false);
        }

        try{
            DogBreedController dc = new DogBreedController(dbs);
            dc.getClass().getDeclaredMethod("deleteDogBreed", Long.class);
        }
        catch(NoSuchMethodException e){
            assertTrue(false);
        }
    }

    @Test
    public void saveTest(){

    //SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        DogBreed dogBreed = new DogBreed("Golden Retriever", "Golden Retriever is Golden");
        DogBreed dogBreedExpectedOut = new DogBreed(1L, "Golden Retriever", "Golden Retriever is Golden");
        //Setup
        given(dogBreedRepository.save( dogBreed )).willReturn( dogBreedExpectedOut );
        DogBreedService dbs = new DogBreedService(dogBreedRepository);
        DogBreedController dbc = new DogBreedController(dbs);

        //Execute
        DogBreed dogBreedOut = dbc.createDogBreed(dogBreed);


        //Assert
        then(dogBreedRepository).should(times(1)).save(dogBreed);
        assertTrue(dogBreedOut.getId() == dogBreedExpectedOut.getId());
        assertTrue(dogBreedOut.getName() == dogBreedExpectedOut.getName());
        assertTrue(dogBreedOut.getDescription() == dogBreedExpectedOut.getDescription());

        //Teardown




    }

}
