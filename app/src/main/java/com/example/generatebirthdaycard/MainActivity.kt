package com.example.birthdaycardgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.generatebirthdaycard.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun generate(view: View) {
        Toast.makeText(this,"Card Generated",Toast.LENGTH_LONG)
        val intent = Intent(this, Second_Activity::class.java)
        val to_name = findViewById<EditText>(R.id.To_Name)
        val from_name = findViewById<EditText>(R.id.From_name)
//
//        to_name.text.toString()
//        from_name.text.toString()
//
        intent.putExtra("To_Name", to_name.text.toString())
        intent.putExtra("From_Name", from_name.text.toString())

        startActivity(intent)
    }
}