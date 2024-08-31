package com.rudyrojas.ejercicio3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.rudyrojas.ejercicio3.Entities.Usuario
import com.rudyrojas.ejercicio3.databinding.ItemUsuarioBinding

class UsuarioAdapter(private var usuarios : ArrayList<Usuario>) : RecyclerView.Adapter<UsuarioAdapter.viewHolderUsuario>()  {
    inner class viewHolderUsuario(val binding: ItemUsuarioBinding) : RecyclerView.ViewHolder(binding.root){

        fun  bind(usuario: Usuario){
            binding.apply {
                txtId.text = usuario.id.toString()
                textUsername.text = usuario.username
                textPassword.text = usuario.password

                botonAlarta.setOnclickListener {
                    Snackbar.make(binding.root, usuario.username, 1000).show()
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  UsuarioAdapter.viewHolderUsuario{

        val binding = ItemUsuarioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return viewHolderUsuario(binding)

    }

    override fun onBindViewHolder(holder: UsuarioAdapter.viewHolderUsuario, position: Int){

        holder.bind(usuarios[position])
    }

    override fun getItemCount(): Int{

        return usuarios.size
    }

    fun updateUsuarios(nuevoUsuario : ArrayList<Usuario>) {

        usuarios = nuevoUsuario
        this.notifyDataSetChanged()
    }

}