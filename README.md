# Share Monitoring Service
This service allows you to view the status of shares of many companies on most well-known stock exchanges.

## Tech Stack
- Java 17
- Spring Boot
- Maven

## Getting Started
To get started with this project, you need to create your own API key. You should sign up for an API key [here]((https://site.financialmodelingprep.com/developer/docs)).

## Technologies Used
- Java 17
- Spring Boot
- Maven

## Installation
1. Clone the repository
2. Create an application.properties file and add in the file your local port and api-key:
```properties
apikey=YOUR_API_KEY_HERE
```
3. Build the project and run the application


## API Endpoints
---
### Get information about shares of company
#### Request
* Structure:
`(http://localhost:8089/api/v1/sharesapp/share?symbol={COMPANY_SYMBOL})`

* Example:
`http://localhost:8089/api/v1/sharesapp/share?symbol=AAPL`
#### JSON response
```JSON
{
    "prevClose": 169.0,
    "high": 173.7,
    "low": 168.94,
    "open": 169.0,
    "lastSalePrice": 170.73,
    "lastUpdated": "2024-03-11T10:43:51.461+0000",
    "symbol": "AAPL"
}
```
### Find company symbol by company name
#### Request
* Structure:
`(http://localhost:8089/api/v1/sharesapp/find?query={COMPANY_NAME})`

* Example:
`http://localhost:8089/api/v1/sharesapp/share?symbol=AAPL`
#### JSON response
```JSON
[
    {
        "symbol": "TSLA.NE",
        "name": "Tesla, Inc.",
        "currency": "CAD",
        "stockExchange": "NEO"
    },
    {
        "symbol": "TSLA",
        "name": "Tesla, Inc.",
        "currency": "USD",
        "stockExchange": "NASDAQ Global Select"
    },
    {
        "symbol": "TL0.DE",
        "name": "Tesla, Inc.",
        "currency": "EUR",
        "stockExchange": "Frankfurt Stock Exchange"
    }
]
```
---
