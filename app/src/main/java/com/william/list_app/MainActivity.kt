package com.william.list_app

import android.content.Intent
import android.net.Uri
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
        val franquia: Franquia = dao.listaFranquias().get(posicao)

        if (item.itemId == R.id.menu_mapa){
            val uri:Uri = Uri.parse("geo:0, 0?q=" + franquia.cidade+"&z=18")
            val intent:Intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

            // coloquei só o que preciso por ora
        } else if (item.itemId == R.id.menu_detalhes){
            val intent:Intent = Intent(this, DetalhesFranquiaActivity::class.java)
            intent.putExtra("franquia", franquia.toString())
            startActivity(intent)
        }

        return super.onContextItemSelected(item)

    }


}