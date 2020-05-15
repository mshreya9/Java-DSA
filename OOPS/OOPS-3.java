//Important Keywords - 1

class Student {
    String name;
    //final data members can be initialised as soon as they are declared OR inside a constructor 
    //Here, private int roll = 100
    private int roll;

    //Once you declare data member as final, you caanot set the value of roll number. Hence, getters shouldn't be used.
    // Student(String s, int n){
    //     name = s;
    //     roll = n;
    // }

    Student(String name, int roll){
        System.out.println(this);
        this.name = name;
        this.roll = roll;
    }
    //The right hand side is the local variable which has to be assigned in the data member on the left hand side.

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

class StudentUse3 {
    public static void main(String[] args) {
        Student s1 = new Student("Shreya", 123);
        System.out.println(s1);
        s1.print();
        Student s2 = new Student("Shourya", 125);
        System.out.println(s2);
        s2.print();
    }
}

//1. final keyword can be initialised only once
//2. constructor can be called on an object only once
//3. The outputs are (for the above 4 syso statements)
// Student@2f92e0f4
// Student@2f92e0f4
// Shreya:123
// Student@816f27d
// Student@816f27d
// Shourya:125

