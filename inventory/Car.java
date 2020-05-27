package inventory;

public class Car extends Vehicle {

  // Properties
  private Integer trunkCap;

  // Constructor
  public Car(String make, String model, Integer trunkCap) {
    super(make, model);
    this.trunkCap = trunkCap;
  }

  // Getter & Setter
  public Integer gertTrunkCap() {
    return this.trunkCap;
  }

  public void setTrunkCap(Integer trunkCap) {
    this.trunkCap = trunkCap;
  }

  // Override
  @Override
  public String toString() {
    return super.toString() + " , Trunk Capacity: " + this.trunkCap;
  }

}
