package com.TTHA.demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WeatherAdapter: RecyclerView.Adapter<WeatherViewHolder>{
    private val list: List<WeatherItem>
    constructor(list: List<WeatherItem>){
        this.list = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.recycleview_weather, parent, false)
        return WeatherViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        val item = list[position]
        item.time?.let {
            holder.time.text = it
        }
        item.symbol?.let {
            holder.symbol.setImageResource(it)
        }
        item.temperature?.let {
            holder.temperature.text = it
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}