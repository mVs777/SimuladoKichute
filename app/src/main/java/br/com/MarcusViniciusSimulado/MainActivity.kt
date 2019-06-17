package br.com.MarcusViniciusSimulado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGHT = 3500L

    lateinit var ivLogo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivLogo = findViewById(R.id.ivLogo)
        carregar()

    }

    fun carregar(){
        val anim = AnimationUtils.loadAnimation( this, R.anim.animacao_splash )
        anim.reset()

        ivLogo!!.clearAnimation()
        ivLogo!!.startAnimation(anim)

        Handler().postDelayed({
            val intent = Intent( this@MainActivity, JogoActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            this@MainActivity.finish()
        }, SPLASH_DISPLAY_LENGHT)
    }
}
