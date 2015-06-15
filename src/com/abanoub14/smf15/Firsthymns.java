package com.abanoub14.smf15;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Firsthymns extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firsthymns);
		
		
        Button mainNext = (Button) findViewById(R.id.firsthymnshome);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.firsthymnsback);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.First");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.fai);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Fai");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.gospel);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Gospel");
                startActivity(i);
            }
        });
        
        Button mainNext4 = (Button) findViewById(R.id.psalm);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Psalm");
                startActivity(i);
            }
        });

    }

 
    }
	
