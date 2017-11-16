package com.example.aakash.restura_de_ordera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.aakash.restura_de_ordera.R.id.name1;

public class OrderSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        //fetching
        final String name = getIntent().getExtras().getString("name");
        final String num = getIntent().getExtras().getString("num");
        final String addy = getIntent().getExtras().getString("addy");
        final String quanty = getIntent().getExtras().getString("quanty");
        final String item = getIntent().getExtras().getString("item");
        final String tPrice = getIntent().getExtras().getString("tprice");

        TextView Name = (TextView) findViewById(name1);
        TextView Number = (TextView) findViewById(R.id.mobile);
        TextView address = (TextView) findViewById(R.id.myaddress);
        TextView quantity = (TextView) findViewById(R.id.Quantity);
        TextView itemy = (TextView) findViewById(R.id.item);
        TextView TotPrice = (TextView) findViewById(R.id.price);

        //setText
        Name.setText(name);
        Number.setText(num);
        address.setText(addy);
        quantity.setText(quanty);
        itemy.setText(item);
        TotPrice.setText(tPrice);


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"goelaakash79@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "RESTURA-DE-ORDERA");
        intent.putExtra(Intent.EXTRA_TEXT   , "\tName: " + name + "\n" +
                "\tContact Number: " + num + "\n" + "\tAddress: " + addy + "\n" +
                "\tItems Ordered: " + item + "\n" + "\tQuantity: " + quanty + "\n" +
                "\tPrice: " + tPrice + "\n\n\n\tHave a nice day!!");
        try {
            startActivity(Intent.createChooser(intent, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(OrderSummaryActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}
