# Selise QA Assessment


## Tools & technology used:
- **Test Framework Suite:** Selenium
- **Testing Framework:** TestNG
- **Programming Language:** Java
- **IDE:** IntelliJ IDEA
- **Build tool:** Gradle

## Purpose of choosing Selenium:
- **Web Automation Leader:** Selenium is one of the most widely used frameworks for web automation, providing robust support for multiple browsers and platforms.
- **Cross-Browser Testing:** Supports most modern browsers like Chrome, Firefox, Safari, and Edge.
- **Community and Support:** Extensive community resources, documentation, and active development.
- **Integration-Friendly:** Easily integrates with test frameworks (like TestNG), CI/CD pipelines, and reporting tools.

## Prerequisite:
1. Need to install **JDK** and configure it into Environment variable
2. Download **Gradle** and configure it into the Environment variable also

## Run the automation script:
1. Open the project with **IntelliJ IDEA** by clicking on **build.gradle**
2. Let the **IntelliJ IDEA** to download the dependencies for the first run
3. After dependencies are downloaded and the project loaded successfully, click on **Terminal** from the bottom left bar
4. Type in the terminal:

```bash
gradle clean test
```
5. Selenium will open the browser and start the automation.
6. To view the report of the automation execution, expand the **build -> reports -> tests** folder and open "index.html" in a browser
![image](https://github.com/user-attachments/assets/c44a0057-79d7-415d-9318-9f7a1a4731a2)
