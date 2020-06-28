package com.android.cardview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.cardview.R
import com.android.cardview.adapter.PostagemAdapter

class MainActivity : AppCompatActivity() {

    lateinit var rvPostagem : RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPostagem = findViewById(R.id.rvPostagem);

        //Configurar o Adapter
        val adapter = PostagemAdapter();

        //Configurar o recycleview
        rvPostagem.layoutManager = LinearLayoutManager(this);
        rvPostagem.setHasFixedSize(true);
        rvPostagem.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rvPostagem.adapter = adapter;

    }
}
