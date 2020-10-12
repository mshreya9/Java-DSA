//Final keyword

//We can apply final keyword at 3 places:
//1. data member
//2. function :- if function is made final, subclass cannot override this function
//3. class :- if class is made final then no inheritance form this class

//For eg.

final class Vehicle {
    protected String color;
    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public final void print() {
        System.out.println("Vehicle Color" + color);
        System.out.println("Vehicle Speed" + maxSpeed);
    }
}

class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    Car(int numGears, int maxSpeed){
        super(maxSpeed);
        this.numGears = numGears;
        System.out.println("Car constructor");
    }

    boolean isConvertible(){
        return isConvertible;
    }

    public void printCar(){
        super.print();
        System.out.println("Car numGears:" + numGears);
        System.out.println("Car isConvertible:" + isConvertible);  
    }
}

//Output
//OOPS-6.java:33: error: cannot inherit from final Vehicle


//Important :-
//1. if Vehicle class print() method is made final, then Car class cannot override the print() method that means Car class cannot have any function with the same name and signature as print() method.
//Error : Cannot override the final method from Vehicle. Hence, change the name to printCar()

//2. If Vehicle class is made final then you cannot inherit Car class from it.
//Error: The type Car cannot subclass the final class Vehicle


//Note: Runtime polymorphism can't be achieved by data members.
