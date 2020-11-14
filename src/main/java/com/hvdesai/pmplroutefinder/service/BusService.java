package com.hvdesai.pmplroutefinder.service;

import com.hvdesai.pmplroutefinder.entities.Bus;
import com.hvdesai.pmplroutefinder.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusService {

    @Autowired
    BusRepository busRepository;

    public List<Bus> getAll(String busSearch){
        List<Bus> busList = new ArrayList<>();
        try {
            busList = busRepository.getAll(busSearch);
        }catch (Exception ex){
            throw ex;
        }
        return busList;
    }
}
