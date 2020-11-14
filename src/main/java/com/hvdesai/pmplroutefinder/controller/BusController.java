package com.hvdesai.pmplroutefinder.controller;

import com.hvdesai.pmplroutefinder.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class BusController {

    @Autowired
    BusService busService;

    @GetMapping("/getAll")
    public ModelAndView getBusList(@RequestParam("busSearch") String busName){
        ModelAndView mv = new ModelAndView();
        mv.addObject("busList",busService.getAll(busName));
        mv.setViewName("main");
        return mv;
    }

}
