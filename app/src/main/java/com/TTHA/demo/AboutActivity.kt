package com.TTHA.demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import androidx.activity.ComponentActivity

class AboutActivity :ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // 点击视频
        val video: Button = findViewById(R.id.aboutbutton2)
        video.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent: Intent? = null
                intent = Intent(this@AboutActivity,VideoActivity::class.java)
                startActivity(intent)
            }
        })

        // 点击首页
        val index: Button = findViewById(R.id.aboutbutton)
        index.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent: Intent? = null
                intent = Intent(this@AboutActivity,IndexActivity::class.java)
                startActivity(intent)
            }
        })

        // 渲染html
        val webview: WebView = findViewById(R.id.webview1)
//        webview.loadDataWithBaseURL(null,"<html><body><h1>欢迎来到TTHA</h1><p>这是一个app</p></body></html>","text/html","utf-8",null)
        webview.loadUrl("file:///android_asset/drum.html")
    }
}