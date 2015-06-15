package com.abanoub14.smf15;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;


public class Sixthbook extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sixthbook);
		
		WebView mywebview = (WebView) findViewById(R.id.sixthbook);
		 mywebview.loadUrl("file:///android_asset/6-8/6-8.html");
		 WebSettings webSettings = mywebview.getSettings();
		 webSettings.setJavaScriptEnabled(true);
		 webSettings.setBuiltInZoomControls(true);
		 webSettings.setSupportZoom(true);
		 mywebview.setWebViewClient(new WebViewClient());
	}
}
