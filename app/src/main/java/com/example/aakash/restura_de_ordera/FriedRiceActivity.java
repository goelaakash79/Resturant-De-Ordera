package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FriedRiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fried_rice);

        Button orderRice = (Button) findViewById(R.id.orderRice);
        orderRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FriedRiceActivity.this, OrderActivity.class);
                intent.putExtra("item", "Fried Rice");
                startActivity(intent);
            }
        });
    }
}
