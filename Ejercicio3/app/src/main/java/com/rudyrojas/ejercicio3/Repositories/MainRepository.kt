package com.rudyrojas.ejercicio3.Repositories

import com.rudyrojas.ejercicio3.AppDatabases.AppDatabase
import com.rudyrojas.ejercicio3.Entities.Usuario
import kotlinx.coroutines.flow.Flow

class MainRepository (private  val db : AppDatabase) {

    fun selectAllUsuarios(): Flow<List<Usuario>> {
        return  db.UsuarioDAO().selectUsuarioAll()
    }

    fun selectUsuario(id : Int) : Flow<Usuario>{
        return  db.UsuarioDAO().selectUsuario(id)
    }
}