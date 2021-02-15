# Program Organization

The architecture for this project consists of a robotic boxing dummy as well as the Deffensive Unlearned Machine(DUM) web application we will be developing in this course.

### Context Diagram
The context diagram displays the relationship between the user, our DUM system and our robot.
![image](https://user-images.githubusercontent.com/78665808/107889326-bb0ebe00-6edf-11eb-8eff-2bc0f5b9a003.png)

### Container Diagram
The Container diagram shows the high-level shape of the software architecture and how responsibilities are distributed across it. It also shows the major technology choices and how the containers communicate with one another.
![image](https://user-images.githubusercontent.com/78665808/107889314-b1855600-6edf-11eb-9c50-bfac1f7035ae.png)

### Component Diagram
The Component diagram shows how a container is made up of a number of "components", what each of those components are, their responsibilities and the technology/implementation details.
![image](https://user-images.githubusercontent.com/78665808/107889319-b5b17380-6edf-11eb-8f8a-87cca10c0d9b.png)

[Table Relation](https://user-images.githubusercontent.com/65682018/107891603-bc46e780-6eed-11eb-8137-9fb881f395f1.png)

# Code Design

You should have your UML Class diagram and any other useful UML diagrams in this section. Each diagram should be accompanied by a brief description explaining what the elements are and why they are in the diagram. For your class diagram, you must also include a table that relates each class to one or more user stories. 

![Class Diagram](https://user-images.githubusercontent.com/78665808/107888831-d0ceb400-6edc-11eb-85be-ba46de9b8178.png)

[Table Relation](https://user-images.githubusercontent.com/78665808/107889256-518eaf80-6edf-11eb-8a10-918a9f320cdf.png)


# Data Design
The data from users will store in database to help to train AI to improve recognize fist better and number of punches.

If you are using a database, you should have a basic Entity Relationship Diagram (ERD) in this section. This diagram should describe the tables in your database and their relationship to one another (especially primary/foreign keys), including the columns within each table. 

See Code Complete, Chapter 3

# Business Rules

You should list the assumptions, rules, and guidelines from external sources that are impacting your program design. 

See Code Complete, Chapter 3

# User Interface Design
Login Page

![UI3](https://user-images.githubusercontent.com/69992661/107888549-eb079280-6eda-11eb-8a01-35c3f029b9a1.PNG)

User Interface

![UI](https://user-images.githubusercontent.com/69992661/107888546-e80ca200-6eda-11eb-837c-9c1ebcb3029d.png)

Board

![UI2](https://user-images.githubusercontent.com/69992661/107888547-e9d66580-6eda-11eb-84f3-b2839d5e7c93.png)

You should have one or more user interface screens in this section. Each screen should be accompanied by an explaination of the screens purpose and how the user will interact with it. You should relate each screen to one another as the user transitions through the states of your application. You should also have a table that relates each window or component to the support using stories. 

See Code Complete, Chapter 3

# Resource Management

Our resource mangement mainly revolves around our budget for building the actual punching bag robot. We've allocated most of our funds at this point towards parts. Other resources that regard crashing and overwhelming our app have not been decided yet as we are still in the early developmental days. 

# Security
Security of our project mainly focuses on the usernames and passwords we're going to be storing for the login of each of our customers. We're looking toward basic, if any at all, encrpytion because all of this information will be stored locally with the user. 

# Performance

This a simple app that won't depend on much user input and has a predictable responses. Because of this, we're not expecting much extremes with performance. 

# Scalability

It's possible that DUM could become a sensation, but even so, all user data will continue to be stored locally. The only updates that we need to make would be to our website to possibly update the severs and prevent crashes if serveral hundred people want to connect at once. Another issues with scalability is if we need to make more DUM robots for more people, in which case our budget will need a dramatic change. 

# Interoperability

Senors in DUM will relay force of punches and number of hit punches to the application software. The application software will tell DUM what kind of workout the user has selected. 

# Internationalization/Localization

See Code Complete, Chapter 3

# Input/Output

See Code Complete, Chapter 3

# Error Processing

See Code Complete, Chapter 3

# Fault Tolerance

See Code Complete, Chapter 3

# Architectural Feasibility

See Code Complete, Chapter 3

# Overengineering

See Code Complete, Chapter 3

# Build-vs-Buy Decisions

This section should list the third party libraries your system is using and describe what those libraries are being used for.

See Code Complete, Chapter 3

# Reuse

See Code Complete, Chapter 3

# Change Strategy

See Code Complete, Chapter 3
