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

[Relating Classes to User Stories](https://docs.google.com/document/d/104ntwLHLAIDE2Dc1h5k9u5RtVSRjRCnS90BPfABrU90/edit?usp=sharing)

[Description of Major Classes](https://docs.google.com/document/d/1sYYbEsj3f-v5YtDeIM7FKj2CtW1EGNwJDpsY7CS7g9A/edit?usp=sharing)


# Data Design
The data from users will store in database to help to train AI to improve recognize fist better and number of punches.

ER Diagram

![ER](https://user-images.githubusercontent.com/70419905/107903852-4ad05e80-6f18-11eb-9b52-c599fde36e68.jpg)


# Business Rules

You should list the assumptions, rules, and guidelines from external sources that are impacting your program design. 

See Code Complete, Chapter 3

# User Interface Design
Login Page

![UI3](https://user-images.githubusercontent.com/69992661/107888549-eb079280-6eda-11eb-8a01-35c3f029b9a1.PNG)

Just a basic login page that will allow user's to have personalized data reported back to them
User Interface

![UI](https://user-images.githubusercontent.com/69992661/107888546-e80ca200-6eda-11eb-837c-9c1ebcb3029d.png)

This is the tentaive main menu user's will see when they login. History will allows user to see how many workouts they,ve done and specific stats such as type and number of punches thrown for every workout. The preselected workout are set currently at 2 difficulties, training and proffesional. To access free workouts, the user would click "custom workouts" and be able to set a speed and difuculty from there. Also by hitting "connect" users can find direction on how to correctly set up their dummy.

This directly relates to user story #9:
"have a website or app where customers or people, that are interested in our product, to find all the information and guides they need to correctly operate our product."

![UI2](https://user-images.githubusercontent.com/69992661/107888547-e9d66580-6eda-11eb-84f3-b2839d5e7c93.png)

This is the interface user's will see during a custom workout. They can see a few stats live such as hit rate, number of punches thrown and time of workout. They can also change the difficulty of the custom workout without having to restart.
This directly relates to user story #8 which states:
"users will be able to change different kinds of workouts and the intensity. As well as keeping track of statistical data."
 

# Resource Management
Our resource mangement mainly revolves around our budget for building the actual punching bag robot. We've allocated most of our funds at this point towards parts. Other resources that regard crashing and overwhelming our app have not been decided yet as we are still in the early developmental days. 

# Security
Security isn't applicable to our project because we're not storing any user information beyond a simple username and password. 
Security of our project mainly focuses on the usernames and passwords we're going to be storing for the login of each of our customers. We're looking toward basic, if any at all, encrpytion because all of this information will be stored locally with the user. 

# Performance
This a simple app that won't depend on much user input and has a predictable responses. Because of this, we're not expecting much extremes with performance. 

# Scalability
It's possible that DUM could become a sensation, but even so, all user data will continue to be stored locally. The only updates that we need to make would be to our website to possibly update the severs and prevent crashes if serveral hundred people want to connect at once. Another issues with scalability is if we need to make more DUM robots for more people, in which case our budget will need a dramatic change. 

# Interoperability
Senors in DUM will relay force of punches and number of hit punches to the application software. The application software will tell DUM what kind of workout the user has selected. 

# Internationalization/Localization

For this product the internationalization and localization will be focused on accurate translation on whichever language the market sees interest in. The text and audio cues will be changed appropriately.
Since our product is mainly focused on physical activities not much needs to be done for these processes.

# Input/Output

The inputs will mainly be the force that the user transfers over to the product. The outputs will consist of statistical observations such as: number of hits, PSI behind the hit, direction of hit, and the kind of hit.

# Error Processing

The product will display a message or inititiate a reset if a hit has not been detected within a certain amount of time. 
If the system crashes or fails a message will be displayed with an error code and a brief description about the issue that was encountered.


# Fault Tolerance

The different modes, whether that be custom or preselected workouts, will all be programmed separately and will not depend on eachother in any way. Since they have no connection to one another if part of the program fails the other modes and features will still work correctly.

# Architectural Feasibility

The system for this project is technically feasible. The robot will be able to move and operate fast enough to respond to the user. By using libraries such as Java Machine Learning Library we will also have the capacity to solve the AI problems in this project.

# Overengineering

This group has decided against overengineering code in favor of finding the simplest and most efficient solution to the problem. We decided on this approach because we believe it is the most effective way to complete this project.

# Build-vs-Buy Decisions

Since the robotic dummy will be using artificial intelligence to track analyze the user's movement, we decided that it would be beneficial to use an AI library. We have decided on using Java Machine Learning Library (Java-ML).

# Reuse

This project will not be reusing any preexisiting softwaretest cases, data formats, or other materials. Therefore we do not have to consider how reused code will conform.

# Change Strategy

Throughout the course of any project changes should be expected. To handle future changes, this group will be using table-driven technique for the test cases as opposed to hard coded if tests. Data that would otherwise be hard coded will instead be put in an external file.
