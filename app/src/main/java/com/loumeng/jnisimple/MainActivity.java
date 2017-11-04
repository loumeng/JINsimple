package com.loumeng.jnisimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
  private TextView mtext;
    private JNIsimple jnIsimple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtext= (TextView) findViewById(R.id.text);
        jnIsimple=new JNIsimple();
        mtext.setText(jnIsimple.v());

    }




}
