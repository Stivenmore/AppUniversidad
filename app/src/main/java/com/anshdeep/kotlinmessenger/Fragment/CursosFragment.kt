package com.anshdeep.kotlinmessenger.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.anshdeep.kotlinmessenger.R
import kotlinx.android.synthetic.main.fragment_cursos.*

/**
 * A simple [Fragment] subclass.
 */
@Suppress("UNREACHABLE_CODE")
class CursosFragment : Fragment() {

    private lateinit var adapter: MainAdapter
    private lateinit var recyclerViewCurso: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_cursos, container, false)

        adapter = (this.context)?.let { MainAdapter(it) }!!
        recyclerViewCurso.layoutManager = LinearLayoutManager(this.context)
        recyclerViewCurso.adapter = adapter

        val dummyList = mutableListOf<Curso>()
        dummyList.add(Curso("https://www.cursosgis.com/wp-content/uploads/2-25.jpg","CURSO PROFESIONAL DE PYTHON","https://codigofacilito.com/cursos/python-web",
                "Curso Orientado al desarrollo Web"))

        adapter.setListData(dummyList)
        adapter.notifyDataSetChanged()
    }
}
