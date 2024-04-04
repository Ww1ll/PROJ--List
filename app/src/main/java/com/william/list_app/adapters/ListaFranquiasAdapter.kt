package com.william.list_app.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
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
            cidade = v.findViewById(R.id.txtCidade)
            foto = v.findViewById(R.id.imgFoto)

            v.setOnCreateContextMenuListener{ contextMenu, view, contextMenuInfo ->
                run {
                    val menuInflater:MenuInflater = MenuInflater(view.context)
                    menuInflater.inflate(R.menu.item_menu, contextMenu)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FranquiaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_franquia, parent, false)
        return FranquiaViewHolder(view)
    }

    override fun onBindViewHolder(holder: FranquiaViewHolder, position: Int) {
        val nome:TextView = holder.itemView.findViewById(R.id.txtNome)
        val cidade:TextView = holder.itemView.findViewById(R.id.txtCidade)
        val foto = holder.foto

        nome.setText(franquias.get(position).nome)
        cidade.setText(franquias.get(position).cidade)

        holder.itemView.setOnLongClickListener{ v ->
            posicaoClicada = holder.adapterPosition
            Log.i("Menu", "onBindViewHolder: " + posicaoClicada)
            false

        }
    }

    override fun getItemCount(): Int {
        return franquias.count()
    }

}