package com.example.ricycle_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewBusAdapter(private val getActivity: MainActivity,
                             private val busList: List<bus>
) :
    RecyclerView.Adapter<RecyclerViewBusAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_movie_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvBusTitle.text = busList[position].title
        holder.ivBusImg.setImageResource(busList[position].image)

        holder.cardView.setOnClickListener {
            Toast.makeText(getActivity, busList[position].title, Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return busList.size

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvBusTitle : TextView = itemView.findViewById(R.id.tvBusTitle)
        val ivBusImg : ImageView = itemView.findViewById(R.id.ivBusImg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)

    }

}