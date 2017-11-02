package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ItemsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);

        Button dosa = (Button) findViewById(R.id.orderDosa);
        dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, DosaActivity.class);
                startActivity(intent);
            }
        });

        Button burger = (Button) findViewById(R.id.orderBurger);
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, BurgerActivity.class);
                startActivity(intent);
            }
        });

        Button chow = (Button) findViewById(R.id.orderChow);
        chow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, ChowmeinActivity.class);
                startActivity(intent);
            }
        });

        Button pasta = (Button) findViewById(R.id.orderPasta);
        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, PastaActivity.class);
                startActivity(intent);
            }
        });

        Button momos = (Button) findViewById(R.id.orderMomos);
        momos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, MomosActivity.class);
                startActivity(intent);
            }
        });

        Button rasgulla = (Button) findViewById(R.id.orderRas);
        rasgulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, RasgullaActivity.class);
                startActivity(intent);
            }
        });

        Button rolls = (Button) findViewById(R.id.orderRolls);
        rolls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, SpringRollsActivity.class);
                startActivity(intent);
            }
        });

        Button rice = (Button) findViewById(R.id.orderRice);
        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, FriedRiceActivity.class);
                startActivity(intent);
            }
        });

        Button potato = (Button) findViewById(R.id.orderChilli);
        potato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, ChilliHoneyPotatoActivity.class);
                startActivity(intent);
            }
        });

        Button manchu = (Button) findViewById(R.id.orderManchu);
        manchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsListActivity.this, ManchurianActivity.class);
                startActivity(intent);
            }
        });
    }
}
