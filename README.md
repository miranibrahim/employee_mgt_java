1. install java: sudo apt install openjdk-21-jdk
2. install maven: sudo apt update
3. vscode extention pack for java (microsoft)
4. vscode extention pack for spring boot (vmware)
5. create spring boot project with maven jar
6. maven dependencies : spring web, spring data jpa, postgres sql driver, validation, lombok
7. install pgsql : sudo apt install postgresql postgresql-contrib
8. sudo -u %give_username psql
9. CREATE DATABASE employee_db;
10. ALTER USER postgres PASSWORD '%give_a_password';
11. in application.properties, write:

````spring.application.name=employee-management

spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
spring.datasource.username=postgres
spring.datasource.password=postgres

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true```
````

12. add spring dev tool in pom.xml or from UI. to continous look up to any changes.
