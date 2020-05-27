package inventory;

public class Sedan extends Vehicle {

  // Properties
  private double price;
  private int rating;

  // Constructor
  public Sedan(String make, String model, double price, int rating) {
    super(make, model);
    this.price = price;
    this.rating = rating;
  }

  // Getters & Setters
  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  // Override Method
  @Override
  public String toString() {
    return super.toString() + ", Lowest price in the market: $" + this.price + ", This vehicle has a rating of: "
        + this.rating + ".";
  }
}
