package inventory;

public class Truck extends Vehicle {

  // Properties
  private Short cargoCap;
  private Boolean hasHitch;

  // Constructor
  public Truck(String make, String model, Short cargoCap, Boolean hasHitch) {
    super(make, model);
    this.cargoCap = cargoCap;
    this.hasHitch = hasHitch;
  }

  // Getters & Setters
  public Short getCargoCap() {
    return this.cargoCap;
  }

  public void setCargoCap(Short cargoCap) {
    this.cargoCap = cargoCap;
  }

  public Boolean getHasHitch() {
    return this.hasHitch;
  }

  public void setHasHitch(Boolean hasHitch) {
    this.hasHitch = hasHitch;
  }

  // Override Method
  @Override
  public String toString() {
    return super.toString() + ", Cargo Capacity: " + this.cargoCap + ", Has Hitch? " + this.hasHitch + ".";
  }
}
