package com.labos.pelicula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labos.pelicula.ViewModel.PeliculaViewModel
import com.labos.pelicula.adapter.PeliculaAdapter

class MainActivity : AppCompatActivity() {

    private val peliculaViewModel: PeliculaViewModel = TODO()

    private lateinit var peliculaAdapter: PeliculaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        peliculaAdapter = PeliculaAdapter(listOf()) { pelicula ->

        }

        peliculaViewModel.peliculas.observe(this) { peliculas ->
            peliculaAdapter.peliculas = peliculas
            peliculaAdapter.notifyDataSetChanged()
        }

        findViewById<Button>(R.id.btnAgregarPelicula).setOnClickListener {
           
        }

        findViewById<RecyclerView>(R.id.rvPeliculas).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = peliculaAdapter
        }
    }
}
