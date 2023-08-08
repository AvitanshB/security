package com.example.securityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class mainactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)
val bottomBar=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomBar.setOnItemSelectedListener {
            if(it.itemId==R.id.nav_guard) {
                inflateFragment()
            }
            else if(it.itemId==R.id.nav_home){

                inflateHomeFragment()
            }
           else if(it.itemId==R.id.nav_profile){
               inflateProfileFragment()
           }
            else if(it.itemId==R.id.nav_dashboard){
                inflatedashboardFragment()

            }
            true

        }





        }

    private fun inflatedashboardFragment() {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,DashBoardFragment.newInstance())
        transaction.commit()
    }

    private fun inflateProfileFragment() {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,ProfileFragment.newInstance())
        transaction.commit()
    }

    private fun inflateHomeFragment() {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,HomescreenFragment.newInstance())
        transaction.commit()
    }

    private fun inflateFragment() {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,GuardFragment.newInstance())
        transaction.commit()

    }
}
