//Interfaces : extension of abstract classes
//Only one class can be extended, not more than one
//But more than one interface can be implemented

public interface VehicleInterface {
    //by default the below functions are abstract
    public void print();
    public int getMaxSpeed();  
}

class Vehicle {
    public void print(){

    }

    public int getMaxSpeed(){
        return 10;
    }
}

class Car extends Vehicle implements VehicleInterface, CarInterface {
    @Override
    public void print(){

    }

    @Override
    public int getMaxSpeed(){
        return 0;
    }

    @Override
    public String getCompany(){
        return null;
    }
}

interface CarInterface extends VehicleInterface {
    public String getCompany();
}

//If you're implementing Car function, then you would require getCompany() and all the functions of VehicleInterface

//We do not keep any data members inside interfaces. Only to store constants, we will keep data members inside interface that also final and static.
//For eg. public final static double PI = 3.14;