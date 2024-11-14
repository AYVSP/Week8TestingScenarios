# WeekTaskSubmission

**Sol 1**: concepts of Continuous Integration (CI) and Continuous Testing (CT). Using real world scenario as discussed in class to illustrate
importance of CI/CT in improving software quality and efficiency.

Summary of CI and CT Concepts:
Continuous Integration (CI)
CI is a development practice where developers frequently integrate code into a shared repository, usually multiple times a day. The primary goal is to detect issues early in the development cycle. Each code commit triggers automated builds and tests to ensure the new changes don’t break the application.

Core Concepts:
Frequent Integration: Teams commit code often, avoiding "integration hell."
Automated Testing: Runs tests after every commit to catch errors early.
Immediate Feedback: Developers get quick feedback, allowing them to address issues right away.

Continuous Testing (CT)
Continuous Testing extends the concept of CI by ensuring that automated tests cover every stage of the development process, providing feedback on the software’s health continuously.
This improves quality by catching potential issues sooner and ensures that code is always in a deployable state.

Core Concepts:
Testing Throughout the Development Pipeline: CT includes unit tests, integration tests, UI tests, etc., covering each code change from start to finish.
Quality Assurance Automation: Automated QA ensures consistent and reliable feedback.
Risk Mitigation: Early detection reduces the risk of deploying faulty code to production.

Real-World Examples as discussed in class:
 1: CI in GitHub Projects - Many companies use GitHub Actions to automatically test code upon each pull request, verifying that code meets quality standards before merging.
2: Facebook’s use of CT to identify User Interface issues across multiple devices, ensuring each new feature works as intended.

Importance CI/CT:
Improves Software Quality: Continuous testing keeps quality high and consistent.
Increases Efficiency: CI/CD reduces time spent on bug fixes and manual testing, freeing developers to focus on adding new features.

**Sol 2**
Test Script for Prestashop Form Registration Module, Focused on name, email and password fields

1. Test Cases for Prestashop Registration Form - which focuses on name, email, and password fields.

 Table of Contents
- [Project Structure](project-structure)
- [Requirements](requirements)
- [Setup Instructions](setup-instructions)
- [Execution Instructions](execution-instructions)
- [Testing Instructions](testing-instructions)


Project Structure

- testCaseAssessment (Manual)-cases.md - Contains the test cases for registration form.
- Regression Test Approach for Code Updates.md - Describes the approach to regression testing on the checkout feature.
- src/test/java/RegistrationFormTest.java - Automated Selenium test script for testing the registration form fields.
- README.md - Instructions to set up, execute, and test the solutions.

Requirements

To run and test these solutions, the following must be installed:

- Java JDK (version 11 or above)
- Maven (for dependency management)
- ChromeDriver** (compatible with the version of Chrome installed)
- IntelliJ IDEA (or any other preferred Java IDE)

Setup Instructions

1. Clone the Repository
   ```bash
   cd repo-name
  

2. Install Dependencies
   - This project uses Maven for dependency management. Ensure Maven is installed, then run:
     ```bash
     mvn clean install
     ```
   - This will download and set up the necessary dependencies, including Selenium WebDriver.

3. Setup ChromeDriver
   - Download the ChromeDriver that matches your Chrome browser version from [ChromeDriver downloads](https://sites.google.com/chromium.org/driver/).
   - Update the path in `src/test/java/RegistrationFormTest.java`:
     ```java
     System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
     

Execution Instructions

1. Run Automated Tests
   - To execute the automated Selenium tests for the registration form, run:
     ```bash
     mvn test
     ```

2. View Test Output
   - Test results will be displayed in the console or can be viewed in your IDE’s test output window.
     

Testing Instructions

1. Test Cases for the Registration Form
   - Test cases are documented in `test-cases.md`.
   - Open `test-cases.md` to review each test case, including the fields for:
     - Name
     - Email
     - Password
   - The document contains detailed scenarios with expected results and steps for manual testing.


Additional Notes

- Test Environment: Ensure the browser and ChromeDriver versions are compatible. Incompatibility may lead to test failures.
- Customizing the Test: You can adjust the test data for registration fields directly in `RegistrationFormTest.java` if needed.

For any issues or questions, please contact the repository maintainer.


This `README.md` provides a structured guide to understanding and executing the solutions to week8 3MTT QA assessments effectively.























These activity is done to carryout negative, positive and edge cases tests
the requirement is to test a Registration form, with focus on Name, Email and password fields respectively.
So i worked on testing positive, negative and edge cases for each of the web elements
