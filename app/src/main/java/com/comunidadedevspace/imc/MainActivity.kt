package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        //Criar variavel e associar o componente de UI<editText>
        //Recuperar o botão da tela

        //Colocar ação no botão setOnClickListener
        //Recuperar o texto digitado no edt peso

        val edtWeight = findViewById<TextInputEditText>(R.id.edit_weight)
        val edtHeight = findViewById<TextInputEditText>(R.id.edit_height)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)

        btnCalculate.setOnClickListener{
            val weight: Float = edtWeight.text.toString().toFloat()
            val height: Float = edtHeight.text.toString().toFloat()

            val heightQ2 = height * height
            val result = weight / heightQ2
            println("Action button $result")

        }
    }
}