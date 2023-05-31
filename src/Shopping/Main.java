package Shopping;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Opret et ShoppingCart-objekt
        ShoppingCart cart = new ShoppingCart();

        // Opret Item-objekter
        Item apple = new Item("Apple", 8 );
        Item banana = new Item("banan", 5 );
        Item orange = new Item("orrange", 6 );

        // Tilføj Item-objekter til indkøbskurven
         cart.addItem(apple);
         cart.addItem(banana);
         cart.addItem(orange);
         cart.addItem(banana);

        // Udskriv den samlede pris for indkøbskurven
        double totalPrice = cart.getTotalPrice();
        System.out.println("Den samlede pris for indkøbskurven er:"+ totalPrice);

        // Fjern et Item-objekt fra indkøbskurven
        cart.removeItem(banana);

        // Udskriv den samlede pris for indkøbskurven efter fjernelse
        totalPrice= cart.getTotalPrice();
        System.out.println("Den samlede pris for indkøbskurven er:"+ totalPrice);


        //liste over alle elementer i indkøbskurven.
        List<Item> items = cart.getItems();
        System.out.println("Elementer i indkøbskurven:");
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }

        //udskriver hvad du få ialt med rabat
        cart.setDiscount(0.2);
        totalPrice= cart.getTotalPrice();
        System.out.println("Den samlede pris for indkøbskurven er:"+ totalPrice);
    }

}
