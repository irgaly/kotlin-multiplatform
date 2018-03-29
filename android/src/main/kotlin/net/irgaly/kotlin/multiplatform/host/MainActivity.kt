package net.irgaly.kotlin.multiplatform.host

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import net.irgaly.kotlin.multiplatform.library.model.User
import net.irgaly.kotlin.multiplatform.library.platform.Platform

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = User("user name")
        val view = findViewById(R.id.text) as? TextView
        view?.text = "${Platform.model} / ${user}"
    }
}
