package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

   @Autowired
   private WeatherService weatherService;

   @GetMapping("/forecast/{cityName}")
   public String getForecastSummary(@PathVariable String cityName) throws IOException {
       return weatherService.getForecastSummary(cityName);
   }

   @GetMapping("/forecast/hourly/{cityName}")
   public String getHourlyForecast(@PathVariable String cityName) throws IOException {
       return weatherService.getHourlyForecast(cityName);
   }
}
