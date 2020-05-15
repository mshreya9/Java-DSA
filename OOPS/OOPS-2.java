

import java.util.*;

class Student {
    String name;
    int rollNumber; //If you make it as a private member, you cannot access rollNumber outside the Student class
}
//Private access modifier are accessible only within the class.

class StudentUse2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Shreya";
        s1.rollNumber = 123;

        s2.name = "Vandana";
        s2.rollNumber = 124;

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}

//Output
//Shreya
//Vandana

//You can use getters and setters while keeping data members as private.
//If data members are private, they are not accessible outside the class.