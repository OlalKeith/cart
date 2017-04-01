package com.example.olal.cart2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.olal.cart2.R;
import com.example.olal.cart2.datamodels.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView productlistview = (ListView) findViewById(R.id.productlistview);

    }

    private List<Product> createListofProducts(){
        ArrayList<Product> productArrayList = new ArrayList<Product>();

            productArrayList.add(new Product("Kimbo", 50.0, 0, " "));

        productArrayList.add(new Product("Sugar", 60.0, 0, " "));

        productArrayList.add(new Product("Oil", 70.0, 0, " "));

        productArrayList.add(new Product("Bread", 40.0, 0, " "));

        productArrayList.add(new Product("water", 30.0, 0, " "));

        return productArrayList;
    }
}
