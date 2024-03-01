package com.demo.teste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //selecionando os "..."
        val apresentacaoJogada = findViewById<TextView>(R.id.idRecebimentoJogada)

        //pegando valor da jogada na intent anterior
        val jogadaUsuario = intent.getStringExtra("jogada")

        //se 0 cara se 1 coroa

        //substituindo os "..." pela jogada do usuario
        apresentacaoJogada.text = jogadaUsuario ?: "Sem preenchimento"

        //seleciona o textView que mostra o resultado
        val situacao = findViewById<TextView>(R.id.idSituacao)

        //gera um randomico 0 ou 1
        var jogadaMaquina = (0 .. 1).random()

        //inicia a face da moeda
        var faceMaquina = ""

        if(jogadaMaquina==0){
            faceMaquina = "cara"
        }else{
            faceMaquina = "coroa"
        }

        if (jogadaUsuario.toString() == (faceMaquina)){
         situacao.text = "Voce ganhou"
        }else{
            situacao.text = "Voce perdeu"
        }

        //selecionar botao de jogar novamente
        val jogarNovamente = findViewById<Button>(R.id.btnVoltar2to1)

        jogarNovamente.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

    }
}