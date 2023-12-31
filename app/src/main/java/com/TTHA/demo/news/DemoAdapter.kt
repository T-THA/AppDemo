package com.TTHA.demo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.TTHA.demo.R.layout.recycleview_item


/**
 * @author: xiejikun
 * @since: 2023/7/7
 */
class DemoAdapter : RecyclerView.Adapter<DemoViewHolder> {

    /** 保存数据的列表 */
    private val demoList: List<ItemBean>

    constructor(demoList: List<ItemBean>) {
        this.demoList = demoList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(recycleview_item, parent, false)
        val viewHolder = DemoViewHolder(view)
        //点击事件
        viewHolder.tvTitle.setOnClickListener{
            var intent: Intent? = null
            // 此处可传递数据，先硬编码
            intent = Intent(parent.context,NewDetailActivity::class.java)
            parent.context.startActivity(intent)
        }
        return DemoViewHolder(view)
    }


    override fun onBindViewHolder(holder: DemoViewHolder, position: Int) {
        val itemBean = demoList[position]

        itemBean.coverUrl?.let {
            holder.ivCover?.setImageResource(it)
        }

        itemBean.title?.let {
            holder.tvTitle.text = it
        }

        itemBean.content?.let {
            holder.tvContent.text = it
        }
    }


    override fun getItemCount(): Int {
        return demoList.size
    }


}