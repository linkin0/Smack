package com.ltmiller.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)

        val toggle = ActionBarDrawerToggle( this, drawerLayout, toolbar, 0, 0 )
        drawerLayout.addDrawerListener( toggle )
        toggle.syncState()

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer( GravityCompat.START )
        } else {
            super.onBackPressed()
        }
    }

    fun loginBtnNavClick(view: View){

        val loginIntent = Intent(this, LoginActivity::class.java)
        startActivity(loginIntent)

    }

    fun addChannelClicked(view: View){


    }

    fun sendMsgBtnClicked(view: View){


    }

}
