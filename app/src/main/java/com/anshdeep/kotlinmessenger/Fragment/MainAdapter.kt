package com.anshdeep.kotlinmessenger.Fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.anshdeep.kotlinmessenger.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.curso_item_row.view.*
import kotlinx.android.synthetic.main.fragment_cursos.view.*

class MainAdapter(private val context: Context): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {


    private var dataList = mutableListOf<Curso>()
    fun setListData(data: MutableList<Curso>) {
        dataList = data
    }

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(curso: Curso) {
            Glide.with(context).load(curso.imagenUrl).into(itemView.circleImageView)
            itemView.txtTitle.text = curso.titulo
            itemView.txtPage.text = curso.pagina
            itemView.txtLink.text = curso.link
            itemView.txtDesc.text = curso.descripcion
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val View = LayoutInflater.from(context).inflate(R.layout.curso_item_row, parent, false)
        return MainViewHolder(View)
    }

    override fun getItemCount(): Int {
        return if (dataList.size > 0) {
            dataList.size
        } else {
            0
        }
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val curso = dataList[position]
        holder.bindView(curso)
    }
}
