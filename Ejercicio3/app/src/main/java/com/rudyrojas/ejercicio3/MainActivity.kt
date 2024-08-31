package com.rudyrojas.ejercicio3

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.LayoutInflaterCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.rudyrojas.ejercicio3.AppDatabases.AppDatabase
import com.rudyrojas.ejercicio3.Entities.Usuario
import com.rudyrojas.ejercicio3.adapter.UsuarioAdapter
import com.rudyrojas.ejercicio3.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val db = AppDatabase.getDatabase(this)

        var user = Usuario(null, "Carlos", "Perrito123", true)


        lifecycleScope.launch(Dispatchers.IO) {


            var usuarios = db.UsuarioDAO().selectAllUsuarios()

            withContext(Dispatchers.Main) {


                binding.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
                binding.recyclerView.adapter = UsuarioAdapter(ArrayList(usuarios))
            }

        }
    }
}


