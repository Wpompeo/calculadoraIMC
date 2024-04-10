package com.comunidadedevspace.imc

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val resultFinal = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val textViewResultFinal = findViewById<TextView>(R.id.textViewResult)
        val textViewClassificationFinal = findViewById<TextView>(R.id.textViewClassification)
        textViewResultFinal.text = resultFinal.toString()

        val classification: String = if ( resultFinal <= 18.5f){
            textViewClassificationFinal.setTextColor(getColor(R.color.magreza))
            "Magreza - grau - 0 "
        } else if ( resultFinal >= 18.6f && resultFinal <= 24.9){
            textViewClassificationFinal.setTextColor(getColor(R.color.normal))
            "Normal grau - 0 "
        } else if ( resultFinal >= 25.0f && resultFinal <= 29.9) {
            textViewClassificationFinal.setTextColor(getColor(R.color.sobrepesoI))
            "Sobrepeso - grau - I "
        } else if ( resultFinal >= 30.0f && resultFinal <= 34.9){
            textViewClassificationFinal.setTextColor(getColor(R.color.obesidadeI))
            "Obesidade - grau - I"
        } else if ( resultFinal >= 35.0f && resultFinal <= 39.9){
            textViewClassificationFinal.setTextColor(getColor(R.color.obesidadeII))
            "Obsesidade - grau - II"
        } else{
            textViewClassificationFinal.setTextColor(getColor(R.color.obesidadeIII))
            "Obesidade grave - grau - III"
        }
        textViewClassificationFinal.text = classification
        }
}
