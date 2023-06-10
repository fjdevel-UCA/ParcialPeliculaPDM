package com.labos.pelicula.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.labos.pelicula.Repository.PeliculaRepository
import com.labos.pelicula.model.Pelicula

class PeliculaViewModel : ViewModel() {

    private val repositorio = PeliculaRepository()

    private val _peliculas = MutableLiveData<List<Pelicula>>()
    val peliculas: LiveData<List<Pelicula>>
        get() = _peliculas

    fun agregarPelicula(pelicula: Pelicula) {
        repositorio.agregarPelicula(pelicula)
        _peliculas.value = repositorio.obtenerPeliculas()
    }

    init {
        _peliculas.value = repositorio.obtenerPeliculas()
    }
}
