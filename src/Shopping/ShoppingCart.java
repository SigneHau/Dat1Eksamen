package Shopping;

import java.util.ArrayList;
import java.util.List;

//Skriv en klasse, ShoppingCart, som skal have følgende metoder og attributter:
public class ShoppingCart {

    private ArrayList<Item> itemList;
    private double discount;

    public ShoppingCart() {
        itemList= new ArrayList<>();
        discount = 0.0;
    }
  public void addItem(Item item){
        itemList.add(item);

  }

   // Metoden skal fjerne et element fra indkøbskurven, hvis det findes i indkøbskurven.
  public void removeItem(Item item){

          itemList.remove(item);
        }

    public double getTotalPrice() {
        double totalPrice =0.0;
        for(Item item : itemList){
            totalPrice += item.getPrice();
        }

        // hvis man har ekstra tid og ikke en del af den oprindelige opgave
        if (discount > 0) {
            totalPrice -= (totalPrice * discount);
        }

        return totalPrice;
    }


   // Implementer metoden getItems():
    // Metoden skal returnere en liste over alle elementer i indkøbskurven.
   public List<Item> getItems() {
       return itemList;
   }

//Lav en attribut discount i klassen ShoppingCart.
// Lav en setter-metode til attributten.
   public void setDiscount(double discount) {
    this.discount = discount;
}



}
