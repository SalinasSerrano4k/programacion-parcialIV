package com.example.parcialprogramacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.*



class MainActivity : AppCompatActivity() {
    private lateinit var tv_Mostrar: TextView
    private lateinit var lv_Lista: ListView

    private val Mascota = arrayOf("Farruko", "Bobby", "Flaco", "Pedro", "Dexter")

    private val Especie = arrayOf("Perro", "Cabalo", "Hamster", "Gallina", "Cerdo")

    private val color = arrayOf("Blanco y negro", "Barsino", "Blanco", "Cafe", "Colorado")

    private val sexo = arrayOf("Masculino", "Masculino", "Fenemenino", "Masculino", "Masculino")

    private val peso = arrayOf("15 Kg", "8 Kg", "5 Kg", "12 Kg", "50 Kg",)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_Mostrar = findViewById(R.id.tv_Mostrar)

        lv_Lista = findViewById(R.id.lv_View)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, Mascota)
        lv_Lista.adapter = adaptador

        lv_Lista.setOnItemClickListener { AdapterView, view, i, l ->
            tv_Mostrar.setText(

                "Los datos del " + lv_Lista.getItemAtPosition(i) + " son: "+" Especie: "+ Especie[i] + ", Color: " + color[i] + ", sexo: " +
                        sexo[i] + ", y pesa: " + peso[i]
            )

        }
    }

}