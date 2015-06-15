package com.abanoub14.smf15;



import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Ninthbible extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ninthbible);
		
        Button mainNext = (Button) findViewById(R.id.ninthbooka);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthbook");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.ninthbiblehome);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.ninthbibleback);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninth");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.ninthbibletest);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthbibletests");
                startActivity(i);
            }
        });

        Button mainNext4 = (Button) findViewById(R.id.ninthbibleexam);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Ninthbibleexam");
                startActivity(i);
            }
        });
	}
}
