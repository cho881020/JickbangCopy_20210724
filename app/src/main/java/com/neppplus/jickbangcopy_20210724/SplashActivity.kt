package com.neppplus.jickbangcopy_20210724

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        // 메인화면으로 이동 => 2.5초 후에 이동.
        // Intent 이동 코드를 => 2.5초가 지난 후에 실행되도록. (실행 지연)

        val myHandler = Handler(Looper.getMainLooper())
        myHandler.postDelayed({

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()

        }, 2500)



    }
}