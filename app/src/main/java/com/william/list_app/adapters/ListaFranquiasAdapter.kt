package com.william.list_app.adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.william.list_app.R
import com.william.list_app.models.Franquia

class ListaFranquiasAdapter(private val franquias: List<Franquia>): RecyclerView.Adapter<ListaFranquiasAdapter.FranquiaViewHolder>(){
    var posicaoClicada:Int = -1

    class FranquiaViewHolder(v: View) : RecyclerView.ViewHolder(v){
        var nome : TextView
        var cidade : TextView
        var foto : ImageView

        init {
            nome = v.findViewById(R.id.txtNome)
        }
    }

}