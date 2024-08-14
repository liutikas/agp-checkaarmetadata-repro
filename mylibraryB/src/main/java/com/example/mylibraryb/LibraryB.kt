package com.example.mylibraryb

import android.view.View
import androidx.annotation.RequiresApi

class LibraryB(val view : View ) {
    @RequiresApi(35)
    fun differentThing() {
        view.setFrameContentVelocity(1f)
    }
}