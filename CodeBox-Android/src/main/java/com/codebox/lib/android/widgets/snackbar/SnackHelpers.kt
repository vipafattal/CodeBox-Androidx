package com.codebox.lib.android.widgets.snackbar

import android.widget.TextView
import com.codebox.lib.android.resoures.Colour
import com.google.android.material.R
import com.google.android.material.snackbar.Snackbar

@PublishedApi
internal fun Snackbar.setSnackbarTextColor(textColor: Int) {

    val tv: TextView = view.findViewById(R.id.snackbar_text)
    tv.setTextColor(Colour(textColor))

}