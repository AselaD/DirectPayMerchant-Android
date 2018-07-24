package com.example.user.merchantapp;


import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class BillPayment extends AppCompatActivity {

    private EditText mTxtPhoneNumber, mAmount;
    private Button mBtnSubmit;
    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Bill Payment");

        setContentView(R.layout.activity_bill_payment);
        Intent buttonIntent = getIntent();
        String buttonText = buttonIntent.getStringExtra(MobileActivity.BILL_PAYMENT_TYPE);
        mTxtPhoneNumber=(EditText)findViewById(R.id.txtPhone);
        mAmount=(EditText)findViewById(R.id.txtAmount);
        mBtnSubmit=(Button)findViewById(R.id.btnSubmit);
        mImage=(ImageView)findViewById(R.id.imageViewIcon) ;

        if(buttonText.equals("Mobitel")){
            mImage.setImageResource(R.drawable.mobitel_163);
        }
        if(buttonText.equals("Hutch")){
            mImage.setImageResource(R.drawable.hutch_163);
        }
        if(buttonText.equals("Etisalat")){
            mImage.setImageResource(R.drawable.etisalat_163);
        }
       if(buttonText.equals("Airtel")){
            mImage.setImageResource(R.drawable.hutch_163);
        }
        if(buttonText.equals("SLT")){
            mImage.setImageResource(R.drawable.slt_163);
        }
        if(buttonText.equals("LankaBell")){
            mImage.setImageResource(R.drawable.lankabell_163);
        }
        if(buttonText.equals("CityLink")){
            mImage.setImageResource(R.drawable.citilink_163);
        }
        if(buttonText.equals("Ceb")){
            mImage.setImageResource(R.drawable.ceb_163);
        }
        if(buttonText.equals("Leco")){
            mImage.setImageResource(R.drawable.leco_163);
        }
        if(buttonText.equals("Water Board")){
            mImage.setImageResource(R.drawable.waterboard_163);
        }
        if(buttonText.equals("LittleHeart")){
            mImage.setImageResource(R.drawable.little_hearts_163);
        }
        if(buttonText.equals("HelpAge")){
            mImage.setImageResource(R.drawable.help_age_163);
        }
        if(buttonText.equals("Link")){
            mImage.setImageResource(R.drawable.link_taxi_163);
        }
        if(buttonText.equals("Mcash")){
            mImage.setImageResource(R.drawable.mobitel_163);
        }
        if(buttonText.equals("CoopLife")){
            mImage.setImageResource(R.drawable.coop_life_163);
        }
        if(buttonText.equals("HNBAssuarance")){
            mImage.setImageResource(R.drawable.hnb_163);
        }
        if(buttonText.equals("AIA")){
            mImage.setImageResource(R.drawable.aia_163);
        }
        if(buttonText.equals("Janashakthi")){
            mImage.setImageResource(R.drawable.janashakthi_163);
        }

        if(buttonText.equals("UnionAssuarance")){
            mImage.setImageResource(R.drawable.union_assurence_163);
        }
        if(buttonText.equals("AsianAllainceInsuarance")){
            mImage.setImageResource(R.drawable.asiance_alliance_163);
        }


        mBtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if( TextUtils.isEmpty(mTxtPhoneNumber.getText())){

                    mTxtPhoneNumber.setError( "Phone Number is required!" );

                }

                if( TextUtils.isEmpty(mAmount.getText())){

                    mAmount.setError( "Amount is required!" );

                }

                String phoneNumber= mTxtPhoneNumber.getText().toString();
                String amount=mAmount.getText().toString();

                String regexStr = "^[0-9]{10}$";
                if (phoneNumber.matches(regexStr)){

                }
                else {
                    mTxtPhoneNumber.setError("Invalid Phone Number");

                }


                    try {
                    double num = Double.parseDouble(amount);
                    Log.i("",num+" is a number");
                } catch (NumberFormatException e) {
                    mAmount.setError("Please enter a valid amount");
                }

            }
        });


    }

}
