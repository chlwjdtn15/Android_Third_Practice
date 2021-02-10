package com.example.android_third_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Product> list = getData();
        MyAdapter adapter = new MyAdapter(list);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

    }


    public List<Product> getData(){


          List<Product> products = new ArrayList<>();

          Product p1 = new Product("Android", R.mipmap.android);


          products.add(p1);

          Product p2 = new Product("iPhone", R.mipmap.iphone);

          products.add(p2);

          Product p3 = new Product("Dell", R.mipmap.dell);
          products.add(p3);

            Product p4 = new Product("Tablet", R.mipmap.tablet);
            products.add(p4);

            Product p5 = new Product("TV", R.mipmap.tv);
            products.add(p5);



        return products;


    }


}