package inventory;

public class Promotion extends Vehicle {

  // Properties
  private String offer;
  private int discount;

  // Constructor
  public Proomotion(String make, String model, String offer, int discount) {
    super(make, model);
    this.offer = offer;
    this.discount = discount;
  }

}
