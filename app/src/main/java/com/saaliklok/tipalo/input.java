package com.saaliklok.tipalo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);


    }

    public void calculateCheck(){
        //Getting all the EditText Values as Strings
        String strInitBill = initBill.getText().toString();
        String strPeople = people.getText().toString();
        String strtipPercent = tipPercent.getText().toString();

        //Convert all of the inputs that are strings into doubles
        numinitBill = Double.valueOf(strInitBill);
        numPeople = Double.valueOf(strPeople);
        numtipPercent = Double.valueOf(strtipPercent);

        tipAmount = numinitBill * numtipPercent;
        totalBill = numinitBill + tipAmount;
        billPerPerson = totalBill/numPeople;
        tipPerPerson = tipAmount/numPeople;

    }
}
