package com.example.versionok

import android.R
import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.bumptech.glide.Glide
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lorentzos.flingswipe.SwipeFlingAdapterView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item.*
import java.util.*


class MainActivity : AppCompatActivity() {




    lateinit var toolbar : ActionBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.versionok.R.layout.activity_main)





        val navigation = findViewById(com.example.versionok.R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


    }

    val mOnNavigationItemSelectedListener: BottomNavigationView.OnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                val fragment: Fragment
                when (item.getItemId()) {
                    com.example.versionok.R.id.navigation_home -> {
                        toolbar.setTitle("Accueil")
                        fragment = Home()
                        loadFragment(fragment)
                        return true
                    }
                    com.example.versionok.R.id.navigation_profile -> {
                        toolbar.setTitle("Profile")
                        fragment = Profil()
                        loadFragment(fragment)
                        return true
                    }
                    com.example.versionok.R.id.navigation_add -> {
                        toolbar.setTitle("Ajouter")
                        fragment = Addcreation()
                        loadFragment(fragment)
                        return true
                    }
                    com.example.versionok.R.id.navigation_library -> {
                        toolbar.setTitle("Bibliothèque")
                        fragment = Biblio()
                        loadFragment(fragment)
                        return true
                    }
                    com.example.versionok.R.id.navigation_people -> {
                        toolbar.setTitle("Communauté")
                        fragment = Community()
                        loadFragment(fragment)
                        return true
                    }
                }
                return false
            }
        }



    fun loadFragment(fragment: Fragment){

        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(com.example.versionok.R.id.frame_container, fragment)
        transaction.addToBackStack(null);
        transaction.commit();

    }


}
