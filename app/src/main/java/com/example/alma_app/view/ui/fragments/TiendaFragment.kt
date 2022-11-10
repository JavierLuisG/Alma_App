package com.example.alma_app.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alma_app.R
import com.example.alma_app.view.adapter.TiendaAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

class TiendaFragment : Fragment() {

    lateinit var recyclertienda: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tienda, container, false)
        recyclertienda = view.findViewById(R.id.RecyTienda)
        val adapter = TiendaAdapter()
        recyclertienda.layoutManager = LinearLayoutManager(context)
        recyclertienda.adapter = adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btm = view.findViewById<BottomNavigationView>(R.id.Tienda_bottom_navigation)
        btm.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.nav_menu-> findNavController().navigate(R.id.action_tiendaFragment_to_menuFragment)
                R.id.nav_carrito -> findNavController().navigate(R.id.action_tiendaFragment_to_carritoFragment)
            }
        }
    }

}