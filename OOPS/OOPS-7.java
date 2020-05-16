//Abstract classes and functions

//What does it mean by saying an abstract function?
//Suppose, Vehicle has 3 subclsses, namely, Car, Bicycle, Boat
//The Vehicle super class wants that isMotorized() method should be present in all of the subclasses
//But Vehicle cannot answer isMotorized() but each of the 3 subclasses can.
//But Vehicle wants to have this function in all 3
//If we Vehicle does not add this function, then it's choice of Car, bicycle, Boat to add the function or not.
//But we want the Vehicle class to force all the subclasses to meke this function.
//Then at this situation we use abstract methods

//For eg.

//If a function is made abstract, then class should also be declared as abstract

abstract class Vehicle {
    protected String color;
    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle Constructor");
    }

    public abstract boolean isMotorized();

    public abstract String getCompany();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("Vehicle Color" + color);
        System.out.println("Vehicle Speed" + maxSpeed);
    }
}

abstract class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    public Car(){
        super(100);
    }

    Car(int numGears, int maxSpeed){
        super(maxSpeed);
        thi.numGears = numGears;
        System.out.println("Car constructor");
    }

    @Override
    public boolean isMotorized(){
        return false;
    }

    boolean isConvertible(){
        return isConvertible;
    }

    public void print(){
        super.print();
        System.out.println("Car numGears:" + numGears);
        System.out.println("Car isConvertible:" + isConvertible);  
    }
}

class BMW extends Car {
    @Override
    public String getCompany(){
        return null;
    }
}
class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(20);  //We cannot write this
        //We cannot make an object of Vehicle class because it's an abstract class (incomplete)       
        
        Vehicle x = new Car(1, 2); //x is a reference to Car class and we can make this object because Car is complete 
        //(above statement decribes polymorphism)
    }
}


//After creating another bstract function getCompany(), we cannot create objects of Car class, because it is incomplete.
//When we create BMW class, then both the abstract functions are complete, hence we can create objects of BMW class but not Vehicle and Car class
