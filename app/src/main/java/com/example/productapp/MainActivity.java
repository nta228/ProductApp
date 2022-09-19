package com.example.productapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> listContact = new ArrayList<>();
    List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDataProduct();
        ProductAdapter adapter = new ProductAdapter(this, listProduct);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        RecyclerView rvContact1 = findViewById(R.id.rvContact);
        rvContact1.setLayoutManager(layoutManager);
        rvContact1.setAdapter(adapter);
    }

    private void initDataProduct() {
        listProduct.add(new Product("Ng A", "0912513451", 33F, R.drawable.user1));
        listProduct.add(new Product("Ng B", "0912513451", 33F, R.drawable.user2));
        listProduct.add(new Product("Ng C", "0912513451", 33F, R.drawable.user3));
    }

    private void initData() {
        listContact.add(new Contact("Ng A", "0912513451", R.drawable.user1));
        listContact.add(new Contact("Ng B", "0912513451", R.drawable.user2));
        listContact.add(new Contact("Ng C", "0912513451", R.drawable.user3));
        listContact.add(new Contact("Ng D", "0912513451", R.drawable.user1));
        listContact.add(new Contact("Ng E", "0912513451", R.drawable.user4));
        listContact.add(new Contact("Ng F", "0912513451", R.drawable.user1));
        listContact.add(new Contact("Ng G", "0912513451", R.drawable.user2));
        listContact.add(new Contact("Ng H", "0912513451", R.drawable.user1));

    }
}