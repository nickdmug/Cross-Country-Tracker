package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0
    var count1 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTap1(views: View) {
        count++


        val textView1 = findViewById(R.id.textView) as TextView
        textView1.text = "$count"


    }

    fun onTap2(views: View) {
        count++

        val textView2 = findViewById(R.id.textView2) as TextView
        textView2.text = "$count"
    }

    fun onTap3(views: View) {
        count++

        val textView = findViewById(R.id.textView3) as TextView
        textView.text = "$count"
    }

    fun onTap4(views: View) {
        count++

        val textView = findViewById(R.id.textView4) as TextView
        textView.text = "$count"
    }

    fun onTap5(views: View) {
        count++

        val textView = findViewById(R.id.textView5) as TextView
        textView.text = "$count"
    }

    fun onTap6(views: View) {
        count++

        val textView = findViewById(R.id.textView6) as TextView
        textView.text = "$count"
    }

    fun onTap7(views: View) {
        count++

        val textView = findViewById(R.id.textView7) as TextView
        textView.text = "$count"
    }

    fun onTap8(views: View) {
        count++

        val textView = findViewById(R.id.textView8) as TextView
        textView.text = "$count"
    }

    fun onTap9(views: View) {
        count++

        val textViews = findViewById(R.id.textView9) as TextView
        textViews.text = "$count"
    }

    fun onTap10(views: View) {
        count++

        val textView = findViewById(R.id.textView10) as TextView
        textView.text = "$count"

    }
}