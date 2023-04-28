# User Oriented Tests on OrangeHRM Page

Series of tests simulating a user selecting various options on the website.

## Description

The project consists of 10-20 cases executed with TestNG, which represent user interactions with the website. Souch interactions include:

* Logging in (with one and two browsers in parallel)
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

## Getting Started

### Dependencies

* Windows 10
* Maven latest version
* Java 8 or newest
* Selenium libraries
* Testng
* Eclipse IDE

### Executing a login with two browsers in parallel

* Run cmd
* Go to project folder
* Type "mvn test -Dsurefire.suiteXmlFiles=testng.xml"
* A screenshot of the result is stored in "Test Screenshots" folder
* A report is created in "Testing\target\surfire-reports" named "emailable-report.html"