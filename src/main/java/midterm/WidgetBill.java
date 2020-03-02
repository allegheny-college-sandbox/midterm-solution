package midterm;

import java.util.Scanner;

/** Uses the Widget object to make a label.
 *
 * @author Solutions Repository
 */
public class WidgetBill {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Widgets ---------------------------------------------------------
    Widget thingamajig = new Widget("Thingamajig",13.37,42.12);
    Widget zonk = new Widget("The Zonk",19.79,34.23);
    Widget maguffin = new Widget("Maguffin",18.94,2.21);
    Widget whatchamacallit = new Widget("Whatchamacallit",13.37,112.32);
    Widget gadget = new Widget("A Gadget",119.33,41.12);
    // Widgets ---------------------------------------------------------
    
    // Print the widgets
    System.out.println(thingamajig);
    System.out.println(zonk);
    System.out.println(maguffin);
    System.out.println(whatchamacallit);
    System.out.println(gadget);
    System.out.println();
    
    // Create total price
    double totalPrice = thingamajig.getPrice() + zonk.getPrice() + maguffin.getPrice()
                        + whatchamacallit.getPrice() + gadget.getPrice();
   
    // Get discount rate
    Scanner input = new Scanner(System.in);
    System.out.print("Enter member discount rate: ");
    double discountRate = input.nextDouble();
    
    // Print the total price and discount rate
    System.out.println();
    System.out.println("Price before discount: " + totalPrice);
    totalPrice -= totalPrice * discountRate / 100;
    System.out.println("Member discount applied: " + discountRate + "%");
    
    // Get total weight and apply shipping
    double totalWeight = thingamajig.getWeight() + zonk.getWeight() + maguffin.getWeight()
                         + whatchamacallit.getWeight() + gadget.getWeight();
    double shippingCost = .33 * totalWeight;
    
    // Print final information
    System.out.println("Final price: " + totalPrice + ", Total weight: " + totalWeight);
    System.out.println("Cost to ship: " + shippingCost);
    System.out.print("Final total: " + (totalPrice + shippingCost));
  }
}