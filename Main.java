import inventory.Vehicle;
import inventory.Truck;

class Main {
  public static void main(String[] args) {
    // Vehicle myVehicle = new Vehicle("Honda", "RCV");
    // myVehicle.make = "Honda";
    // myVehicle.model = "RCV";

    Truck myTruck = new Truck("Ford", "F150", (short) 500, true);

    System.out.println(myTruck);
  }
}
