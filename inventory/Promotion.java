package inventory;

public class Promotion extends Vehicle {

  // Properties
  private String offer;
  private Short discount;

  // Constructor
  public Promotion(String make, String model, String offer, Short discount) {
    super(make, model);
    this.offer = offer;
    this.discount = discount;
  }

  // Getter & Setters
  public String getOffer() {
    return this.offer;
  }

  public void setOffer(String offer) {
    this.offer = offer;
  }

  public Short getDiscount() {
    return this.discount;
  }

  public void setDiscount(Short discount) {
    this.discount = discount;
  }
}
