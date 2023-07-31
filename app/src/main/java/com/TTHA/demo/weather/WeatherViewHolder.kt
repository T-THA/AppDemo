package com.TTHA.demo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WeatherViewHolder: RecyclerView.ViewHolder {
    var time: TextView
        private set
    var symbol: ImageView
        private set
    var temperature: TextView
        private set
    constructor(view: View) : super(view) {
        time = view.findViewById(R.id.weather_time)
        symbol = view.findViewById(R.id.weather_symbol)
        temperature = view.findViewById(R.id.weather_temperature)
    }
}