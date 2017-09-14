package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DosaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosa);

        Button orderDosa = (Button) findViewById(R.id.dosaOrder);
        orderDosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DosaActivity.this, OrderActivity.class);
                intent.putExtra("item","Dosa");
                startActivity(intent);
            }
        });
    }
}
