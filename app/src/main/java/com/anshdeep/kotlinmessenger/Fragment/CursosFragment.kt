package com.anshdeep.kotlinmessenger.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anshdeep.kotlinmessenger.R
import de.hdodenhof.circleimageview.CircleImageView


/**
 * A simple [Fragment] subclass.
 */
class CursosFragment : Fragment() {
    private lateinit var fragment : Fragment
    private lateinit var adapter: MainAdapter
    private var recyclerViewCurs: RecyclerView? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_cursos, container, false)

        recyclerViewCurs = (view.findViewById<View>(R.id.recyclerViewCurso) as? RecyclerView)!!
        fragment = this
        return view
    }
        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)

            this.adapter = (fragment).let { fragment.context?.let { it1 -> MainAdapter(it1) } }!!
            recyclerViewCurs?.layoutManager = LinearLayoutManager(fragment.context)
            recyclerViewCurs?.adapter = adapter

            val dummyList = mutableListOf<Curso>()
            dummyList.add(Curso("https://www.cursosgis.com/wp-content/uploads/2-25.jpg", "CURSO PROFESIONAL DE PYTHON", "https://codigofacilito.com/cursos/python-web",
                    "Curso Orientado al desarrollo Web"))

            adapter.setListData(dummyList)
            adapter.notifyDataSetChanged()
            return
        }
}
