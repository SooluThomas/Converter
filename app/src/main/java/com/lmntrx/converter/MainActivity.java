package com.lmntrx.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText usd= (EditText)findViewById(R.id.usd);
        int usdtext=Integer.parseInt(usd.getText().toString());
        Button button= (Button)findViewById(R.id.convert);
        int inr=usdtext*65;

        Toast.makeText(this, inr + "rupees", Toast.LENGTH_LONG).show();
        Intent myintent = new Intent(this, Main2Activity.class);
        startActivity(myintent);
        finish();

    }
}
