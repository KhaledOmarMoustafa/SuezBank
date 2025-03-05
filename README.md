# SuezBank Automation Project

## Overview
This project is a test automation framework for the SuezBank application. It automates main functionalities using Selenium WebDriver with Java, TestNG for test execution.

## Tools & Technologies Used
- **Java** - Primary programming language
- **Selenium WebDriver** - UI automation framework
- **TestNG** - Test execution framework
- **Maven** - Dependency and build management
-**JsonFetcher** - Fetches test data from JSON

## Project Structure
```
SuezBank/
├── pom.xml                # Maven configuration file
├── testng.xml             # TestNG test suite configuration
├── src/
│   ├── main/java/org/example/
│   │   ├── App.java       # Main application entry point
│   ├── test/java/org/example/
│   │   ├── AddingProducts.java  # Adds products to cart
│   │   ├── AppTest.java         # General application tests
│   │   ├── CheckCart.java       # Cart verification
│   │   ├── CheckOut.java        # Checkout process validation
│   │   ├── JsonFetcher.java     # Fetches test data from JSON
│   │   ├── Login.java           # Login test cases
│   │   ├── LogOut.java          # Logout test cases
│   │   ├── PreRequisites.java   # Sets up test prerequisites
│   │   ├── SortOrder.java       # Sorting validation
```

## Setup & Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/your-username/SuezBank.git
   cd SuezBank
   ```
2. **Install dependencies:**
   ```sh
   mvn clean install
   ```
   
## Running the Tests
- **Run all tests:**
  ```sh
  mvn test
  ```
- **Run specific test suite:**
  ```sh
  mvn test -Dtest=Login
  ```
- **Execute TestNG suite:**
  ```sh
  mvn surefire:test
  ```

## Reporting & Logs
- Test execution results are stored in `test-output/`

## Contribution
Feel free to contribute by creating pull requests, reporting issues, or suggesting improvements.

## License
This project is licensed under the MIT License.

