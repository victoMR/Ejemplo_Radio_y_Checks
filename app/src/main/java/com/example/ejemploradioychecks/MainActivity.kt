package com.example.ejemploradioychecks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    // Declaración de variables
    private lateinit var chkCheckBox1: CheckBox
    private lateinit var rgPregunta1: RadioGroup
    private lateinit var rbRespuesta1: RadioButton
    private lateinit var rbRespuesta2: RadioButton
    private lateinit var btnAceptar: Button
    private lateinit var tvMensaje1: TextView
    private lateinit var tvMensaje2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialización de variables
        chkCheckBox1 = findViewById(R.id.chkCheckBox1)
        rgPregunta1 = findViewById(R.id.rgPregunta1)
        rbRespuesta1 = findViewById(R.id.rbRespuesta1)
        rbRespuesta2 = findViewById(R.id.rbRespuesta2)
        btnAceptar = findViewById(R.id.btnAceptar)
        tvMensaje1 = findViewById(R.id.tvMensaje1)
        tvMensaje2 = findViewById(R.id.tvMensaje2)

        // Evento click del botón
        btnAceptar.setOnClickListener {
            // Llamada a la función
            if (chkCheckBox1.isChecked) {
                tvMensaje1.text = "CheckBox marcado"
            } else {
                tvMensaje1.text = "CheckBox desmarcado"
            }

            // Verificamos cual radio button está seleccionado
            if (rbRespuesta1.isChecked) {
                tvMensaje2.text = "Incorrecto, Guadalajara es la capital de Jalisco"
            } else if (rbRespuesta2.isChecked) {
                tvMensaje2.text = "Correcto, Ciudad de México es la capital de México"
            }else{
                tvMensaje2.text = "Ninguna respuesta seleccionada"
            }

        }


    }
}