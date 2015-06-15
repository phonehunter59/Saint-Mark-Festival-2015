package com.abanoub14.smf15;



import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Thirdbible extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdbible);
		
        Button mainNext = (Button) findViewById(R.id.thirdbooka);
        mainNext.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Thirdbook");
                startActivity(i);
            }
        });
        
        Button mainNext1 = (Button) findViewById(R.id.thirdbiblehome);
        mainNext1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Grades");
                startActivity(i);
            }
        });
        
        Button mainNext2 = (Button) findViewById(R.id.thirdbibleback);
        mainNext2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Third");
                startActivity(i);
            }
        });
        
        Button mainNext3 = (Button) findViewById(R.id.thirdbibletest);
        mainNext3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Thirdbibletests");
                startActivity(i);
            }
        });

        Button mainNext4 = (Button) findViewById(R.id.thirdbibleexam);
        mainNext4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClassName("com.abanoub14.smf15", "com.abanoub14.smf15.Thirdbibleexam");
                startActivity(i);
            }
        });
	}
}