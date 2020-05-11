package com.anshdeep.kotlinmessenger.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.anshdeep.kotlinmessenger.R

/**
 * A simple [Fragment] subclass.
 */
class BecasFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_becas, container, false)
    }

}
