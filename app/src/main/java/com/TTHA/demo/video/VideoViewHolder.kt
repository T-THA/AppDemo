package com.TTHA.demo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VideoViewHolder: RecyclerView.ViewHolder {
    var cover: ImageView
        private set
    var title: TextView
        private set

    constructor(view: View) : super(view) {
        cover = view.findViewById(R.id.video_cover)
        title = view.findViewById(R.id.video_title)
    }

}