package com.example.a.traffice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   //Main Metod
public void clickAboutMe(View view){
    Intent objIntent = new Intent(Intent.ACTION_VIEW);
    objIntent.setData(Uri.parse("www.csclub.ssru.ac.th/s56122201016/CSC3215"))
    startActivity(objIntent);
}   //Click
}
