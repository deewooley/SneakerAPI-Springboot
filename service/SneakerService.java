package com.example.sneakers.service;

import com.example.sneakers.model.Sneaker;
import com.example.sneakers.repository.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SneakerService {
    @Autowired
    SneakerRepository sneakerRepository;

    public List<Sneaker>getAllSneakers(){
        List<Sneaker> listOfSneakers = new ArrayList<>();
        sneakerRepository.findAll().forEach(listOfSneakers::add);
        return listOfSneakers;
    }
    public void addSneaker(Sneaker sneaker){
        sneakerRepository.save(sneaker);
    }

    public void deleteSneaker(Long id){
        sneakerRepository.deleteById(id);
    }
    public Optional<Sneaker> getSneakerByID(Long id){

        return sneakerRepository.findById(id);
    }

    public void updateSneaker(Long id, Sneaker sneaker) {
        sneakerRepository.save(sneaker);
    }
}


