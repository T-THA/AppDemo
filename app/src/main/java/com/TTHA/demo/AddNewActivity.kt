package com.TTHA.demo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity

class AddNewActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addnew)

        // 点击返回
        val back: Button = findViewById(R.id.button6)
        back.setOnClickListener(object : android.view.View.OnClickListener{
            override fun onClick(v: android.view.View?) {
                var intent: Intent? = null
                intent = Intent(this@AddNewActivity,IndexActivity::class.java)
                startActivity(intent)
            }
        })

        // 选取照片
        val photo: Button = findViewById(R.id.button8)
        photo.setOnClickListener(object : android.view.View.OnClickListener{
            override fun onClick(v: android.view.View?) {
                openCamera()
            }
        })

        // 点击提交
        val submit: Button = findViewById(R.id.button7)
        submit.setOnClickListener(object : android.view.View.OnClickListener{
            override fun onClick(v: android.view.View?) {
                Toast.makeText(this@AddNewActivity,"提交成功", Toast.LENGTH_SHORT).show()
                var intent: Intent? = null
                intent = Intent(this@AddNewActivity,IndexActivity::class.java)
                startActivity(intent)
            }
        })

    }

    private fun openCamera(){
        val intent = Intent("android.media.action.IMAGE_CAPTURE")
        startActivity(intent)
    }
}