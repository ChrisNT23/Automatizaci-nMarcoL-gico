# SNP v1 Testing Framework

This framework was implemented for the automation of the screens necessary to create a project

### Dependencies

* [TestNG](https://testng.org/) - A testing framework inspired by JUnit and NUnit. This framework uses version 7.14.1.

  TestNG is chosen for its powerful testing capabilities, including parallel test execution, flexible test configuration, and comprehensive test reporting.

* [Cucumber](https://cucumber.io/) - A tool for running automated tests written in natural language. This framework uses version 7.14.1.

  Cucumber is employed to enable behavior-driven development (BDD) practices, making test scenarios readable and accessible to non-technical stakeholders.

* [Log4j](https://logging.apache.org/log4j/) - A logging library for Java. This framework uses version 3.0.0-alpha1.

  Log4j is utilized for efficient and configurable logging, providing insights into test execution and debugging.

* [slf4j](https://www.slf4j.org/) - A simple logging facade for Java. This framework uses version 2.0.9.

  SLF4J serves as a logging abstraction, allowing for flexibility in choosing different logging implementations. It integrates seamlessly with Log4j in this framework.

* [Selenium](https://www.selenium.dev/) - A suite of tools for browser automation. This framework uses version 4.15.0.

  Selenium is the core automation tool, enabling interaction with web elements, browser control, and execution of test scripts across different browsers.

## Getting Started

Before to run this project you need the following tools installed on your machine:

* [Git](https://git-scm.com/)
* [Java](https://www.java.com/) _version >= 17_
* An IDE (e.g. [IntelliJ IDEA](https://www.jetbrains.com/idea/))

Clone the repository and open it in your IDE.

Switch to the development branch using the following command:

```
$ git checkout develop
```

### Properties configuration

Edit the file `environment.properties` with the required information (URL, credentials, etc.), following the example file `environment.properties.example`

Edit the file `web-driver.properties` with the required information (times in milliseconds), following the example file `web-driver.properties.example`

Edit the file `file.properties` with the required information (paths of the files that will be used), following the example file `file.properties.example`

## Project Structure

- `src/test/java/resources/features`: Contains the files where the scenarios for creating projects are located (.feature files)
- `src/main/java`: Contains the configurations to read the properties files, the Page Object Model classes, entities and the utils

### Run the project

To run the tests with a specific tag, use the following command template where all the variables will be explained:

```
$ ./gradlew clean executeFeatures -PcucumberOptions="@Tag" -PenvId="Environment" -Pbrowser="Browser"
```

Where:

- @Tag will be replaced with the tag in the .feature file of the scenario to be executed (e.g., @CreateProject).
- Environment will be replaced with the environment where the project will be executed (dev, qa, or pre).
- Browser will be replaced with the browser where the project will be executed (chrome or edge).

For example if we want to run the project to create a project in the DEV environment and with the Chrome browser

The command with the variables replaced will look like this:

```
$ ./gradlew clean executeFeatures -PcucumberOptions="@CreateProject" -PenvId="dev" -Pbrowser="chrome"
```
