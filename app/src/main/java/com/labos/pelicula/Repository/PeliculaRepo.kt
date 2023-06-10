package com.labos.pelicula.Repository

import com.labos.pelicula.model.Pelicula

class PeliculaRepository {

    private val peliculas: MutableList<Pelicula> = mutableListOf()

    fun agregarPelicula(pelicula: Pelicula) {
        peliculas.add(pelicula)
    }

    fun obtenerPeliculas(): List<Pelicula> {
        return peliculas
    }
}
