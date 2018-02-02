package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PastaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);

        Button orderPasta = (Button) findViewById(R.id.orderPasta);
        orderPasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PastaActivity.this, OrderActivity.class);
                intent.putExtra("item", "Pasta");
                startActivity(intent);
            }
        });
    }
}
