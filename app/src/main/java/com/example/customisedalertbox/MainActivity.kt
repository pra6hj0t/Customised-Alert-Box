package com.example.customisedalertbox

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var dialog : Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn_click)

        button.setOnClickListener {
            dialog = Dialog(this)
            dialog.setContentView(R.layout.custimised_alert_box)
            dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_cutomised_alert_box))
            val button_feedback = dialog.findViewById<Button>(R.id.btn_feedback)
            val button_too_good = dialog.findViewById<Button>(R.id.btn_too_good)
            button_feedback.setOnClickListener {
                Toast.makeText(this,"Thanks For Feedback",Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            button_too_good.setOnClickListener {
                Toast.makeText(this,"That's Great",Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            dialog.show()
        }
    }
}