package com.rudyrojas.ejercicio3.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Usuario(

    @PrimaryKey
    var id : Int?,

    @ColumnInfo( "username")
    var username : String,

    @ColumnInfo("password")
    var password : String,

    @ColumnInfo("active")
    var active : Boolean
)
