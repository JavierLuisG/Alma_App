package com.example.alma_app.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alma_app.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class UbicacionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ubicacion,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btm = view.findViewById<BottomNavigationView>(R.id.Ubicacion_bottom_navigation)
        btm.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.Menu -> findNavController().navigate(R.id.action_ubicacionFragment_to_menuFragment)
                R.id.Store -> findNavController().navigate(R.id.action_ubicacionFragment_to_tiendaFragment)
                R.id.Car -> findNavController().navigate(R.id.action_ubicacionFragment_to_carritoFragment)
            }
        }
    }


}