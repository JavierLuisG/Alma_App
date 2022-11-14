package com.example.alma_app.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alma_app.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class CarritoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_carrito, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btm = view.findViewById<BottomNavigationView>(R.id.Carrito_bottom_navigation)
        btm.setOnNavigationItemReselectedListener {
            when (it.itemId){
                R.id.Menu -> findNavController().navigate(R.id.action_carritoFragment_to_menuFragment)
                R.id.Map -> findNavController().navigate(R.id.action_carritoFragment_to_ubicacionFragment)
                R.id.Store -> findNavController().navigate(R.id.action_carritoFragment_to_tiendaFragment)
            }
        }
    }

}