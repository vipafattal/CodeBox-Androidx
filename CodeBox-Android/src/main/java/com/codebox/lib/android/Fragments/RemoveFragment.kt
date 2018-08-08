package com.codebox.lib.android.Fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun FragmentActivity.removeFragment(frag: Fragment) {
    supportFragmentManager.beginTransaction().remove(frag).commit()
}