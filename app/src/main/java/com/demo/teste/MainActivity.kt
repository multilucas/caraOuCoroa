package com.demo.teste

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSend = findViewById<Button>(R.id.btnJogar)


        //selecionando valor do toggle
        val togglePlay = findViewById<RadioGroup>(R.id.toggleGroup)

        buttonSend.setOnClickListener{
            //var escolhaUsuario = userPlay.getText().toString()

            val selectedRadioButtonId = togglePlay.checkedRadioButtonId

            if(selectedRadioButtonId != -1) {
                val selectedRadioButton = findViewById<RadioButton>(selectedRadioButtonId)

                val escolhaUsuario = selectedRadioButton.text.toString()

                val intent = Intent(this, MainActivity2::class.java)

                intent.putExtra("jogada", escolhaUsuario)

                startActivity(intent)

            } else {
                Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_SHORT).show()
            }


        }



    }
}