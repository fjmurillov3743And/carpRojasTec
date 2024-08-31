package com.rudyrojas.ejercicio3.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import com.rudyrojas.ejercicio3.Entities.Usuario
import com.rudyrojas.ejercicio3.Repositories.MainRepository
import kotlinx.coroutines.Dispatchers

class MainViewModel (private  val repo : MainRepository) : ViewModel() {

    fun  selectAllUsuarios() : LiveData<List<Usuario>> {
        return  repo.selectAllUsuarios().asLiveData(Dispatchers.IO)
    }

    fun selectUsuario(id : Int): LiveData<Usuario>{
        return  repo.selectUsuario(id).asLiveData(Dispatchers.IO)
    }


}