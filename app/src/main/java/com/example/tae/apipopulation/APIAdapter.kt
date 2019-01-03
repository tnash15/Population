package com.example.tae.apipopulation

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_activity.view.*

class APIAdapter : RecyclerView.Adapter<APIAdapter.APIViewHolder>() {

    private val data = arrayListOf<APIData>()


    fun setData(data: List<APIData>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): APIViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_activity,
            parent, false
        )
        return APIViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(viewHolder: APIViewHolder, position: Int) {
        viewHolder.bind(data[position])
    }

    class APIViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(apiData: APIData) {
            view.tvCountry.text = apiData.country.toString()
            view.tvAge.text = apiData.age.toString()
        }
    }

}