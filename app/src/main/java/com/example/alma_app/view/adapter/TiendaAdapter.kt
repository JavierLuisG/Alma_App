package com.example.alma_app.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.alma_app.R

class TiendaAdapter: RecyclerView.Adapter<TiendaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view_tienda, viewGroup, false)
        return ViewHolder(v)
    }
    inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemPrecio: TextView

        init {
            itemImage = ItemView.findViewById(R.id.image)
            itemTitle = ItemView.findViewById(R.id.txtTitulo)
            itemPrecio = ItemView.findViewById(R.id.txtPrecio)
        }
    }
    val titles = arrayOf("Enterizo azul", "Enterizo flores", "Leggings azul", "Leggings morado", "Short negro", "Top marrón", "Top rosa")
    val precio = arrayOf("$85.000", "$85.000", "$40.000", "$40.000", "$35.000", "$35.000", "$35.000")
    val image = arrayOf(R.drawable.productenterizoazul, R.drawable.productenterizoflores,R.drawable.productleggingsazul,R.drawable.productleggingsmorado,R.drawable.productshortnegro,R.drawable.producttopmarron,R.drawable.producttoprosa)

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text=titles[i]
        viewHolder.itemPrecio.text=precio[i]
        viewHolder.itemImage.setImageResource(image[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}