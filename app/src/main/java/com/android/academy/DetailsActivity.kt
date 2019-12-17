package com.android.academy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        details_btn_trailer2.setOnClickListener {
            val trailerUrl = getString(R.string.trailerUrl)
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(trailerUrl))
            startActivity(browserIntent)
        }
    }
}
