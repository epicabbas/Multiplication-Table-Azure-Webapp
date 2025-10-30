# Multiplication-Table-Azure-Webapp
Deployed the multiplication table web app on Azure.

https://multiplication-by-abbas-v2.azurewebsites.net/

## Steps:
1.	Wrote the basic multiplication program.
2.	Wrapped it into a web app using SpringBoot
a.	Created pom.xml, MultiplicationApplication.java, index.html, and application.properties
3.	Used Maven to compile and generate a JAR file
a.	mvn clean package
b.	Generated JAR file in target/ directory
4.	Created Web app through the Azure portal and uploaded JAR file via the deployment centre.
5.	Used Azd webapp command for automated deployment.
a.	az webapp up command for automated deployment

## Difficulties - dodged:
1.	Navigating the Az portal initially.
2.	Web app showed “application error” despite service status showing “Running”
3.	Runtime format confusion: JAVA:17 vs JAVA:17-java17 – as windows vs Linux use different syntax
4.	Had to switch to Axure CLI for successful deployment.
