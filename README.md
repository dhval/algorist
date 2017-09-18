### Algorist - Some common coding problems and solutions

#### Executing code
Using IDE
````
// Update prob.AlgoristTests file, make sure @SpringBootTest(classes = {YourClass.class})
````
Java
````
 javac -d bin/ -sourcepath src/main/java/ -cp my.jar src/main/java/prob/amzn/PairSum.java
 java -cp bin/ prob.amzn.PairSum
````
Maven - All files will be compiled.
````
 mvn compile exec:java -Dexec.mainClass="prob.amzn.MergeArray"
````