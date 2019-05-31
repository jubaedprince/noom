# noom
Noom App Test Framework Demo
## Repository
### Branch: dev –
1.	Holds code that runs properly using Intellij (set Junit as configuration). It is a functional buyflow action (as per the test case excel sheet created by Ashiq Rahman). 
2.	In the src/test/java/noom/AppTest.java, please change the location of ChromeDriver to the downloaded chrome driver. 
#### Note: 
1.	For different OS, different ChromeDriver will have to be installed. Drivers can be downloaded from https://sites.google.com/a/chromium.org/chromedriver/downloads
## Installation
Install Gradle in your system (https://docs.gradle.org/current/userguide/installation.html)
## Execution
1.	Gradle uses Junit and Selenium as dependency for this project. Use ``` ./gradlew build ``` to download the dependencies and create necessary folders automatically.
2.	Use: ``` ./gradlew test ``` to run the Junit tests
## Contributors
prince@techynafdev.com 
ashiq.rahman716@gmail.com 
tasnim@techynafdev.com
manis@techynafdev.com
