package com.TTHA.demo

import android.net.Uri
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.VideoView
import androidx.activity.ComponentActivity


class VideoDetailActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videodetail)

        var uri = intent.getIntExtra("uri",R.raw.video)
        var videoView: VideoView = findViewById(R.id.videoView)
        videoView.setVideoURI(Uri.parse("android.resource://$packageName/$uri"))
        videoView.start()

        // 暂停和播放
        var back: Button = findViewById(R.id.button9)
        var count = 0
        videoView.setOnClickListener {
            count++
            if (count % 2 == 0) {
                videoView.start()
            }
            else videoView.pause()
        }

        // 点击返回
        back.setOnClickListener(object : OnClickListener{
            override fun onClick(v: android.view.View?) {
                finish()
            }
        })

    }
}