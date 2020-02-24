

##1. Technical Requirements for this project

JDK 8
Maven


##2. Packaging Jar File

Go to the project root folder (where the pom.xml is) and execute the following commad:

mvn package -Dmaven.test.skip=true


##3. Running the API

mvn spring-boot:run

##4. Running tests

Go to the project root folder (where the pom.xml is) and execute the following command:

mvn test


##5 Accesing the API

Access the local url :

Account List
http://localhost:8080/accounts/

This will produce a JSON response.


http://localhost:8080/transactions/{accountNumber}

Example http://localhost:8080/transactions/768456461

This will produce a JSON response.


