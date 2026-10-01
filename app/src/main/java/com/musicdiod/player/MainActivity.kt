package com.musicdiod.player

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.gravity = Gravity.CENTER
        root.setBackgroundColor(Color.rgb(11, 11, 20))
        root.setPadding(32, 32, 32, 32)

        val title = TextView(this)
        title.text = "Music Diod"
        title.textSize = 32f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Offline Music Player"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 16, 0, 0)

        root.addView(title)
        root.addView(subtitle)

        setContentView(root)
    }
}
