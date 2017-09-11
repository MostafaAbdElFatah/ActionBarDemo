package com.mostafaabdel_fatah.actionbardemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void startActivity3_btnClicked(View view) {
        startActivity(new Intent(Main2Activity.this,Main3Activity.class));
    }
}
