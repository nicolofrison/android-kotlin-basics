package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculateButton = binding.buttonCalculate
        calculateButton.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        val serviceCostString = binding.editTextServiceCost.text.toString()
        if (serviceCostString.isEmpty()) {
            return
        }
        val serviceCost = serviceCostString.toDouble()

        val tipValue = when (binding.radioGroupTip.checkedRadioButtonId) {
            R.id.radio_button_first_option -> 0.20
            R.id.radio_button_second_option -> 0.18
            else -> 0.15
        }

        var tip = serviceCost * tipValue

        val roundUp = binding.switchRoundUp.isChecked
        if (roundUp) {
            tip = kotlin.math.ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.textTipResult.text = getString(R.string.text_tip_result_text, formattedTip)
    }
}