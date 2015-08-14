package com.tda.saipc.starbuzz.starbuzzplanner;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class DrinksCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // takes context: this, layout_style, array: drinks
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1, Drink.drinks);
        ListView listView = this.getListView();
        listView.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.DRINKNO, (int) id);
        startActivity(intent);
    }
}
