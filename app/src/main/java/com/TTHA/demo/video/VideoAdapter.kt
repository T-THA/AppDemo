package com.TTHA.demo

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class VideoAdapter :RecyclerView.Adapter<VideoViewHolder>{
    private val list: List<VideoItem>

    constructor(list: List<VideoItem>){
        this.list = list
    }

    companion object{
        private var count: Int = 0
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycleview_video, parent, false)
        val viewHolder = VideoViewHolder(view)
        Log.i("VideoAdapter","Create count: ${count++}")
        viewHolder.cover.setOnClickListener{
            var intent: Intent? = null
            intent = Intent(parent.context,VideoDetailActivity::class.java)
//            intent.putExtra("uri",list[viewHolder.loca % list.size].uri)
            intent.putExtra("uri",list[0].uri)

            Log.i("VideoAdapter","Lister count: ${count++}")
            parent.context.startActivity(intent)
        }
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val item = list[position%list.size]
        item.title?.let {
            holder.title.text = it
        }
        item.cover?.let {
            holder.cover.setImageResource(it)
        }
        item.uri?.let {
            item.uri
        }
    }

    override fun getItemCount(): Int {
        return Int.MAX_VALUE
    }
}