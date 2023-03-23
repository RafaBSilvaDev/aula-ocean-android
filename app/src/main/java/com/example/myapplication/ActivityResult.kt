package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activty_result)

        var textoNovo = findViewById<TextView>(R.id.inputAntigo)
        var btnVoltar  = findViewById<Button>(R.id.btnAntigo)

        var nomeDigitado = intent.getStringExtra("RESULTADO")

        textoNovo.text = nomeDigitado

        btnVoltar.setOnClickListener {
            var voltar = Intent(this, MainActivity::class.java)
            finish()
            startActivity(voltar)
        }
    }
}