package com.codebox.lib.android.widgets

import android.widget.Toast
import com.codebox.codebox_androidx.android.os.AppContextProvider.Companion.appContext

fun longToast(text: String) {
    Toast.makeText(appContext, text, Toast.LENGTH_LONG).show()
}

fun shortToast(text: String) {
    Toast.makeText(appContext, text, Toast.LENGTH_SHORT).show()
}