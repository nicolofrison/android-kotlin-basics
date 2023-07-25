package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.diceroller.models.Dice

class MainActivity : AppCompatActivity() {
    private val dice = Dice(6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollText: ImageView = findViewById(R.id.diceImageView)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

            val rolledNumber = dice.roll()
            val diceResource = when (rolledNumber) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            rollText.setImageResource(diceResource)
            rollText.contentDescription = "Dice result $rolledNumber"
        }
    }
}