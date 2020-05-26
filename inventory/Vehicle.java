package inventory;

public class Vehicle {

  // Properties
  private String make;
  private String model;

  // Constructor
  public Vehicle(String make, String model) {
    this.make = make;
    this.model = model;
  }

  // Getters & Setters
  public String getMake() {
    return this.make;
  }

  public void setMAke(String make) {
    this.make = make;
  }

  // Overridden Methods
  @Override
  public String toString() {
    return "Make: " + this.make + ", Model: " + this.model;
  }
}
