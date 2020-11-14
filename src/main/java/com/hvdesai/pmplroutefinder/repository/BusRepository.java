package com.hvdesai.pmplroutefinder.repository;

import com.hvdesai.pmplroutefinder.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long > {

    List<Bus> findAll();

    @Query("SELECT b FROM Bus b WHERE b.name LIKE %?1%")
    public List<Bus> getAll(String name);

    

}
