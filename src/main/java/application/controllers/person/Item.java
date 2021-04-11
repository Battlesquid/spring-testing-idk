package application.controllers.person;

import java.text.NumberFormat;
import java.util.Random;

public class Item {

    private final int id;
    private final String name;
    private final String price;

    public Item(String name, int id) {
        Random random = new Random();
        this.name = name;
        this.id = id;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        this.price = formatter.format(random.nextDouble() * random.nextInt(5));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
