package com.TTHA.demo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.TTHA.demo.WeatherAdapter
import com.TTHA.demo.WeatherItem
import kotlin.random.Random

class WeatherActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val button:Button = findViewById(R.id.button4)
        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent: Intent? = null
                intent = Intent(this@WeatherActivity,IndexActivity::class.java)
                startActivity(intent)
            }
        })

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView2)
        val adapter: WeatherAdapter = WeatherAdapter(InitWeatherData())
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }

    private fun InitWeatherData(): ArrayList<WeatherItem>{
        val list = ArrayList<WeatherItem>()
        list.add(WeatherItem("现在",R.drawable.rain_icon,"30℃"))

        var count :Int = 15
        while (count <= 23) {
            var temp = Random(count).nextInt(28, 35)
            val firstItem = WeatherItem("$count" + "时",R.drawable.cloud_icon,"$temp"+"℃")
            count++
            temp = Random(count).nextInt(28, 35)
            val secondItem = WeatherItem("$count" + "时",R.drawable.rain_icon,"$temp"+"℃")
            count++
            list.add(firstItem)
            list.add(secondItem)
        }
        return list
    }
}