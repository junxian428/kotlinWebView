package com.example.webviewpos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.webViewClient = WebViewClient()

        myWebView.loadUrl("http://147.158.42.236/POS")
        myWebView.settings.javaScriptEnabled = true






    }
}