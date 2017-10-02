package com.android.keerthini.banknotification;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    private EditText editTextAmount;
    private Button buttonPay;
    private String amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        editTextAmount = (EditText) findViewById(R.id.textview_amount);
        buttonPay = (Button) findViewById(R.id.button_pay);
        buttonPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
                Log.d("deviceToken", android_id);
                amount = editTextAmount.getText().toString();
                if (amount != null && !amount.equals(""))
                    if (Integer.parseInt(amount) >= 50000) {
                        Toast.makeText(getApplicationContext(), "Large deposit", Toast.LENGTH_SHORT).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Small deposit", Toast.LENGTH_SHORT).show();
                    }
            }
        });

    }
}
