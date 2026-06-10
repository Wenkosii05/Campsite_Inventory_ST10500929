//MusawenkosiMnanzana - ST10500929

package com.example.campsitecommander

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /** On this code we are creating the function that will make the button to be able to go
         to the next screen **/
        val btnInventoryAdd = findViewById<button>(R.id.btnInventoryAdd)
        btnInventoryAdd.setOnClickListener{
            val Intent = Intent(this,inventory_screen::class.java)
            startActivity(Intent)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        }
    }
}