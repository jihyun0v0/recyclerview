package com.example.recyclerview

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.recyclerview.databinding.ItemAlphabetBinding

class MainViewHolder(private val binding: ItemAlphabetBinding) : ViewHolder(binding.root) {
    fun bind(src: String) {
        binding.tvAlphabet.text =
            "oldPosition: " + oldPosition.toString() + "\nadapter position: " + bindingAdapterPosition.toString() + "\nabsolute adapter position: " + absoluteAdapterPosition.toString() + "\nlayoutPosition: " + layoutPosition.toString()
    }
}