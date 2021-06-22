package com.example.birthdaycardgenerator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.generatebirthdaycard.R
import org.w3c.dom.Text

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        val to_name = getIntent().getStringExtra("To_Name")
        val from_name = getIntent().getStringExtra("From_Name")

        val Sender = findViewById<TextView>(R.id.Sender_name)
        Sender.setText(from_name)

        val Receiver = findViewById<TextView>(R.id.Receiver_name)
        Receiver.setText(to_name)
    }
}