package com.stylingandroid.dynamicvectorsizing

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConstraintSet().apply {
            clone(activity_main)
            imageView3.drawable.also { drawable ->
                setDimensionRatio(
                        R.id.imageView3,
                        "v,${drawable.intrinsicWidth}:${drawable.intrinsicHeight}"
                )
            }
            applyTo(activity_main)
        }
    }
}
