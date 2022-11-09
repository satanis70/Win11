package com.example.win11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.text.Html
import android.widget.ProgressBar
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val text = "<font color=#ffffff>Horse</font><font color=#1AF423>Racing</font>"
        findViewById<TextView>(R.id.textView_splash_name).text = Html.fromHtml(text)
        progressBar.max = 30
        splashTime(progressBar)
    }

    private fun splashTime(progressBar: ProgressBar) {
        val timerSplash = object: CountDownTimer(3000, 1000) {
            var currentProgress = 0
            override fun onTick(millisUntilFinished: Long) {
                currentProgress+=10
                progressBar.progress = currentProgress
            }
            override fun onFinish() {
                val intent = Intent(this@SplashScreen, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        timerSplash.start()
    }
}