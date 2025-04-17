package com.example.stockpriceweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@SpringBootApplication
@RestController
public class StockPriceWebApplication {

    // OkHttpClient instance for making API requests
    private final OkHttpClient httpClient = new OkHttpClient();
    
    @Value("${spring.finnhub.api-key}")
    private String apiKey;

    public static void main(String[] args) {
        SpringApplication.run(StockPriceWebApplication.class, args);
    }

    /**
     * Endpoint to fetch real-time stock price for a given stock symbol.
     * @param symbol The stock symbol (e.g., "2330" for TSMC).
     * @return The real-time stock price as a String.
     */
    @GetMapping("/stock-price")
    public String getStockPrice(@RequestParam String symbol) {
        String url = "https://finnhub.io/api/v1/quote?symbol=" + symbol + "&token=" + apiKey;

        try {
            Request request = new Request.Builder().url(url).build();
            Response response = httpClient.newCall(request).execute();

            System.out.println("API URL: " + url.replace(apiKey, "API_KEY_HIDDEN")); // Log the API URL for debugging without exposing the API key
            System.out.println("HTTP Status Code: " + response.code()); // Log the HTTP status code
            System.out.println("Response Message: " + response.message()); // Log the response message

            if (response.isSuccessful() && response.body() != null) {
                String responseBody = response.body().string();
                System.out.println("API Response: " + responseBody); // Log the API response for debugging
                return responseBody;
            } else {
                System.out.println("API Error: " + response.message()); // Log the error message
                return "Error fetching stock price: " + response.message();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage()); // Log the exception
            return "Exception occurred: " + e.getMessage();
        }
    }
}
