package com.william.list_app

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.william.list_app.models.Franquia

class DetalhesFranquiaActivity : AppCompatActivity(){
    var franquia:Franquia?=null
    var txtNome:EditText?=null
    var txtCidade:EditText?=null
    var txtTitulo:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_franquia)

        txtNome = findViewById(R.id.txtNome)
        txtCidade = findViewById(R.id.txtCidade)
        txtTitulo = findViewById(R.id.txtTitulo)

        if(this.intent.hasExtra("franquia")){
            franquia = this.intent.getSerializableExtra("franquia") as Franquia?
            preencherFranquia()
        }
    }

    private fun preencherFranquia() {
        txtNome?.setText(franquia?.nome)
        txtCidade?.setText(franquia?.cidade)
        txtTitulo?.setText(franquia?.titulos)
    }

}