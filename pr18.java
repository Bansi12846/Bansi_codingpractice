abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}
class car extends Vehicle {
    String fuelType(){
        return "petrol or diesel";
    }
    int noOfWheels(){
        return 4;
    }
}
class Bike extends Vehicle{
     String fuelType(){
        return "petrol";
    }
    int noOfWheels(){
        return 2;
    }
}
class pr18 {
    public static void main(String[] args) {
        car c=new car();
        Bike b=new Bike();
        System.out.println(c.fuelType());
        System.out.println(c.noOfWheels());
        System.out.println(b.fuelType());
        System.out.println(b.noOfWheels());
    }
}


// petrol or diesel
// 4
// petrol
// 2
