package com.connecting.firebasetry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button enterID_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textID);
        //textView.setText("Working");
        enterID_java = (Button) findViewById(R.id.enterID);

        enterID_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Weather.class));
            }
        });



    }

    @Override
    public void onClick(View v) {

    }
}
