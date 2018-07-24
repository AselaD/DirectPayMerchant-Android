package com.example.user.merchantapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class MobileActivity extends AppCompatActivity {

    private ImageButton mImgOne, mImgTwo, mImgThree, mIngFour, mImgFive, mImgSix;
    JSONObject jsonObject = new JSONObject();
    public static final String BILL_PAYMENT_TYPE = "SERVICE_TYPE";
    public String itemOne, itemTwo, itemThree, itemFour, itemFive, itemSix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);
        getSupportActionBar().setTitle("Bill Payment");

        Intent buttonIntent = getIntent();
        String buttonText = buttonIntent.getStringExtra(BillPaymentCategoryAcitivity.BUTTON_TEXT);
        String buttonTextTwo=buttonIntent.getStringExtra(BillServices.BUTTON_TEXT_TWO);
        mImgOne = (ImageButton) findViewById(R.id.imgButtonOne);
        mImgTwo = (ImageButton) findViewById(R.id.imgButtonTwo);
        mIngFour = (ImageButton) findViewById(R.id.imgButtonFour);
        mImgThree = (ImageButton) findViewById(R.id.imgButtonThree);
        mImgFive = (ImageButton) findViewById(R.id.imgButtonFive);
        mImgSix = (ImageButton) findViewById(R.id.imgButtonSix);


        try {
            jsonObject = new JSONObject(DummyData.dummyData);
            JSONArray categoryList = jsonObject.getJSONArray("Category");
            if (buttonText.equals("Mobile")) {
                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Mobile");


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject catName = name.getJSONObject(i);

                        String itemName = catName.getString("Name");
                        String code = catName.getString("code");
                        String icon = catName.getString("icon");

                        Log.d("ITEMNAME", itemName.toString());

                        Log.d("CODE", code.toString());

                        Log.d("ICON", icon.toString());


                        if (itemName.equals("Mobitel")) {
                            mImgOne.setBackgroundResource(R.drawable.mobitel_163);
                            itemOne = "Mobitel";


                        }
                        if (itemName.equals("Hutch")) {
                            mImgThree.setBackgroundResource(R.drawable.hutch_163);
                            itemThree = "Hutch";

                        }
                        if (itemName.equals("Etisalat")) {
                            mIngFour.setBackgroundResource(R.drawable.etisalat_163);
                            itemFour = "Etisalat";

                        }

                        if (itemName.equals("Airtel")) {
                            mImgTwo.setBackgroundResource(R.drawable.mobitel_163);
                            itemThree = "Airtel";

                        }
                        mImgFive.setVisibility(View.GONE);
                        mImgSix.setVisibility(View.GONE);

                    }


                }

            } else if (buttonText.equals("Telephone")) {
                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Telephone");


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject catName = name.getJSONObject(i);

                        String itemName = catName.getString("Name");
                        String code = catName.getString("code");
                        String icon = catName.getString("icon");

                        Log.d("ITEMNAME", itemName.toString());

                        Log.d("CODE", code.toString());

                        Log.d("ICON", icon.toString());


                        if (itemName.equals("SLT")) {
                            mImgOne.setBackgroundResource(R.drawable.slt_163);
                            itemOne = "SLT";

                        }
                        if (itemName.equals("LankaBell")) {
                            mImgTwo.setBackgroundResource(R.drawable.lankabell_163);
                            itemTwo = "LankaBell";
                        }
                        if (itemName.equals("CityLink")) {
                            mImgThree.setBackgroundResource(R.drawable.citilink_163);
                            itemThree = "CityLink";

                        }
                        mIngFour.setVisibility(View.GONE);
                        mImgFive.setVisibility(View.GONE);
                        mImgSix.setVisibility(View.GONE);

                    }

                }
            } else if (buttonText.equals("Internet")) {
                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Internet");


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject catName = name.getJSONObject(i);

                        String itemName = catName.getString("Name");
                        String code = catName.getString("code");
                        String icon = catName.getString("icon");

                        Log.d("ITEMNAME", itemName.toString());

                        Log.d("CODE", code.toString());

                        Log.d("ICON", icon.toString());


                        if (itemName.equals("Mobitel")) {
                            mImgOne.setBackgroundResource(R.drawable.mobitel_163);
                            itemOne = "Mobitel";

                        }
                        if (itemName.equals("Hutch")) {
                            mImgThree.setBackgroundResource(R.drawable.hutch_163);
                            itemThree = "Hutch";
                        }
                        if (itemName.equals("Etisalat")) {
                            mIngFour.setBackgroundResource(R.drawable.etisalat_163);
                            itemFour = "Etisalat";

                        }

                        if (itemName.equals("Airtel")) {
                            mImgTwo.setBackgroundResource(R.drawable.mobitel_163);
                            itemTwo = "Airtel";

                        }
                        mImgFive.setVisibility(View.GONE);
                        mImgSix.setVisibility(View.GONE);


                    }


                }
            } else if (buttonText.equals("Utility")) {
                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Utility");
                    Log.d("Utility", name.toString());


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject catName = name.getJSONObject(i);

                        String itemName = catName.getString("Name");
                        String code = catName.getString("code");
                        String icon = catName.getString("icon");

                        Log.d("ITEMNAME", itemName.toString());

                        Log.d("CODE", code.toString());

                        Log.d("ICON", icon.toString());


                        if (itemName.equals("Ceb")) {
                            mImgOne.setBackgroundResource(R.drawable.ceb_163);
                            itemOne = "Ceb";

                        }
                        if (itemName.equals("Leco")) {
                            mImgTwo.setBackgroundResource(R.drawable.leco_163);
                            itemTwo = "Leco";
                        }
                        if (itemName.equals("Water Board")) {
                            mImgThree.setBackgroundResource(R.drawable.waterboard_163);
                            itemThree = "Water Board";
                        }


                    }
                    mIngFour.setVisibility(View.GONE);
                    mImgFive.setVisibility(View.GONE);
                    mImgSix.setVisibility(View.GONE);


                }
            } else if (buttonText.equals("Television")) {
                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Television");
                    Log.d("Television", name.toString());


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject catName = name.getJSONObject(i);

                        String itemName = catName.getString("Name");
                        String code = catName.getString("code");
                        String icon = catName.getString("icon");

                        Log.d("ITEMNAME", itemName.toString());

                        Log.d("CODE", code.toString());

                        Log.d("ICON", icon.toString());


                    }
                    mImgOne.setVisibility(View.GONE);
                    mImgThree.setVisibility(View.GONE);
                    mIngFour.setVisibility(View.GONE);
                    mImgTwo.setVisibility(View.GONE);
                    mImgFive.setVisibility(View.GONE);
                    mImgSix.setVisibility(View.GONE);


                }
            } else if (buttonText.equals("Other Services")) {
                mImgOne.setVisibility(View.GONE);
                mImgThree.setVisibility(View.GONE);
                mIngFour.setVisibility(View.GONE);
                mImgTwo.setVisibility(View.GONE);
                mImgFive.setVisibility(View.GONE);
                mImgSix.setVisibility(View.GONE);

                Intent intent = new Intent(MobileActivity.this, BillServices.class);
                //intent.putExtra(BUTTON_TEXT, button.getText());
                startActivity(intent);
                finish();

            }

            if(buttonTextTwo.equals("Other Service")){

                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Other Services");
                    Log.d("Other Services", name.toString());


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject otherObject = name.getJSONObject(i);
                        JSONArray otherName = otherObject.getJSONArray("Other Service");
                        Log.d("otherName", otherName.toString());


                            for (int j = 0; j < otherName.length(); j++) {
                            JSONObject catName2 = otherName.getJSONObject(j);

                            String itemName = catName2.getString("Name");
                            String code = catName2.getString("code");
                            String icon = catName2.getString("icon");

                            Log.d("ITEMNAME", itemName.toString());

                            Log.d("CODE", code.toString());

                            Log.d("ICON", icon.toString());


                            if (itemName.equals("LittleHeart")) {
                                mImgOne.setBackgroundResource(R.drawable.little_hearts_163);
                                itemOne="LittleHeart";
                            }
                            if (itemName.equals("HelpAge")) {
                                mImgTwo.setBackgroundResource(R.drawable.help_age_163);
                                itemTwo="HelpAge";
                            }


                        }
                        mImgThree.setVisibility(View.GONE);
                        mIngFour.setVisibility(View.GONE);
                        mImgFive.setVisibility(View.GONE);
                        mImgSix.setVisibility(View.GONE);

                    }
                }


            }

            if(buttonTextTwo.equals("Insurance")){

                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Other Services");
                    Log.d("Other Services", name.toString());


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject otherObject = name.getJSONObject(i);
                        JSONArray otherName = otherObject.getJSONArray("Insurance");
                        Log.d("otherName", otherName.toString());


                        for (int j = 0; j < otherName.length(); j++) {
                            JSONObject catName2 = otherName.getJSONObject(j);

                            String itemName = catName2.getString("Name");
                            String code = catName2.getString("code");
                            String icon = catName2.getString("icon");

                            Log.d("ITEMNAME", itemName.toString());

                            Log.d("CODE", code.toString());

                            Log.d("ICON", icon.toString());


                            if (itemName.equals("AIA")) {
                                mImgOne.setBackgroundResource(R.drawable.aia_163);
                                itemOne="AIA";
                            }
                            if (itemName.equals("AsianAllainceInsuarance")) {
                                mImgTwo.setBackgroundResource(R.drawable.asiance_alliance_163);
                                itemTwo="AsianAllainceInsuarance";
                            }
                            if(itemName.equals("UnionAssuarance")){
                                mImgThree.setBackgroundResource(R.drawable.union_assurence_163);
                                itemThree="UnionAssuarance";
                            }
                            if(itemName.equals("Janashakthi")){
                                mIngFour.setBackgroundResource(R.drawable.janashakthi_163);
                                itemFour="Janashakthi";
                            }
                            if(itemName.equals("HNBAssuarance")){
                                mImgFive.setBackgroundResource(R.drawable.hnb_163);
                                itemFive="HNBAssuarance";
                            }
                            if(itemName.equals("CoopLife")){
                                mImgSix.setBackgroundResource(R.drawable.coop_life_163);
                                itemSix="CoopLife";
                            }


                        }

                    }
                }


            }
            else if(buttonTextTwo.equals("E-Wallets")){
                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Other Services");
                    Log.d("Other Services", name.toString());


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject otherObject = name.getJSONObject(i);
                        JSONArray otherName = otherObject.getJSONArray("E-Wallets");
                        Log.d("otherName", otherName.toString());


                        for (int j = 0; j < otherName.length(); j++) {
                            JSONObject catName2 = otherName.getJSONObject(j);

                            String itemName = catName2.getString("Name");
                            String code = catName2.getString("code");
                            String icon = catName2.getString("icon");

                            Log.d("ITEMNAME", itemName.toString());

                            Log.d("CODE", code.toString());

                            Log.d("ICON", icon.toString());


                            if (itemName.equals("Mcash")) {
                                mImgOne.setBackgroundResource(R.drawable.mobitel_163);
                                itemOne="Mcash";
                            }


                        }
                        mImgThree.setVisibility(View.GONE);
                        mIngFour.setVisibility(View.GONE);
                        mImgFive.setVisibility(View.GONE);
                        mImgSix.setVisibility(View.GONE);
                        mImgTwo.setVisibility(View.GONE);


                    }
                }


            }

           else if(buttonTextTwo.equals("Taxi")){
                for (int noOfCategories = 0; noOfCategories < categoryList.length(); noOfCategories++) {

                    Log.d("JSONARRAY.SIZE()", String.valueOf(categoryList.length()));

                    JSONObject firstObject = categoryList.getJSONObject(noOfCategories);
                    JSONArray name = firstObject.getJSONArray("Other Services");
                    Log.d("Other Services", name.toString());


                    for (int i = 0; i < name.length(); i++) {
                        JSONObject otherObject = name.getJSONObject(i);
                        JSONArray otherName = otherObject.getJSONArray("Taxi");
                        Log.d("otherName", otherName.toString());


                        for (int j = 0; j < otherName.length(); j++) {
                            JSONObject catName2 = otherName.getJSONObject(j);

                            String itemName = catName2.getString("Name");
                            String code = catName2.getString("code");
                            String icon = catName2.getString("icon");

                            Log.d("ITEMNAME", itemName.toString());

                            Log.d("CODE", code.toString());

                            Log.d("ICON", icon.toString());


                            if (itemName.equals("Link")) {
                                mImgOne.setBackgroundResource(R.drawable.link_taxi_163);
                                itemOne="Link";
                            }


                        }
                        mImgThree.setVisibility(View.GONE);
                        mIngFour.setVisibility(View.GONE);
                        mImgFive.setVisibility(View.GONE);
                        mImgSix.setVisibility(View.GONE);
                        mImgTwo.setVisibility(View.GONE);


                    }
                }


            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

            mImgTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MobileActivity.this, BillPayment.class);
                    intent.putExtra(BILL_PAYMENT_TYPE, itemTwo);
                    startActivity(intent);
                    //finish();


                }
            });

            mIngFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MobileActivity.this, BillPayment.class);
                    intent.putExtra(BILL_PAYMENT_TYPE, itemFour);
                    startActivity(intent);
                    //finish();

                }
            });

            mImgThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mImgThree.getDrawable();
                    Intent intent = new Intent(MobileActivity.this, BillPayment.class);
                    intent.putExtra(BILL_PAYMENT_TYPE, itemThree);
                    startActivity(intent);
                    //finish();

                }
            });

            mImgOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MobileActivity.this, BillPayment.class);
                    intent.putExtra(BILL_PAYMENT_TYPE, itemOne);
                    startActivity(intent);
                    //finish();

                }
            });
        mImgFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MobileActivity.this, BillPayment.class);
                intent.putExtra(BILL_PAYMENT_TYPE, itemFive);
                startActivity(intent);
                //finish();

            }
        });

        mImgSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MobileActivity.this, BillPayment.class);
                intent.putExtra(BILL_PAYMENT_TYPE, itemSix);
                startActivity(intent);
                //finish();

            }
        });


        }
    }

