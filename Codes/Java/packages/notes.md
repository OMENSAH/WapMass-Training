Workig with a lot files becomes easier with giving the Java classes package names.
Package names starts from the root folder of the JavaClass location
For example a file in this directory 
 
 project
        classes
            animalclass
                Animal.java
        anotherclass
            personclass
                Person.java

The Animal.java file can be packaged as:
 packages   classes.animalclass;

We then import the file as
import classes.animalclass.Animal;