package com.example.soumaya.mycv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private Button buttonFormations;
    private Button buttonCompetences;
    private Button buttonExperiences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFormations = (Button) findViewById(R.id.buttonFormations);
        buttonFormations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.formations_layout);
            }
        });


        buttonCompetences = (Button) findViewById(R.id.buttonCompetences);
        buttonCompetences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.competences_layout);
            }
        });


        buttonExperiences = (Button) findViewById(R.id.buttonExperiences);
        buttonExperiences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.experiences_layout);
            }
        });

    }
        public boolean onKeyDown(int keyCode, KeyEvent event){
        if (keyCode == KeyEvent.KEYCODE_BACK){
        setContentView(R.layout.activity_main);
        recreate();
         }


return super.onKeyDown(keyCode,event);

    }
}