package com.example.alma_app.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.alma_app.R

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardTienda = view.findViewById<ImageView>(R.id.imagenTienda)
        cardTienda.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_tiendaFragment)
        }
        val cardFavoritos = view.findViewById<ImageView>(R.id.imagenFavoritos)
        cardFavoritos.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_favoritosFragment)
        }
        val cardCarrito = view.findViewById<ImageView>(R.id.imagenCarrito)
        cardCarrito.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_carritoFragment)
        }
        val cardUbicacion = view.findViewById<ImageView>(R.id.imagenUbicacion)
        cardUbicacion.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_ubicacionFragment)
        }
        val cardAtenCliente = view.findViewById<ImageView>(R.id.imagenAtencionCliente)
        cardAtenCliente.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_atencionClienteFragment)
        }
        val cardSobreNosotros = view.findViewById<ImageView>(R.id.imagenSobreNosotros)
        cardSobreNosotros.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_sobreNosotrosFragment)
        }
    }
}