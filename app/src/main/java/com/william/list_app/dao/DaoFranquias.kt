package com.william.list_app.dao

import com.william.list_app.models.Franquia
import java.util.ArrayList

class DaoFranquias {
    fun listaFranquias(): ArrayList<Franquia>{
        val list:ArrayList<Franquia> = ArrayList()

        list.add( Franquia("New York Rangers", "New York", "4", "#"))
        list.add( Franquia("Montreal Canadiens", "Montreal", "24", "#"))
        list.add( Franquia("Toronto Maple Leafs", "Toronto", "13", "#"))
        list.add( Franquia("Detroit Red Wings", "Detroit", "11", "#"))
        list.add( Franquia("Pittsburgh Penguins", "Pittsburgh", "5", "#"))
        list.add( Franquia("Chicago Blackhawks", "Chicago", "6", "#"))
        list.add( Franquia("Boston Bruins", "Boston", "6", "#"))
        list.add( Franquia("Philadelphia Flyers", "Philadelphia", "2", "#"))
        list.add( Franquia("Edmonton Oilers", "Edmonton", "5", "#"))

        return list
    }


}