package com.TTHA.demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class IndexActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        // 添加新闻recycleView
        val recycleView:RecyclerView = findViewById(R.id.recyclerView1)
        val adapter:DemoAdapter = DemoAdapter(createDemoDate())
        recycleView?.adapter = adapter
        recycleView?.layoutManager = LinearLayoutManager(this)



        // 点击欢迎文字
        val imgview:ImageView = findViewById(R.id.imageView2)
        imgview.setImageDrawable(getDrawable(R.drawable.rinze))
        val textview:TextView = findViewById(R.id.textView3)
        textview.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(v: View?): Boolean {
                Toast.makeText(this@IndexActivity,"百度yyds!",Toast.LENGTH_SHORT).show()
                return true
            }
        })

        // 点击视频
        val video: Button = findViewById(R.id.button2)
        video.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
//                var intent: Intent? = null
//                intent = Intent(Intent.ACTION_VIEW)
//                intent.data = Uri.parse("https://www.bilibili.com/")
//                startActivity(intent)
                var intent: Intent? = null
                intent = Intent(this@IndexActivity,VideoActivity::class.java)
                startActivity(intent)
            }
        })

        // 点击关于
        val about: Button = findViewById(R.id.button3)
        about.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent: Intent? = null
                intent = Intent(this@IndexActivity,AboutActivity::class.java)
                startActivity(intent)
            }
        })

        // 点击天气
        val weather: Button = findViewById(R.id.weather)
        weather.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent: Intent? = null
                intent = Intent(this@IndexActivity,WeatherActivity::class.java)
                startActivity(intent)
            }
        })

        // 搜索
        val searchView = findViewById<SearchView>(R.id.searchView)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(string: String?): Boolean {
                val intent = Intent(this@IndexActivity, WebviewActivity::class.java)
                intent.putExtra("word",string)
                startActivity(intent)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                return false
            }
        })

        // 点击添加新闻
        val addNews: Button = findViewById(R.id.button5)
        addNews.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var intent: Intent? = null
                intent = Intent(this@IndexActivity,AddNewActivity::class.java)
                startActivity(intent)
            }
        })
    }

    fun ShowMessage(view: View){
        Toast.makeText(this,"UwU",Toast.LENGTH_SHORT).show()
    }

    private fun createDemoDate(): ArrayList<ItemBean> {

        val list = ArrayList<ItemBean>()

        val firstItem = ItemBean(R.drawable.background1, "我是圣女",
            "塞西莉亚塞西莉亚塞西莉亚塞西莉亚塞西莉亚塞西莉亚塞西莉亚塞西莉亚塞西莉亚")
        val secondItem =
            ItemBean(R.drawable.background2, "我是王女",
                "艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝艾妮丝")
        val thirdTiem = ItemBean(R.drawable.ic_launcher_background, "我是绿背", "绿背绿背绿背绿背绿背绿背绿背绿背绿背绿背绿背绿背绿背")

        list.add(firstItem)
        list.add(secondItem)
        list.add(thirdTiem)
        return list
    }

}

