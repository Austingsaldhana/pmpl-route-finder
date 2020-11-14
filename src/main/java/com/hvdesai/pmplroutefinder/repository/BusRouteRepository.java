package com.hvdesai.pmplroutefinder.repository;

import com.hvdesai.pmplroutefinder.entities.Bus;
import com.hvdesai.pmplroutefinder.entities.BusRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRouteRepository extends JpaRepository<BusRoute, Long > {

    List<BusRoute> findAll();

}
