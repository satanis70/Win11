package com.example.win11.adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.win11.R
import com.example.win11.model.Leadersbyyear

class LeadersAdapter(val list: List<Leadersbyyear>) :
    RecyclerView.Adapter<LeadersAdapter.MainHolder>() {

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvRank = itemView.findViewById<TextView>(R.id.rank)
        val tvName = itemView.findViewById<TextView>(R.id.name)
        val tvStarts = itemView.findViewById<TextView>(R.id.starts)
        val tvTotal = itemView.findViewById<TextView>(R.id.total)
        val tvWin = itemView.findViewById<TextView>(R.id.win)

        fun bind(
            rank: Int,
            name: String,
            starts: String,
            total: String,
            win: String
        ){
            tvRank.text = rank.toString()
            tvName.text = name
            tvStarts.text = starts
            tvTotal.text = total
            tvWin.text = win
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.leaders_item, parent, false))
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(
            position+1,
            list[position].name,
            list[position].starts,
            list[position].total,
            list[position].win
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }
}