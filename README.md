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
3. Configure your Finnhub API key:
   - Sign up for a free API key at [Finnhub](https://finnhub.io/)
   - Open `src/main/resources/application.properties`
   - Replace `YOUR_API_KEY_HERE` with your actual Finnhub API key:
     ```properties
     spring.finnhub.api-key=your_actual_api_key_here
     ```

## Running the Application
1. Build the project:
   ```bash
   mvn clean install
   ```
2. Run the application:
   ```bash
   mvn spring-boot:run
   ```
   - For hot-reload during development:
     ```bash
     mvn spring-boot:run
     ```
     (Spring Boot DevTools will automatically reload changes)
3. Open your browser and navigate to `http://localhost:8080`.

## Usage
1. Enter a Taiwan stock symbol (e.g., 2330 for TSMC) in the input field.
2. Click "Get Price" to fetch the real-time stock price.
3. Toggle between light and dark mode using the button in the top-right corner.

## Testing
- To run unit tests:
  ```bash
  mvn test
  ```

## Dependencies
- Spring Boot (backend framework)
- Spring Boot DevTools (for development hot-reload)
- Thymeleaf (templating engine)
- OkHttp (for API integration)
- Bootstrap 5 (via jsDelivr CDN)
- FontAwesome (via jsDelivr CDN)

## Security Best Practices
- Never commit your API key to version control
- The application is configured to read the API key from application.properties
- For production, consider using environment variables or a secure vault

## Troubleshooting
- If you get a 403 error, verify your API key is valid
- Finnhub may have rate limitations for free accounts
- Ensure you're using the correct stock symbol format (Taiwan stocks use the .TW suffix automatically)

## Notes
- This application does not use a database; all data is fetched in real-time from the Finnhub API.
- Ensure you have a stable internet connection to fetch stock data.

## License
This project is licensed under the MIT License.