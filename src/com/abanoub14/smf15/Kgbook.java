package com.abanoub14.smf15;



import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;


public class Kgbook extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kgbook);
		
		WebView mywebview = (WebView) findViewById(R.id.kgbook);
		 mywebview.loadUrl("file:///android_asset/kg/kg.html");
		 WebSettings webSettings = mywebview.getSettings();
		 webSettings.setJavaScriptEnabled(true);
		 webSettings.setBuiltInZoomControls(true);
		 webSettings.setSupportZoom(true);
		 mywebview.setWebViewClient(new WebViewClient());
	}
}
