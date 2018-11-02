package com.codegym.things.controller;

import com.codegym.things.model.Thing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/thing"})
public class ThingController {
    @GetMapping
    String showCreatePage(Model model){
        model.addAttribute("thing",new Thing());
        return "create";
    }

    @PostMapping
    String createThing(){
        return "create";
    }
}
