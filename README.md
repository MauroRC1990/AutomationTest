# User Oriented Tests on OrangeHRM Page

Series of tests simulating a user selecting various options on the website.

## Description

The project consists of 10-20 cases executed with TestNG, which represent user interactions with the website. Souch interactions include:

* Logging in (with one and two browsers in parallel and choosing a browser)
* Logging out
* Adding an employee
* Removing an employee
* Editing an employee's information
    * Personal Details
    * Contact Details
    * Dependents
    * Emergency Contacts
    * Job
    * Qualifications
* Adding custom options to forms
* Adding skills
* Adding termination reasons
* Post in newsfeed
* Remove the post from newsfeed
* Search for an employee and not found
* RestAssured test for an Ok return value
* RestAssured test for a list of values return

## Getting Started

### Dependencies

* Maven latest version
* Java 11 or newest
* Selenium libraries
* TestNG
* Eclipse IDE
* Commons-io
* Io.rest-assured

### Executing a login test case with two browsers in parallel

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=TwoBrowserLogin.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing a login test case choosing which browser to use

* Run cmd
* Go to project folder
* Type "mvn test -DBrowser=Firefox -Dsurefire.suiteXmlFiles=ChooseBrowserLogin.xml"
    * Indicate in "-DBrowser=" which browser you want to run the test with, Firefox or Chrome respectively
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing a login and logout test case

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=LoginAndLogout.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing a new custom field, termination reason, skill, employee and newsfeed post test case

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=NewEmployeeAndFields.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing a new custom field, termination reason, skill, two employees and newsfeed post test case

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=NewEmployeesAndFields.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing a deletion of custom field, termination reason, skill, employee and newsfeed post test case

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=DeleteEmployeeAndFields.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing a deletion of custom field, termination reason, skill, employees and newsfeed post test case

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=DeleteEmployeesAndFields.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing two new employees in different browsers in parallel test case

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=TwoNewEmployeesCreation.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing deleting two employees in different browsers in parallel test case

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=DeleteTwoEmployees.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing search for an employee and not finding it test case

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=EmployeeSearchNotFound.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

### Executing four test cases of edit admin in two browsers in parallel

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=EditAdmin.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

# REST Assured Tests

## Test 1

Send a request to a demo website and return an OK response

### Steps

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=RestAssuredReturnOk.xml"
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

## Test 2

Send a request to a demo website and return a list of values

### Steps

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=RestAssuredReturnList.xml"
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

# Appium Tests

## Calculator multiplication and division

Multiply 2 by 2 then divide it by 2

### Steps

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=CelCalculator.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"

