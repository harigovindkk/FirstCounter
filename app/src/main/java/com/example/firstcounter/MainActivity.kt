package com.example.firstcounter

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_first.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)


        findViewById<Button>(R.id.button_first).setOnClickListener {
            countincrement()
        }
    }

    fun countincrement() {
        val cnt: TextView =findViewById<TextView>(R.id.count_display)
        val count1: String= cnt.text.toString()
        val c:Int=count1.toInt()+1
        findViewById<TextView>(R.id.count_display).text=c.toString()
    }
}





