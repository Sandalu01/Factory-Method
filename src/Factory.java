import Resources.Bus;
import Resources.Car;
import Resources.Van;
import Resources.Vehicle;

public class Factory {



    // first step

//    public Van get() {
//        System.out.println("Driving a car...");
//        return new Van();

//    }
//    public Car get() {
//        System.out.println("Driving a car...");
//        return new Car();
//    }

//    public Bus get() {
//        System.out.println("Driving a car...");
//        return new Bus();
//    }
//

    // Second step


    //(pass the enum vehicle itypes)



//        if (vehicleType.equals("Car")) {
//            return new Car();
//        }
//        if (vehicleType.equals("Van")){
//            return new Van();
//        }
//
//        else {
//        return  new Bus();
//        }
//    }


    // Third step


//          if (vehicleType.name().equals("car")) {
//        return new Car();
//    }
//        if (vehicleType.name().equals("van")){
//        return new Van();
//    }
//
//        else {
//        return  new Bus();
//    }



    // finally we can used  "singelton design "



    private static  Factory factory =null;

    private Factory(){}
public static Factory Getinstance(){
        if (factory==null){

            factory=new Factory();

        }
        return factory;
}





public Vehicle GetVehicle(VeheicleType vehicleType) {



    switch (vehicleType){
        case BUS:
            return new Bus();
        case CAR:
            return new Car();
        case VAN:
            return new Van();
        default:return null;
// jvm not smart and can't identify the default becase we can use  return null

    }
}


}
