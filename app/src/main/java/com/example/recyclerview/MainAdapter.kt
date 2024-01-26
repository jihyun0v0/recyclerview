package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemAlphabetBinding
import com.example.recyclerview.util.Logr

class MainAdapter(private val context: Context) : RecyclerView.Adapter<MainViewHolder>() {

    private val inflater by lazy { LayoutInflater.from(context) }

    private var itemList = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        Logr.d(
            "onCreateViewHolder",
            "parent : " + parent.toString() + " viewtype: " + viewType.toString()
        )
        return MainViewHolder(ItemAlphabetBinding.inflate(inflater))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        Logr.d(
            "onBindViewHolder",
            "hodelr :" + holder.toString() + " Position: " + position.toString()
        )
        holder.bind(itemList[position])
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        Logr.d("onAttachedToRecyclerView", "recyclerview : " + recyclerView.toString())
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        Logr.d("onDetachedFromRecyclerView", "recyclerview : " + recyclerView.toString())
    }

    override fun onViewAttachedToWindow(holder: MainViewHolder) {
        super.onViewAttachedToWindow(holder)
        Logr.d("onViewAttachedToWindow", "holder : " + holder.toString())
    }

    override fun onViewDetachedFromWindow(holder: MainViewHolder) {
        super.onViewDetachedFromWindow(holder)
        Logr.d("onViewDetachedFromWindow", "holder : " + holder.toString())
    }

    override fun onViewRecycled(holder: MainViewHolder) {
        super.onViewRecycled(holder)
        Logr.d("onViewRecycled", "holder: " + holder.toString())

    }

    fun setList(newList: MutableList<String>) {
        itemList.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = itemList.size

}