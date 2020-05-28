package inventory;

public class ElectricCar extends Car implements Chargeable {

  // Properties
  private Integer batteryCap;
  public String plugType;

  // Constructor
  public ElectricCar(String make, String model, Integer trunkCap, Integer batteryCap, String plugType) {
    super(make, model, trunkCap);
    this.batteryCap = batteryCap;
    this.plugType = plugType;
  }

  public Integer getBatteryCap() {
    return this.batteryCap;
  }

  public void setBatteryCap(Integer batteryCap) {
    this.batteryCap = batteryCap;
  }

  // Interface Method
  public String getPlugType() {
    return this.plugType;
  }

  public void setPlugType(String plugType) {
    this.plugType = plugType;
  }

  // Override
  @Override
  public String toString() {
    return super.toString() + ", Bettery Cap: " + this.batteryCap;
  }

}
