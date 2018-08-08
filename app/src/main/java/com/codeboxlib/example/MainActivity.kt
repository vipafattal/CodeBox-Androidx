package com.codeboxlib.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codebox.lib.android.widgets.snackbar.material
import com.codebox.lib.android.widgets.snackbar.showAction
import com.codebox.lib.android.widgets.snackbar.snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        snackbar("Item Added").material().showAction("Undo") {
            textView.text = "Hello & Welcome"
        }

    }
}
