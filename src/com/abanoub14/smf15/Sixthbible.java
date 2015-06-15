package com.abanoub14.smf15;



import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Sixthbible extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sixthbible);
		
        Button mainNext = (Button) findViewById(R.id.sixthbooka);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthbook");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.sixthbiblehome);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.sixthbibleback);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixth");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.sixthbibletest);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthbibletests");
                startActivity(i);
            }
        });

        Button mainNext4 = (Button) findViewById(R.id.sixthbibleexam);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Sixthbibleexam");
                startActivity(i);
            }
        });
	}
}
