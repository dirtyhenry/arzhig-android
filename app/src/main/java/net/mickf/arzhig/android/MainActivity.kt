package net.mickf.arzhig.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = Random().nextInt(6) + 1

        resultText.text = randomInt.toString()
    }
}
