package com.kyunglp.kotlinjetpack.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kyunglp.kotlinjetpack.R

/**
 * 1.在布局文件中，选中根布局同时点击alt+enter按键可自动切换到DataBinding布局；切换的同时会自动生成绑定类。
 */
class DataBindingDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding_demo)
    }
}