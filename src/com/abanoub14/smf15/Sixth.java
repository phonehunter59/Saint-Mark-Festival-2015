package com.abanoub14.smf15;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class Sixth extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sixth);
		
        Button mainNext = (Button) findViewById(R.id.sixthhome);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.sixthbible);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthbible");
                startActivity(i);
            }
        });
        Button mainNext2 = (Button) findViewById(R.id.sixthhymns);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthhymns");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.sixthcoptic);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthcoptic");
                startActivity(i);
            }
        });
        
        Button mainNext4 = (Button) findViewById(R.id.sixthsports);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthsports");
                startActivity(i);
            }
        });
        
        Button mainNext5 = (Button) findViewById(R.id.sixthresearch);
        mainNext5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthresearch");
                startActivity(i);
            }
        });
        
        Button mainNext6 = (Button) findViewById(R.id.sixthchoir);
        mainNext6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthchoir");
                startActivity(i);
            }
        });
        
        Button mainNext7 = (Button) findViewById(R.id.sixthelectronics);
        mainNext7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthelectronics");
                startActivity(i);
            }
        });
	}
}
