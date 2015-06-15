package com.abanoub14.smf15;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class Update extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.update);
	    
	    findViewById(R.id.updatechecking).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "market://details?id=com.abanoub14.smf15";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
	}
}
