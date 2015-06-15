package com.abanoub14.smf15;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Thirdhymns extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdhymns);
		
		
        Button mainNext = (Button) findViewById(R.id.thirdhymnshome);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.thirdhymnsback);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Third");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.fourth);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Gradethird");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.fifth);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Fifthhymns");
                startActivity(i);
            }
        });
        

    }

 
    }