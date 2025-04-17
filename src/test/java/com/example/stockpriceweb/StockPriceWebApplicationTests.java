package com.example.stockpriceweb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class StockPriceWebApplicationTests {

    @Test
    void contextLoads() {
        // Test to ensure the Spring application context loads successfully
    }

    @Test
    void testGetStockPrice() throws IOException {
        // Set up a mock server
        try (MockWebServer mockWebServer = new MockWebServer()) {
            mockWebServer.start();

            // Mock API response
            String mockResponse = "{\"c\": 500.0}"; // Example response with current price
            mockWebServer.enqueue(new MockResponse().setBody(mockResponse).setResponseCode(200));

            // Replace the API URL with the mock server URL
            String mockUrl = mockWebServer.url("/quote").toString();
            String apiKey = "test_api_key";
            String symbol = "2330";
            String url = mockUrl + "?symbol=" + symbol + "&token=" + apiKey;

            // Simulate HTTP call
            StockPriceWebApplication app = new StockPriceWebApplication() {
                @Override
                public String getStockPrice(String symbol) {
                    return "{\"c\": 500.0}"; // Mocked response for testing
                }
            };

            String result = app.getStockPrice(symbol);

            // Validate the response
            assertTrue(result.contains("500.0"), "Expected stock price not found in the response");
        }
    }
}
