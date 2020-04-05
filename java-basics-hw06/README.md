# java-basics-hw06

This is a homework for the Java Constructors

## IntelliJ IDEA project configuration
1. Clone this project to your local environment

    ```git clone https://github.com/kermek/java-basics-hw06.git``` 
2. Import in IntelliJ IDEA using `File -> New -> Project from Existing Sources...`.
3. Select the directory that you cloned to.
4. Go through the `Import Project` wizard by clicking `Next`.
5. On `Please select project SDK` point it to your Java 1.8 JDK.
6. Press `Ctrl+Alt+Shift+S` (`Command + ;`) and check that in your `Project Structure`.
    value of `Project language level` is set to `8 - Lambdas, type annotations et.`.
7. Open test class, put your cursor on `@Test` annotation, press `Alt+Enter` 
    and choose `Add 'testng' to classpath`.  
8. Set the value to `org.testng:testng:6.14.3` and mark checkbox `Download to`.
9. Complete all TODO tasks in the Temperature class.
10. Execute tests. 
11. Add 2 more tests for each method by adding more test data.

## Temperature assignment

Implement methods in the Temperature class.
Formulas:

`F = (9*C + 160)/5`

`C = 5*(F - 32)/9`

All test should pass.
Add 2 more tests for each method by adding more test data.

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In test class put your cursor on its definition, right click and choose `Run ...`
* Right click on a little green triangle near the class definition and choose `Run ...`
* In test class put your cursor on its definition and press `Ctrl+Shift+F10` (`Control+Shift+R`)
* Once you executed your test you could re-run it again by pressing `Shift+F10` (`Control+R`)
