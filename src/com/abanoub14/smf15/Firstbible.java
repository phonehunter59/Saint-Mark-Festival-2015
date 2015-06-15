package com.abanoub14.smf15;



import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Firstbible extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstbible);
		
        Button mainNext = (Button) findViewById(R.id.firstbooka);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Firstbook");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.firstbiblehome);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.firstbibleback);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.First");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.firstbibletest);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Firstbibletests");
                startActivity(i);
            }
        });

        Button mainNext4 = (Button) findViewById(R.id.firstbibleexam);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Firstbibleexam");
                startActivity(i);
            }
        });
	}
}
