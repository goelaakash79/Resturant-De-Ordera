package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SpringRollsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_rolls);

        Button orderRolls = (Button) findViewById(R.id.orderRolls);
        orderRolls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpringRollsActivity.this, OrderActivity.class);
                intent.putExtra("item", "Spring Rolls");
                startActivity(intent);
            }
        });
    }
}
