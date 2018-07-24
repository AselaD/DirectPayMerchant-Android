package com.example.user.merchantapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button mBtnBillers;
    public static final String START_TEXT = "START_TEXT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Payment Type");

        mBtnBillers = (Button) findViewById(R.id.btnBillers);
        mBtnBillers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, BillPaymentCategoryAcitivity.class);
                intent.putExtra(START_TEXT, mBtnBillers.getText());
                startActivity(intent);

            }
        });

    }


}
