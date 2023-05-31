package Shopping;

//2. Skriv en klasse Item, som skal repræsentere hver enkelt vare i indkøbskurven.
// Item-klassen skal have følgende metoder og attributter:
public class Item {
    private String name;

    private double price;


    public Item( String name, int price ){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
