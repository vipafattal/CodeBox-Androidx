package com.codebox.lib.android.widgets.recyclerView

import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.animateItems(animFile:Int) {
    val controller = AnimationUtils.loadLayoutAnimation(context, animFile)
    layoutAnimation = controller
    adapter!!.notifyDataSetChanged()
    scheduleLayoutAnimation()
}
fun RecyclerView.LinearLayoutV(){
    layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
}
fun RecyclerView.LinearLayoutH(){
    layoutManager = LinearLayoutManager(context, LinearLayout.HORIZONTAL, false)
}