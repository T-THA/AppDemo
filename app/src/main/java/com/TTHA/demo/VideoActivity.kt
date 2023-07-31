package com.TTHA.demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.VideoView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class VideoActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
//        var videoView: VideoView = findViewById(R.id.videoView)
//        videoView.setVideoURI(Uri.parse("android.resource://$packageName/${R.raw.video}"))
//        videoView.start()

        // 设置视频
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView3)
        val adapter = VideoAdapter(InitVideoData())
        recyclerView?.adapter = adapter
        recyclerView?.layoutManager = LinearLayoutManager(this)




        // 点击关于
        val video: Button = findViewById(R.id.videobutton3)
        video.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent: Intent? = null
                intent = Intent(this@VideoActivity,AboutActivity::class.java)
                startActivity(intent)

            }
        })

        // 点击首页
        val index: Button = findViewById(R.id.videobutton)
        index.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent: Intent? = null
                intent = Intent(this@VideoActivity,IndexActivity::class.java)
                startActivity(intent)
            }
        })
    }

    private fun InitVideoData(): ArrayList<VideoItem>{
        val videoList = ArrayList<VideoItem>()
        videoList.add(VideoItem("1111",R.raw.video1,R.drawable.rinze))
        videoList.add(VideoItem("2222",R.raw.video2,R.drawable.rinze))
        videoList.add(VideoItem("3333",R.raw.video,R.drawable.loading))
        videoList.add(VideoItem("4444",R.raw.video1,R.drawable.background2))
        videoList.add(VideoItem("5555",R.raw.video2,R.drawable.background1))
        return videoList
    }

}