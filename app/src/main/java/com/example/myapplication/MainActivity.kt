package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnEnviar = findViewById<Button>(R.id.btnEnviar)
        var txtTitulo = findViewById<TextView>(R.id.txtTitulo)
        var inputEditar = findViewById<EditText>(R.id.inputEditar)
        var btnNovaTela = findViewById<Button>(R.id.btnAbrirNovaTela)

        btnEnviar.setOnClickListener {
            if (inputEditar.text.isBlank()) inputEditar.error = "Insira alguma coisa na caixa de texto"
                                            else txtTitulo.text = inputEditar.text
        }

        var intentNovaTela = Intent(this, ActivityResult::class.java)


        btnNovaTela.setOnClickListener {
            var nomeDigitado = inputEditar.text.toString()
            intentNovaTela.putExtra("RESULTADO", nomeDigitado)
            startActivity(intentNovaTela)
        }

    }
}