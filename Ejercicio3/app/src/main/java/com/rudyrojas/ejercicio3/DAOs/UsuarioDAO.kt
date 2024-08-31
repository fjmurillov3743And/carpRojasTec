package com.rudyrojas.ejercicio3.DAOs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import com.rudyrojas.ejercicio3.Entities.Usuario
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuarioDAO {

    @Update
    fun updateUsuario(usuario: Usuario)

    @Delete
    fun deleteUsuario(usuario: Usuario)

    @Query("SELECT * FROM usuario")
    fun selectUsuarioAll() : Flow<List<Usuario>>


    @Query("SELECT * FROM usuario WHERE id = :id ")
    fun selectUsuario(id: Int): Flow<Usuario>

}