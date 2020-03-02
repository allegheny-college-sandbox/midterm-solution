package midterm;

/** Creates a Widget object.
 *
 * @author Solutions Repository
 */
public class Widget {
  
  private final String name;
  private final double price;
  private final double weight;
  
  /** Constructor.
   *
   * @param name Name of the widget
   * @param price Price of the widget
   * @param weight Weight of the widget
   */
  public Widget(String name, double price, double weight) {
    this.name = name;
    this.price = price;
    this.weight = weight;
  }
  
  /** Gets the price of the widget.
   *
   */
  public double getPrice() {
    return this.price;
  }
  
  /** Gets the weight of the widget.
   *
   */
  public double getWeight() {
    return this.weight;
  }
  
  /** Sets the price of a widget after discount.
   *
   * @param discount The percentage to discount.
   */
  public void setDiscountPrice(double discount) {
    discount /= 100;
    this.price -= this.price * discount;
  }
  
  /** Creates String representation of widget.
   *
   */
  public String toString() {
    return this.name + "\t$" + this.price + "\t" + this.weight + " lbs.";
  }
}