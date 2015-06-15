package com.abanoub14.smf15;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class Ninth extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ninth);
		

        Button mainNext = (Button) findViewById(R.id.ninthhome);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.ninthbible);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthbible");
                startActivity(i);
            }
        });
        Button mainNext2 = (Button) findViewById(R.id.ninthhymns);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthhymns");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.ninthcoptic);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthcoptic");
                startActivity(i);
            }
        });
        
        Button mainNext4 = (Button) findViewById(R.id.ninthsports);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthsports");
                startActivity(i);
            }
        });
        
        Button mainNext5 = (Button) findViewById(R.id.ninthresearch);
        mainNext5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthresearch");
                startActivity(i);
            }
        });
        
        Button mainNext6 = (Button) findViewById(R.id.ninthchoir);
        mainNext6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthchoir");
                startActivity(i);
            }
        });
        
        Button mainNext7 = (Button) findViewById(R.id.ninthelectronics);
        mainNext7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthelectronics");
                startActivity(i);
            }
        });
	}
}
