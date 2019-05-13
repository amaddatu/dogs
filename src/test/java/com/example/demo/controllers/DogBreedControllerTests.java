package com.example.demo.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}
