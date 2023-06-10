package com.labos.pelicula.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.labos.pelicula.R
import com.labos.pelicula.model.Pelicula

class PeliculaAdapter(private val peliculas: List<Pelicula>, private val onClickListener: (Pelicula) -> Unit) :
    RecyclerView.Adapter<PeliculaAdapter.PeliculaViewHolder>() {

    inner class PeliculaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pelicula: Pelicula) {
            itemView.tvTitulo.text = pelicula.titulo
            itemView.tvDirector.text = pelicula.director
            itemView.setOnClickListener { onClickListener(pelicula) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pelicula, parent, false)
        return PeliculaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        holder.bind(peliculas[position])
    }

    override fun getItemCount() = peliculas.size
}
