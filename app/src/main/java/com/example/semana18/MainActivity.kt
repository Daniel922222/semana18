package com.example.semana18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextSwitcher
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button=findViewById<Button>(R.id.   btngenerar) as Button
        var tex= findViewById<TextView>(R.id.num1)  as TextView
         var tex2=findViewById<TextView>(R.id.num2)  as TextView
        var tex3=findViewById<TextView>(R.id.num3)  as TextView
         var cont=0
        var int=findViewById<TextView>(R.id.intentos) as TextView
            button.setOnClickListener(View.OnClickListener {
                val randomNumber: Int = Random().nextInt(14)
                tex.text = "Numero1: ${randomNumber.toString()}"
                tex2.text = "Numero2: ${randomNumber.toString()}"
                tex3.text = "Numero3: ${randomNumber.toString()}"
                if (randomNumber == 7)
                    Toast.makeText(this@MainActivity,"Ganaste!",Toast.LENGTH_LONG).show()
            else
                    Toast.makeText(this@MainActivity,"Perdiste!",Toast.LENGTH_LONG).show()

           cont++
                if (cont==3){
                    int.setText("Solo tenias 3 intentos !")
                    button.setEnabled(false)

                }
            })
        }
    }



