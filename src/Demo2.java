import Resources.Bus;
import Resources.Car;
import Resources.Van;
import Resources.Vehicle;


// Factory -method design pattern--->encapsulation of the object creation
public class Demo2 {

    public static void main(String[] args) {


//        First step

//        Car car=new Factory().Getcar();
//        Van van=new Factory().Getvan();
//        Bus bus =new Factory().Getbus();

        //second steps
        Vehicle car=Factory.Getinstance().GetVehicle(VeheicleType.CAR);
        Vehicle van=Factory.Getinstance().GetVehicle(VeheicleType.VAN);
        Vehicle bus =Factory.Getinstance().GetVehicle(VeheicleType.BUS);
    }

}
