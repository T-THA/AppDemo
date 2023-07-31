package com.TTHA.demo

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity

class NewDetailActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newdetail)

        // 返回
        val back = findViewById<android.widget.Button>(R.id.button10)
        back.setOnClickListener {
            finish()
        }

        // webView
        val webView :WebView = findViewById(R.id.webview1)
        webView.loadUrl("file:///android_asset/nggyu.html")

    }
}