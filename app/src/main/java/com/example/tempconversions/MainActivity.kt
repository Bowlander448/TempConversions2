package com.example.tempconversions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    private lateinit var FahrenhietWidget: EditText
    private lateinit var CelsiusWidget: EditText
    private lateinit var ResultWidget: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FahrenhietWidget = findViewById(R.id.FahrenhietText)
        CelsiusWidget = findViewById(R.id.CelsiusText)
        ResultWidget = findViewById(R.id.Result)

        FahrenhietWidget.doAfterTextChanged { FarBar() }
        
        CelsiusWidget.doAfterTextChanged { FarBar() }
    }
    fun FarBar(){
        val F = FahrenhietWidget.text.toString().toDoubleOrNull()



        if (F == null ||) {
            return
        }


        ResultWidget.text = displayMessage


    }
}


   



