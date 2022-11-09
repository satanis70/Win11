package com.example.win11.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.win11.R
import com.example.win11.model.HorseRatingModel
import com.example.win11.model.Horserating

class HorseAdapter(val list: List<Horserating>): RecyclerView.Adapter<HorseAdapter.MainHolder>(){
    inner class MainHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val tvRank = itemView.findViewById<TextView>(R.id.rank_horse)
        val tvName = itemView.findViewById<TextView>(R.id.name_horse)
        val tvStarts = itemView.findViewById<TextView>(R.id.starts_horse)
        val tvEarnings = itemView.findViewById<TextView>(R.id.earnings)
        val tvWin = itemView.findViewById<TextView>(R.id.win_horse)
        fun bind(
            rank: Int,
            name: String,
            starts: String,
            earning: String,
            win: String
        ){
            tvRank.text = rank.toString()
            tvName.text = name
            tvStarts.text = starts
            tvEarnings.text = earning
            tvWin.text = win
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.horse_item, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(
            position+1,
            list[position].name,
            list[position].starts,
            list[position].earnings,
            list[position].win
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }
}