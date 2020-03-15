package com.example.sneakers.controller;


import com.example.sneakers.model.Sneaker;
import com.example.sneakers.service.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//Marks the class as a controller. Because you added this you don't need to add @ResponseBody to all RequestMappings
//
@RestController
public class SneakerController {
//@Autowired - injects object dependency implicitly. Spring will automatically assign the fields with the passed values.
// just send the domain object as HTTP response in the format that is understood by the consumers like JSON.

   //injects object dependency implicity
    @Autowired
    SneakerService sneakerService;

    //map web requests onto specific handler classes and handler methods
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, value  = "/sneaker")
    public void addSneaker(@RequestBody Sneaker sneaker){sneakerService.addSneaker(sneaker);}

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET,value = "/sneaker")
    public List<Sneaker> getAllSneakers(){
        return sneakerService.getAllSneakers();
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(method = RequestMethod.DELETE, value = "/sneaker/{id}")
    public void deleteSneaker(@PathVariable Long id){
        sneakerService.deleteSneaker(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.PUT,value = "/sneaker/{id}")
    public void updateSneaker(@RequestBody Sneaker sneaker, @PathVariable Long id){
        sneakerService.updateSneaker(id, sneaker);
    }
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET,value = "/sneaker/{id}")
    public Optional<Sneaker> getSneakersByID(@PathVariable Long id){
        return sneakerService.getSneakerByID(id);
    }
}
