package com.kyunglp.kotlinjetpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.kyunglp.kotlinjetpack.databinding.ActivityMainBinding
import com.kyunglp.kotlinjetpack.databinding.DataBindingDemoActivity
import com.kyunglp.kotlinjetpack.model.User
import com.kyunglp.kotlinjetpack.viewbinding.ViewBindingDemoActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_view_binding_demo.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_to_viewbinding_page.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ViewBindingDemoActivity::class.java
                )
            )
        }
        btn_to_databinding_page.setOnClickListener {
            startActivity(Intent(this, DataBindingDemoActivity::class.java))
        }
    }

}