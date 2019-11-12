AKQA Guidelines:-

The framework is developed on Eclipse IDE with Selenium Webdriver and TestNG, written in Java language.

1.	Prerequisite-

•	Java 1.8
•	Eclipse IDE
•	Selenium WebDriver jar files
•	TestNG jar files
•	Chrome 78 version (Driver for this particular version is added in framework)
•	Either Mac OS/ Windows

2.	Execution Steps-

•	Once you download the project from GitHub, configure project with selenium and TestNG jar files. 
•	Selenium Jar - Go to Java Build Path in project properties and add external jars files in libraries tab
•	TestNG – Either install it from Eclipse Marketplace or from Install New Software under Window Tab in eclipse.
•	Now build and run TestNG Test.

3.	Framework- It has 3 packages under src folder, each on of it performing particular task.

•	automationFramework –
       AKQAUtil.java consist of explicit wait method and can have any common functionality.
       LoadConfig.java is used to read config.properties file.
•	automationPages – 
       It has all 3 pages with Page Object Model and Page Factory.
•	automationTest-
       The test case file to add item in Wishlist. 

Resource Folder – This folder consists of browser drivers and config.properties file.

Note:- I have given proper comments in code for better understanding.






