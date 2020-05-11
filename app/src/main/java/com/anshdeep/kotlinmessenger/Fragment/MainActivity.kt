package com.anshdeep.kotlinmessenger.Fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anshdeep.kotlinmessenger.R
import com.anshdeep.kotlinmessenger.Fragment.CursosFragment
import com.anshdeep.kotlinmessenger.messages.LatestMessagesActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_cursos.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CambiarFragment()
        Mensajes()

    }

    private fun Mensajes() {
        new_message_chat.setOnClickListener {
            val intent = Intent(this, LatestMessagesActivity::class.java)
            startActivity(intent)
        }
    }

    private fun CambiarFragment() {
        loadFragment(BecasFragment())
        nav_botton.setOnNavigationItemReselectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.Inicio -> {
                    loadFragment(InicioFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.Becas -> {
                    loadFragment(BecasFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.Cursos -> {
                    loadFragment(CursosFragment())
                    return@setOnNavigationItemReselectedListener
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.nav_fragment, fragment)
            fragmentTransaction.commit()
        }
    }

}
