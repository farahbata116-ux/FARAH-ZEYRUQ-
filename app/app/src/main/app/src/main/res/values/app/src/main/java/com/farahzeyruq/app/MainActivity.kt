package com.farahzeyruq.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val screen = TextView(this).apply {
            text = """
                FARAHZEYRUQ

                Version 0.1

                Welcome

                Local-first application
                Users • Records • Location • Logs • Status
            """.trimIndent()

            textSize = 22f
            setPadding(40, 80, 40, 40)
        }

        setContentView(screen)
    }
}
