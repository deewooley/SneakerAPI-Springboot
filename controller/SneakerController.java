package com.example.sneakers.controller;


import com.example.sneakers.model.Sneaker;
import com.example.sneakers.service.SneakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SneakerController {

    @Autowired
    SneakerService sneakerService;

    @RequestMapping(method = RequestMethod.POST, value  = "/sneaker")
    public void addSneaker(@RequestBody Sneaker sneaker){sneakerService.addSneaker(sneaker);}

    @RequestMapping(method = RequestMethod.GET,value = "/sneaker")
    public List<Sneaker> getAllSneakers(){
        return sneakerService.getAllSneakers();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/sneaker/{id}")
    public void deleteSneaker(@PathVariable Long id){
        sneakerService.deleteSneaker(id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/sneaker/{id}")
    public void updateSneaker(@RequestBody Sneaker sneaker, @PathVariable Long id){
        sneakerService.updateSneaker(id, sneaker);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/sneaker/{id}")
    public Optional<Sneaker> getSneakersByID(@PathVariable Long id){
        return sneakerService.getSneakerByID(id);
    }
}
