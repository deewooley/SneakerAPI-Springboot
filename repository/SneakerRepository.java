package com.example.sneakers.repository;

import com.example.sneakers.model.Sneaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakerRepository extends CrudRepository<Sneaker,Long> {
}
