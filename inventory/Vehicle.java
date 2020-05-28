package inventory;

public abstract class Vehicle {

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

  public void setMake(String make) {
    this.make = make;
  }

  // Abstract method
  // it's quarantine that exits in all the inheritance from the abstract class.
  // Just exits.
  // public abstract void hornkHorn();

  // Overridden Methods
  @Override
  public String toString() {
    return "Make: " + this.make + ", Model: " + this.model;
  }
}
