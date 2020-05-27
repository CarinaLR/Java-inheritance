
// import inventory.Vehicle;
// import inventory.Truck;
// import inventory.Sedan;
import inventory.*;

class Main {
  public static void main(String[] args) {
    // Vehicle myVehicle = new Vehicle("Honda", "RCV");
    // myVehicle.make = "Honda";
    // myVehicle.model = "RCV";

    // Truck myTruck = new Truck("Ford", "F150", (short) 500, true);

    // Sedan mySedan = new Sedan("Mercedes-Benz", "AMG S 63", 151.650, 5);

    // Promotion myPromotion = new Promotion("Subaru", "Crosstrek", "free ABC
    // checking", 15);

    Car myCar = new Car("Hundai", "Sonata", 100);

    ElectricCar myECar = new ElectricCar("tesla", "Model s", 50, 2000);

    System.out.println(myECar);
  }
}
