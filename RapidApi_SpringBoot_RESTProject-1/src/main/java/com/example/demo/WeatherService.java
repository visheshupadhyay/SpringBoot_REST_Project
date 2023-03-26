package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class WeatherService {

   @Value("${weather.api.url}")
   private String apiUrl;

   @Value("${weather.api.key}")
   private String apiKey;

   @Value("${weather.api.host}")
   private String apiHost;

   public String getForecastSummary(String cityName) throws IOException {
       String url = apiUrl + "rapidapi/forecast/" + cityName +"/summary/";
       Request request = new Request.Builder()
               .url(url)
               .get()
               .addHeader("X-RapidAPI-Key", apiKey)
               .addHeader("X-RapidAPI-Host", apiHost)
               .build();
       OkHttpClient client = new OkHttpClient();
       Response response = client.newCall(request).execute();
       return response.body().string();
   }

   public String getHourlyForecast(String cityName) throws IOException {
	   String url = apiUrl + "rapidapi/forecast/" + cityName +"/hourly/";
       Request request = new Request.Builder()
               .url(url)
               .get()
               .addHeader("X-RapidAPI-Key", apiKey)
               .addHeader("X-RapidAPI-Host", apiHost)
               .build();
       OkHttpClient client = new OkHttpClient();
       Response response = client.newCall(request).execute();
       return response.body().string();
   }
}
