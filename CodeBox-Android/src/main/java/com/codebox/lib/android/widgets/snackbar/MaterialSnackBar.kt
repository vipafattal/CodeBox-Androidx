package com.codebox.lib.android.widgets.snackbar

import android.view.ViewGroup
import com.codebox.lib.R
import com.codebox.lib.android.resoures.Image
import com.codebox.lib.android.utils.screenHelpers.dp
import com.google.android.material.snackbar.Snackbar


fun Snackbar.snackBarBottomBar() {
    view.background = Image(R.drawable.bg_snackbar)
    setSnackbarTextColor(R.color.white)
    showAction { }
    val params = view.layoutParams as ViewGroup.MarginLayoutParams

    params.setMargins(
            params.leftMargin + dp(12),
            params.topMargin,
            params.rightMargin + dp(12), params.bottomMargin + dp(105))
    view.layoutParams = params


}