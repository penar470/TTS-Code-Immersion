package com.luis.tts.WeatherApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.luis.tts.WeatherApp.model.Response;
import com.luis.tts.WeatherApp.model.ZipCode;
import com.luis.tts.WeatherApp.repository.ZipCodeRepository;



@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;
    
    @Autowired
    private ZipCodeRepository zipCodeRepository;
    
    public Response getForecast(String zipCode) {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + 
            zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();  
    try {
		ZipCode zipcode = new ZipCode();
		zipcode.setZipCode(zipCode);
		zipCodeRepository.save(zipcode);
		return restTemplate.getForObject(url, Response.class);
    }
    catch (HttpClientErrorException ex) {
        Response response = new Response();
        response.setName("error");
        return response;
    }
    }
}
    
