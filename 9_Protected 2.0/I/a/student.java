package a;

public class student implements Cloneable {
    String name;
    int age;
} 
    
/*
 * a\A.java:11: error: clone() has protected access in Object
    student y=(student)x.clone();
                        ^
1 error
 */
