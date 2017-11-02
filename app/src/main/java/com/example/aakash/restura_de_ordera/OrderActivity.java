package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.aakash.restura_de_ordera.R.id.myaddress;

public class OrderActivity extends AppCompatActivity {

    int quantity;
    int Tprice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        quantity=1;

        String item = getIntent().getExtras().getString("item");

        final EditText name = (EditText) findViewById(R.id.name1);
        final EditText phone = (EditText)findViewById(R.id.phoneNo);
        final EditText add = (EditText)findViewById(myaddress);
        Button order = (Button) findViewById(R.id.placeOrder);
        Button plus = (Button) findViewById(R.id.increment);
        Button minus = (Button) findViewById(R.id.decrement);
        TextView itemView = (TextView)findViewById(R.id.item);
        itemView.setText(item);

        final TextView price = (TextView) findViewById(R.id.price);
        final TextView quan = (TextView) findViewById(R.id.Quantity);

        quan.setText("1");
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(quantity < 20) {
                    quantity++;
                    Tprice = price(quantity);
                    price.setText("Total Price: $" + Integer.toString(Tprice));
                    quan.setText(Integer.toString(quantity));
                    return;
                }
                if(quantity >= 20){
                    Toast.makeText(OrderActivity.this, "Maximum Quantities can be 20 only.", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(quantity > 1 ) {
                    quantity--;
                    quan.setText(Integer.toString(quantity));
                    Tprice = price(quantity);
                    price.setText("Total Price: $" + Integer.toString(Tprice));
                    return;
                }
                if (quantity <= 1){
                    Toast.makeText(OrderActivity.this, "Minimum Quantity is 1 only.", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OrderActivity.this, OrderSummaryActivity.class);

                intent.putExtra("name",name.getText().toString());
                intent.putExtra("num",phone.getText().toString());
                intent.putExtra("addy",add.getText().toString());
                intent.putExtra("quanty",quan.getText().toString());
                intent.putExtra("item","Dosa");
                intent.putExtra("tprice","$" + Tprice);
                startActivity(intent);
            }
        });

    }


    public int price(int quantityy){
        int pricePerPeice = 10;
        int totalPrice;

        totalPrice = pricePerPeice * quantityy;
        return totalPrice;
    }
}
