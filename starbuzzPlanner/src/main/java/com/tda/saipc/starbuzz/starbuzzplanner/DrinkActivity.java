package com.tda.saipc.starbuzz.starbuzzplanner;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class DrinkActivity extends Activity {
    public static final String DRINKNO = "drinkNumber";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        Intent intent = getIntent();
        // retrieve the id, or 0 if no id was passed
        int id = intent.getIntExtra(DRINKNO, 0);
        // get the drink
        Drink drink= Drink.drinks[id];
        // Create the required stuff, img, name, desc
        TextView nameView = (TextView) findViewById(R.id.name);
        nameView.setText("Name: " + drink.getName());

        TextView descView = (TextView) findViewById(R.id.description);
        descView.setText("Description: " + drink.getDescription());

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageResource(drink.getImageResourceID());
        imageView.setContentDescription(drink.toString());

    }

}
