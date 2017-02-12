package com.saaliklok.tipalo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class input extends AppCompatActivity {

    double numPeople;
    double numinitBill;
    double numtipPercent;
    double totalBill;
    double tipAmount;
    double tipPerPerson;
    double billPerPerson;

    //The Inputs
    EditText initBill = (EditText) findViewById(R.id.billInitial);
    EditText people = (EditText) findViewById(R.id.numberPeople);
    EditText tipPercent = (EditText) findViewById(R.id.tipPercent);

    //The Text Views
    TextView title = (TextView) findViewById(R.id.titleView);
    TextView billQuestion = (TextView) findViewById(R.id.billQuestion);
    TextView splitBetween = (TextView) findViewById(R.id.splitBetween);
    TextView loveWaiter = (TextView) findViewById(R.id.loveWaiter);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        //Define the custom font and set all of the text views to that font
        Typeface raleway = Typeface.createFromAsset(getAssets(), "fonts/Raleway-Regular.ttf");
        title.setTypeface(raleway);
        billQuestion.setTypeface(raleway);
        splitBetween.setTypeface(raleway);
        loveWaiter.setTypeface(raleway);

        Button submitButton = (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Getting all the EditText Values as Strings
                String strInitBill = initBill.getText().toString();
                String strPeople = people.getText().toString();
                String strtipPercent = tipPercent.getText().toString();

                //Convert all of the inputs that are strings into doubles
                numinitBill = Double.valueOf(strInitBill);
                numPeople = Double.valueOf(strPeople);
                numtipPercent = Double.valueOf(strtipPercent);

                //Calculate all of the final numbers the user needs
                tipAmount = numinitBill * numtipPercent;
                totalBill = numinitBill + tipAmount;
                billPerPerson = totalBill/numPeople;
                tipPerPerson = tipAmount/numPeople;

                Log.i("TotalBill", "Total Bill:" + totalBill);
                Log.i("BillPer", "Bill Per Person:" + billPerPerson);
            }
        });
    }
}
