package com.example.win11.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.win11.R
import com.example.win11.model.Howtofindwinhorse

class WinHorseAdapter(val list: List<Howtofindwinhorse>) :
    RecyclerView.Adapter<WinHorseAdapter.MainHolder>() {

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.findViewById<TextView>(R.id.name_advice)
        val tvAdvice = itemView.findViewById<TextView>(R.id.advice)

        fun bind(name: String, advice: String){
            tvName.text = name
            tvAdvice.text = advice
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.how_find_item, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(list[position].name, list[position].advice)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}