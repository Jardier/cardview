package com.android.cardview.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostagemAdapter : RecyclerView.Adapter<PostagemAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    public class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        lateinit var nome       : TextView
        lateinit var postagem   : TextView
        lateinit var imagem     : ImageView;
    }

}