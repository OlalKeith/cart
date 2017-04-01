package com.example.olal.cart2.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.olal.cart2.R;
import com.example.olal.cart2.datamodels.Product;

import java.util.List;

/**
 * Created by olal on 4/1/17.
 */

public class ProductsListAdapter extends BaseAdapter {

    //reference of activity
    Context context;
    List<Product> productList;

    public ProductsListAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }


    //tells you how many items ARE in a list
    @Override
    public int getCount() {
        return productList.size();
    }

    //tells the item that has been clicked at a particular position
    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    //tells the position of an item
    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        convertView = layoutInflater.inflate(R.layout.product_list_item,null);
        Product currentproduct = productList.get(position);

        TextView tvProductName = (TextView) convertView.findViewById(R.id.tvproductname);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.tvprice);
        TextView btnAddToCart = (TextView) convertView.findViewById(R.id.btnAddToCart);
               //setText only takes string
        tvProductName.setText(currentproduct.name);
        tvPrice.setText(String.valueOf(currentproduct.price));


        return convertView;


    }
}
