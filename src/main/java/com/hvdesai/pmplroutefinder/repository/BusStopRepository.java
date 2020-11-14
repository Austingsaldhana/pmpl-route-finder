package com.hvdesai.pmplroutefinder.repository;

import com.hvdesai.pmplroutefinder.entities.BusRoute;
import com.hvdesai.pmplroutefinder.entities.BusStop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusStopRepository extends JpaRepository<BusStop, Long > {

    List<BusStop> findAll();

}