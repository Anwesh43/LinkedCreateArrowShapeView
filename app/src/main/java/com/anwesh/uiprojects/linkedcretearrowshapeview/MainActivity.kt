package com.anwesh.uiprojects.linkedcretearrowshapeview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.createarrowshapeview.CreateArrowShapeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CreateArrowShapeView.create(this)
    }
}
