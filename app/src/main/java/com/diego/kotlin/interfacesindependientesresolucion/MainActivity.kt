package com.diego.kotlin.interfacesindependientesresolucion

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imdbRegresoFuturo = "tt0088763/"
        val botonImdb = findViewById<Button>(R.id.btnImdb)
        botonImdb.setOnClickListener {
            val intWebIMDB = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/title/$imdbRegresoFuturo"))
            startActivity(intWebIMDB)
        }



    }
}