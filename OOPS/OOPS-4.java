//Important Keywords - 2

class Student {
    String name;
    private int roll;

    //We want to create a SHARED variable which keeps the count of the number of students 

    private static int numStudents;
    //If we make numStudents as private then we won't be able to access it outside the class Student. Hence, make a getter function

    Student(String name, int roll){
        System.out.println(this);
        this.name = name;
        this.roll = roll;
        numStudents++;
    }
    //Why inside constructor? because it will always be called when an object is created, hence, it would be the best place

    public static int getNumStudents(){ //functions can also be static or non-static
        return numStudents;
    }

    public void setRoll(int rn){
        if(rn <= 0){
            return;
        }
        roll = rn;
    }

    public int getRoll(){
        return roll;
    }

    public void print(){
        System.out.println(name + ":" + roll);
    }
}

class StudentUse4{
    public static void main(String[] args) {
        Student s1 = new Student("Shreya", 123);
        s1.print();
        Student s2 = new Student("Shourya", 125);
        s2.print();
        //We can access numStudents by any object, it will return the same value
        //access the static data members by the class name
        // System.out.println(Student.numStudents);
        System.out.println(Student.getNumStudents());
    }
}

//Encapsulation :- Writing all the data members and functions together in a class in encapsulation.