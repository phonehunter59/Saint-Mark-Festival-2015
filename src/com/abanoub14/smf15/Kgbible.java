package com.abanoub14.smf15;



import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Kgbible extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kgbible);
		
        Button mainNext = (Button) findViewById(R.id.kgbooka);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Kgbook");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.kgbiblehome);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.kgbibleback);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Kg");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.kgbibletest);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Kgbibletests");
                startActivity(i);
            }
        });

        Button mainNext4 = (Button) findViewById(R.id.kgbibleexam);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Kgbibleexam");
                startActivity(i);
            }
        });
	}
}
