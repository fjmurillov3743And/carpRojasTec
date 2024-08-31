package com.rudyrojas.ejercicio3.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rudyrojas.ejercicio3.Repositories.MainRepository
import com.rudyrojas.ejercicio3.adapter.UsuarioAdapter
import kotlin.jvm.Throws

class VIewModelFactory (private  val repo: MainRepository): ViewModelProvider.Factory {

    override  fun <T : ViewModel> create(modelClass: Class<T>): T{

        if (modelClass.isAssignableFrom(MainViewModel ::class.java)){

            return MainViewModel(repo) as T
        }
        throw IllegalArgumentException("clase de  ViewModel Desconocido")
    }
}