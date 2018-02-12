# Funding
An Integration test implementation example

## Software I depended on while building this example:
- IntelliJ
- Spring-boot
- JDK1.8

## Steps that I followed in building this example:
- Created a simple spring-boot application at https://github.com/kadirisani/Funding.git with artifact name as 'Funding' with the dependencies of Web and DevTools.
- Loaded the Funding application on to IntelliJ IDE.
- Updated the pom.xml with the Fluentlenium related properties and dependencies.
- Downloaded the chromedriver.exe from https://sites.google.com/a/chromium.org/chromedriver/downloads and saved it under src/test/drivers
- In the sample test, overridden the default webdriver with chrome driver.
- The Fluentlenium API is available in FluentAdapter.class
- To run the test from command prompt, use this command: mvnw test
