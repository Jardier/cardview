package com.android.cardview.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.cardview.R
import com.android.cardview.adapter.PostagemAdapter
import com.android.cardview.model.Postagem

class MainActivity : AppCompatActivity() {

    lateinit var rvPostagem : RecyclerView;
    lateinit var postagens : List<Postagem>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postagens = carregarPostagens();

        rvPostagem = findViewById(R.id.rvPostagem);

        //Configurar o Adapter
        val adapter = PostagemAdapter(postagens);

        //Configurar o recycleview
        rvPostagem.layoutManager = LinearLayoutManager(this);
        rvPostagem.setHasFixedSize(true);
        rvPostagem.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rvPostagem.adapter = adapter;
    }

    private fun carregarPostagens() : ArrayList<Postagem> {
        val postagens = arrayListOf<Postagem>(
            Postagem("Jardier Bezerra Aires", "#tbt Minha primeira viagem iternacional", R.drawable.imagem1),
            Postagem("Bárbara Alves Aires", "Imagem da Cidade Cinzenta", R.drawable.imagem2),
            Postagem("Adriana Alves Aires", "#tbp Imagem da minha viagem a Paris", R.drawable.imagem3),
            Postagem("Anita da Silva Pinheiro", "Minhas aventuras nas Colinas Verdejantes", R.drawable.imagem4)
        )
        return postagens;
    }
}
