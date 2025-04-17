# Stock Price Viewer

This is a Spring Boot web application for viewing real-time stock prices and historical trends of Taiwanese stocks. The application uses the Finnhub API to fetch stock data.

## Features
- Input a stock symbol to view its real-time price.
- Toggle between dark mode and light mode.
- Responsive and visually appealing UI built with Bootstrap 5 and FontAwesome.

## Prerequisites
- Java 17 or later
- Maven

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd <project-directory>
   ```
3. Replace `YOUR_API_KEY` in `StockPriceWebApplication.java` with your Finnhub API key. You can obtain an API key by signing up at [Finnhub](https://finnhub.io/).

## Running the Application
1. Build the project:
   ```bash
   mvn clean install
   ```
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```
3. Open your browser and navigate to `http://localhost:8080`.

## Testing
- To run unit tests:
  ```bash
  mvn test
  ```

## Dependencies
- Spring Boot
- Thymeleaf
- OkHttp (for API integration)
- Bootstrap 5 (via jsDelivr CDN)
- FontAwesome (via jsDelivr CDN)

## Notes
- This application does not use a database; all data is fetched in real-time from the Finnhub API.
- Ensure you have a stable internet connection to fetch stock data.

## License
This project is licensed under the MIT License.