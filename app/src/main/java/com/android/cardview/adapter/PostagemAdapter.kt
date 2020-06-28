package com.android.cardview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.cardview.R
import com.android.cardview.model.Postagem

class PostagemAdapter(val postagens : List<Postagem>) : RecyclerView.Adapter<PostagemAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.postagem_detalhe, parent, false);

        return MyViewHolder(view);

    }

    override fun getItemCount(): Int {
        return postagens.size;
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val postagem = postagens[position];

        holder.nome.text = postagem.nome
        holder.postagem.text = postagem.postagem
        holder.imagemPostagem.setImageResource(postagem.imagemPostagem);
    }


    public class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val nome       : TextView = itemView.findViewById(R.id.tvNome);
        val postagem   : TextView = itemView.findViewById(R.id.tvPostagem);
        val imagemPostagem : ImageView = itemView.findViewById(R.id.imPostagem);
    }

}