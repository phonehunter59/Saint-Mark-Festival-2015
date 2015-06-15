package com.abanoub14.smf15;



import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;


public class Firstbook extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.firstbook);
		
		WebView mywebview = (WebView) findViewById(R.id.firstbook);
		 mywebview.loadUrl("file:///android_asset/1-2/1-2.html");
		 WebSettings webSettings = mywebview.getSettings();
		 webSettings.setJavaScriptEnabled(true);
		 webSettings.setBuiltInZoomControls(true);
		 webSettings.setSupportZoom(true);
		 mywebview.setWebViewClient(new WebViewClient());
	}
}
