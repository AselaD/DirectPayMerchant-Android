package com.example.user.merchantapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class BillServices extends AppCompatActivity {

    private LinearLayout linearLayout;
    JSONObject jsonObject = new JSONObject();
    public static final String BUTTON_TEXT_TWO = "BUTTON_TEXT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_services);

        getSupportActionBar().setTitle("Bill Payment Categories");
        Intent buttonIntent = getIntent();
        String buttonText = buttonIntent.getStringExtra(MainActivity.START_TEXT);
        String buttonTextTwo = buttonIntent.getStringExtra(MobileActivity.BILL_PAYMENT_TYPE);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayoutTwo);


        try {
            jsonObject = new JSONObject(DummyData.dummyData);
            JSONArray categoryList = jsonObject.getJSONArray("Category");

            Log.d("Category", categoryList.toString());
            Log.d("DUMMYDATA", DummyData.dummyData.toString());

            for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                JSONArray name = firstObject.getJSONArray("Other Services");
                Log.d("Other Services", name.toString());


                for (int i = 0; i < name.length(); i++) {
                    JSONObject otherObject = name.getJSONObject(i);
                    JSONArray otherName = otherObject.getJSONArray("Other Service");
                    Log.d("otherName", otherName.toString());
                    Iterator<String> iterator = otherObject.keys();
                    while (iterator.hasNext()) {
                        String currentKey = iterator.next();
                        Log.d("currentKey", currentKey);

                        final Button button = new Button(this);
                        button.setTextColor(Color.WHITE);
                       // LinearLayout layout = new LinearLayout(this);
                        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                        lp.setMargins(10, 10, 10, 10);
                        button.setLayoutParams(lp);
                        button.setText(currentKey);
                        button.setBackgroundResource(R.drawable.shape);
                        linearLayout.addView(button);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(BillServices.this, MobileActivity.class);
                                intent.putExtra(BUTTON_TEXT_TWO, button.getText());
                                startActivity(intent);
                                Log.d(BUTTON_TEXT_TWO, button.getText().toString());
                                //finish();


                            }
                        });

                    }


                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    }

