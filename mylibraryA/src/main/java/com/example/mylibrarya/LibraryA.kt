package com.example.mylibrarya

import android.os.Build.VERSION.SDK_INT

class LibraryA {
    fun doAThing(): Boolean {
        return SDK_INT >= 25
    }
}