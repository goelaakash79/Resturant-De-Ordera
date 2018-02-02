package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ManchurianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manchurian);

        Button orderManchu = (Button) findViewById(R.id.orderManchu);
        orderManchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManchurianActivity.this, OrderActivity.class);
                intent.putExtra("item", "Manchurian");
                startActivity(intent);
            }
        });
    }
}
