package com.abanoub14.smf15;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Kghymns extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kghymns);
		
		
        Button mainNext = (Button) findViewById(R.id.kghymnshome);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.kghymnsback);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.KG");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.agios);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Agios");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.hiten);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Hiten");
                startActivity(i);
            }
        });
        
        Button mainNext4 = (Button) findViewById(R.id.tengousht);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Tengousht");
                startActivity(i);
            }
        });

    }

 
    }
	

