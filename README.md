
# Student Management System

This will allow you to add new students to your database. This feature will allow you to input all the necessary information such first name, last name and email address. As well as it provides the feature to modify student details and delete a student.

## Project Structure
* [main/](.\src\main)
  * [java/](.\src\main\java)
    * [com/](.\src\main\java\com)
      * [example/](.\src\main\java\com\example)
        * [sms/](.\src\main\java\com\example\sms)
  * [resources/](.\src\main\resources)
    * [static/](.\src\main\resources\static)
      * [styles/](.\src\main\resources\static\styles)
        * [css/](.\src\main\resources\static\styles\css)
    * [templates/](.\src\main\resources\templates)
      * [edit_student.html](.\src\main\resources\templates\edit_student.html)
      * [studentadd.html](.\src\main\resources\templates\studentadd.html)
      * [students.html](.\src\main\resources\templates\students.html)
    * [application.properties](.\src\main\resources\application.properties)
* [test/](.\src\test)
  * [java/](.\src\test\java)
    * [com/](.\src\test\java\com)
      * [example/](.\src\test\java\com\example)
        * [sms/](.\src\test\java\com\example\sms)
 
## Installation

Download the zip file.

In application properties change the properties as per your requirement:
spring.datasource.url=jdbc:mysql://{HOST_NAME}:{PORT}/{DATABASE_NAME}
spring.datasource.username={DATABASE_USER_NAME}
spring.datasource.password={DATABASE_USER_PASSWORD}

    
## Lessons Learned

I have acquired valuable knowledge and skills in using the Thymeleaf engine with Spring Boot projects. This has allowed me to efficiently design HTML pages using the Bootstrap framework. Additionally, I have explored various modules of the Spring MVC framework, such as Model and ModelAttribute. These modules have enabled me to display data on HTML pages and retrieve data from HTML pages to store it into the database seamlessly.

By incorporating Thymeleaf into the Student Management System, we can enhance the user experience by creating dynamic and interactive web pages. The integration of Thymeleaf with Spring Boot also ensures easier maintenance and scalability of the application.



## Tech Stack

**Framework:** Spring Boot

**Database:** MySQL

**Front-End:** Thymeleaf Engine

