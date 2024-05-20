package com.example.animacionsavancades

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.example.animacionsavancades.MyAnimationView
import com.example.animacionsavancades.R

class BallAnimationExample : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val container = findViewById<View>(R.id.container) as LinearLayout
        container.addView(MyAnimationView(this))
    }
}