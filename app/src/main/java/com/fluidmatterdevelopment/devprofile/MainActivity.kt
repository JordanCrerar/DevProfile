package com.fluidmatterdevelopment.devprofile

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //For rounded corners on logoImg
            val logoImgBitmap = RoundedBitmapDrawableFactory.create(
                resources, BitmapFactory.decodeResource
                    (resources, R.drawable.devslopesprofilelogo))
            logoImgBitmap.cornerRadius = 15f
            logoImg.setImageDrawable(logoImgBitmap)
    }

}
