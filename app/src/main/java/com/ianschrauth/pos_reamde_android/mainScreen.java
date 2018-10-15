package com.ianschrauth.pos_reamde_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mainScreen extends AppCompatActivity {
   static double grandtotal = 0.00;


    public void VEClicked (View view){

    }

    public void payClick (View view) {

    }

    public void PIATWClcik (View view) {
        TextView total = (TextView)findViewById(R.id.totalPrice);
        bookButtons bb = new bookButtons();
        bb.PIATW();
        double calculatedGrandTotal = (grandtotal / 100) * 100;
        total.setText(Double.toString(calculatedGrandTotal));

    }
    public void CIATWClcik (View view) {
        TextView total = (TextView)findViewById(R.id.totalPrice);
        bookButtons bb = new bookButtons();
        bb.CIATW();
        double calculatedGrandTotal = (grandtotal / 100) * 100;
        total.setText(Double.toString(calculatedGrandTotal));

    }
    public void BIATWClcik (View view) {
        TextView total = (TextView)findViewById(R.id.totalPrice);
        bookButtons bb = new bookButtons();
        bb.BIATW();
        double calculatedGrandTotal = (grandtotal / 100) * 100;
        total.setText(Double.toString(calculatedGrandTotal));

    }
    public void SIATW1Clcik (View view) {
        TextView total = (TextView)findViewById(R.id.totalPrice);
        bookButtons bb = new bookButtons();
        bb.SIATW1();
        double calculatedGrandTotal = (grandtotal / 100) * 100;
        total.setText(Double.toString(calculatedGrandTotal));

    }



    //Vacillaction Saga





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }
}
