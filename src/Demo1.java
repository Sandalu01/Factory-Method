import Resources.Bus;
import Resources.Car;
import Resources.Van;
import Resources.Vehicle;



        // first Step

//    Car car=new Factory().Getcar();
//    Van van=new Factory().Getcar();
//    Bus bus=new Factory().Getcar();

        // Second Step

//        Vehicle car=new Factory().GetVehicle("Car");
//        Vehicle van=new Factory().GetVehicle("Van");
//        Vehicle bus =new Factory().GetVehicle("bike");

// problem is we can pass any argument for this String types but can it


        //third step

//        Vehicle car=new Factory().GetVehicle(VeheicleType.CAR);
//        Vehicle van=new Factory().GetVehicle(VeheicleType.VAN);
//        Vehicle bus =new Factory().GetVehicle(VeheicleType.BUS);
//

          //final step

        //singelton used -one instance used for instead of three or any instance,
        // there fore we dont't use new facortory same times
        //we can use Factory.Getinstance()



        public class Demo1 {
            public static void main(String[] args) {


        Vehicle car=Factory.Getinstance().GetVehicle(VeheicleType.CAR);
        Vehicle van=Factory.Getinstance().GetVehicle(VeheicleType.VAN);
        Vehicle bus =Factory.Getinstance().GetVehicle(VeheicleType.BUS);

    }
}
