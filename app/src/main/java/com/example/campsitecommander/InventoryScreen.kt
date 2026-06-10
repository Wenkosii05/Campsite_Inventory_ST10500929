package com.example.campsitecommander

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InventoryScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inventory_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textInput1 = findViewById<txtItem1>(R.id.txtItem1)
        val textInput2 = findViewById<txtItem2>(R.id.txtItem2)
        val textInput3 = findViewById<txtItem3>(R.id.txtItem3)
        val textInput4 = findViewById<txtItem4>(R.id.txtItem4)
        val btnNextCategory = findViewById<Button>(R.id.btnNextCategory)

        btnNextCategory.setOnClickListener {
            val Item1 = txtItem1.text.toString()
            val Item2 = txtItem2.text.toString()
            val Item3 = txtItem3.text.toString()
            val Item4 = txtItem4.text.toString()

            val UserCategory = arrayOfNulls<string>(lines.size)

        }
    }
}