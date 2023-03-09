package com.ds2.sendmessages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view : View){
        val textMessage = findViewById<EditText>(R.id.textMessage)
        /*val displayMessage = findViewById<TextView>(R.id.displayMessage)
        displayMessage.text = textMessage.text;
        Essas linhas mostram o valor de DisplayMessge na propia Activity
        Removidas pois iremos mostrar esse valor na proxima Activity */
        val message = textMessage.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply { putExtra( EXTRA_MESSAGE, message) }
        startActivity(intent)
    }

}