package com.example.cse224ca

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imgk = findViewById<ImageView>(R.id.img)
        var stnamek = findViewById<EditText>(R.id.vstname)
        var regnok = findViewById<EditText>(R.id.vregno)
        var tcck = findViewById<EditText>(R.id.vtcc)
        var cak = findViewById<EditText>(R.id.vca)
        var btnk = findViewById<Button>(R.id.btn)

        btnk.setOnClickListener {
            val total = tcck.text.toString().toInt()
            val attended = cak.text.toString().toInt()
            if((attended*100/total)>=75) {
                Toast.makeText(this, "Eligible", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Attendance Shortage", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
