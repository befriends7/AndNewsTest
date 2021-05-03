package com.rovero.andtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

lateinit var imgMain:ImageView;

class flashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash_screen)

        imgMain = findViewById(R.id.imgMain)

        Picasso.get().load(R.drawable.fireb).fit().into(imgMain)

    }
}