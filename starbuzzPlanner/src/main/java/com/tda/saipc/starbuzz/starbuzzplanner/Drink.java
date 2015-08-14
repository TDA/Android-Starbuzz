package com.tda.saipc.starbuzz.starbuzzplanner;

/**
 * Created by schandramouli on 8/14/15.
 */
public class Drink {
    private String name;
    private String description;
    private int imageResourceID;

    public static final Drink[] drinks = {
            new Drink("Latte", "Creamy latte", R.drawable.latte),
            new Drink("Mocha", "Glorious Mocha", R.drawable.filter),
            new Drink("Cappuccino", "Hot Cappuccino", R.drawable.cappuccino)
    };

    public Drink(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    @Override
    public String toString() {
        return name;
    }
}
