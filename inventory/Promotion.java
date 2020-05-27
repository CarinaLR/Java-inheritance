package inventory;

public class Promotion extends Vehicle {

  // Properties
  private String offer;
  private int discount;

  // Constructor
  public Promotion(String make, String model, String offer, int discount) {
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

  public int getDiscount() {
    return this.discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  // Override Method
  @Override
  public String toString() {
    return super.toString() + ", we have an offer for you: " + this.offer + "! your discount will be: " + this.discount
        + "% on the final price.";
  }
}
