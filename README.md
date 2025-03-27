# Selenium Test Automation Framework (TestNG + Cucumber)

## Overview

This project is a Selenium-based test automation framework using **TestNG** and **Cucumber** for behavior-driven development (BDD). It also integrates **Allure Reporting** for test results visualization.

## Prerequisites

Ensure you have the following installed:

- **Java JDK (8 or higher)**
- **Maven**
- **TestNG Plugin (if using Eclipse/IntelliJ IDEA)**
- **Allure CLI** (for generating reports)

## Installation

1. Clone this repository:
   ```sh
   git clone <repository-url>
   cd Selenium_Cucumber_TestNG_Project
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```

## Running Tests

To execute the tests, run:

```sh
mvn test
```

Alternatively, run specific test suites using TestNG:

```sh
mvn test -DsuiteXmlFile=testng.xml
```

## Generating Allure Reports

1. Execute the tests first (`mvn test`).
2. Generate the Allure report:
   ```sh
   allure serve target/allure-results
   ```

## Project Structure

```
Selenium_Cucumber_TestNG_Project/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── yourpackage/
│   │   │           ├── base/
│   │   │           ├── pages/
│   │   │           ├── utils/
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── yourpackage/
│   │   │           ├── stepDefinitions/
│   │   │           ├── runners/
│   │   │           ├── hooks/
│   │   │           ├── testcases/
│── features/
│   ├── login.feature
│   ├── search.feature
│── test-output/
│── pom.xml
│── README.md

```

## Contributing

Feel free to fork this project and submit pull requests with improvements.

## License

This project is licensed under the MIT License.


