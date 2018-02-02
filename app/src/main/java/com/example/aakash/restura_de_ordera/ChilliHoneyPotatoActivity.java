package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ChilliHoneyPotatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chilli_honey_potato);

        Button orderChilli = (Button) findViewById(R.id.orderChilli);
        orderChilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChilliHoneyPotatoActivity.this, OrderActivity.class);
                intent.putExtra("item", "Chilli Potato");
                startActivity(intent);
            }
        });
    }
}
