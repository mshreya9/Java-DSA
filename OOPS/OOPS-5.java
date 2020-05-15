//Inheritance :- It helps you to store all the common traits at one place.

class Vehicle {
    String color;
    int maxSpeed;

    public void print(){
        System.out.println("Vehicle color" + color);
        System.out.println("Vehicle Speed" + maxSpeed);
    }
}

class Car extends Vehicle{
    int numGears;
    boolean isCovertible;
}

class VehicleUse{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.print();

        Car c = new Car();
        c.numGears = 10;
        c.color = "Black";
        c.maxSpeed = 90;
        c.print();
    }
}

//With the help of inheritance, we are able to inherit common traits(Vehicle class properties) i.e. data members and functions, into Car class.

//Parent class : parent class, super class, base class
//Child class : child class, sub class, derived class

//Data members can be declared as :
//1. public : open to all
//2. protected : if there is a subclass outside package, then protected will be used to access 
//3. friendly/ default : open to package only
//4. private : open to class only

//super : no need to print color and maxspeed again for Car class, use super keyword to access print() function of Vehicle class bu writing super.print()
//By using super keyword, we can use parent class data members and functions.

//When we call the derived class constructor, parent class constructor is also called.First super class constructor is called and then derived class constuctor.

//When we do not have super class constructor (not default constructor), it doesn't know how to create vehicle object. Hence, we will pass parameters in super()
//Calling the super constructor should be the first line always when initializing Vehicle object inside Car constructor.


//Polymorphism : something taking multiple forms.

//Every vehicle can be a car as well.
//We can also write Vehicle v = new Car();
