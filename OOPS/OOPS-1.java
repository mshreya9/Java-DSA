import java.util.*;

class Student {
    String name;
    int rollNumber; //Default accesss modifier (within the package).
}

//Default access modifiers can be accessed outside a class but within the same package
// If you want to use it outside the package too, then use public access modifier

class StudentUse1{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1);
        System.out.println(s2);
    }
}

//Output
// Student@2f92e0f4
// Student@28a418fc

//s1 and s2 points to reference(address) where the new student objects are created.