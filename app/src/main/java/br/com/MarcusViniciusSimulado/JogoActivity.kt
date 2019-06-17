package br.com.MarcusViniciusSimulado

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_jogo.*

class JogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo)
    }

    //Clique no botão JOGAR / PLAY
    fun jogar(view: View) {

        val nomedojogador = ptNome.text.toString()
        val classedopersonagem = spClasses.selectedItem as String

        // Validando usuário e classe escolhida

        if (nomedojogador.isNotBlank() && classedopersonagem.isNotBlank()) {
            // Mudar de tela
            val intent = Intent(this, JogandoActivity::class.java)

            // Passar os dados para a tela de jogo
            intent.putExtra("jogador", nomedojogador)

            // Iniciar a próxima tela
            startActivity(intent)
            finish()
        } else {
            // Caso as informações estejam erradas ou não preenchidas
            Toast.makeText(this, "Preencha todos os campos corretamente", Toast.LENGTH_SHORT).show()

            val jogador = Jogador(ptNome.text.toString(), spClasses.selectedItem.toString())
        }

    }
}
