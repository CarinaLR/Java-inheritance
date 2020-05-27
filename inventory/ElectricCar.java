package inventory;

public class ElectricCar extends Car {

  // Properties
  private Integer batteryCap;

  // Constructor
  public ElectricCar(String make, String model, Integer trunkCap, Integer batteryCap) {
    super(make, model, trunkCap);
    this.batteryCap = batteryCap;
  }

  public Integer getBatteryCap() {
    return this.batteryCap;
  }

  public void setBatteryCap(Integer batteryCap) {
    this.batteryCap = batteryCap;
  }

  // Override
  @Override
  public String toString() {
    return super.toString() + ", Bettery Cap: " + this.batteryCap;
  }

}
