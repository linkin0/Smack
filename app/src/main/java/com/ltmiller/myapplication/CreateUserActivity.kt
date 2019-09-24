package com.ltmiller.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_create_user.*
import java.util.*

class CreateUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarColour = "[0.5, 0.5, 0.5, 1]"         // template to be saved to database so this can be understood by iOS or Android

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar( view: View ){

        val random = Random()
        val colour = random.nextInt(2 )
        val avatar = Random().nextInt(28 )

        userAvatar = if ( colour == 0 ){
            "light$avatar"
        } else "dark$avatar"

        val resoucedId = resources.getIdentifier( userAvatar, "drawable", packageName )
        createAvatarImageView.setImageResource(resoucedId)

    }

    fun generateColourClicked( view: View ){

        val random = Random()
        val r = random.nextInt(255 )
        val g = random.nextInt(255 )
        val b = random.nextInt(255 )

        createAvatarImageView.setBackgroundColor( Color.rgb( r, g, b ) )

        val saveR = r.toDouble() / 255
        val saveG = g.toDouble() / 255
        val saveB = b.toDouble() / 255

        avatarColour = "[$saveR, $saveG, $saveB, 1]"
        println(avatarColour)

    }

    fun createUserClicked( view: View ){

    }
}
