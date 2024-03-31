package com.william.list_app

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.william.list_app.adapters.ListaFranquiasAdapter
import com.william.list_app.dao.DaoFranquias
import com.william.list_app.models.Franquia


class MainActivity : AppCompatActivity() {
    lateinit var listFranquias:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listFranquias = findViewById(R.id.listFranquias)

        val dao = DaoFranquias()
        listFranquias.adapter = ListaFranquiasAdapter(dao.listaFranquias())
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val dao = DaoFranquias()

        val adapter: ListaFranquiasAdapter = listFranquias.adapter as ListaFranquiasAdapter
        val posicao: Int = adapter.posicaoClicada
        val contato: Franquia = dao.listaFranquias().get(posicao)

        if (item.itemId == R.id.)

    }


}