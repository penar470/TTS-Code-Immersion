package com.luis.tts.WeatherApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.luis.tts.WeatherApp.model.Request;
import com.luis.tts.WeatherApp.model.Response;
import com.luis.tts.WeatherApp.service.WeatherService;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;
    
    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("request", new Request());  
        return "index";
    }
    
    @PostMapping
    public String postIndex(Request request, Model model) {
        Response data = weatherService.getForecast(request.getZipCode());
        model.addAttribute("data", data);
        return "index";
    }
}
