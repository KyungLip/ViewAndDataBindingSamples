package com.kyunglp.kotlinjetpack.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kyunglp.kotlinjetpack.R
import com.kyunglp.kotlinjetpack.databinding.ActivityViewBindingDemoBinding

/**
 * 1.开启 在build.gradle app下配置
 *      viewBinding{
 *      enabled= true
 *      }
 * 2.使用自动生成的视图绑定类进行视图操作,绑定类名称生成规则:布局文件名称去除下划线，并且每段首字母大写，并在末尾追加Binding。
 * 3.通过点击生成的绑定类可跳转到布局文件。
 */
class ViewBindingDemoActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityViewBindingDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_view_binding_demo)
        viewBinding = ActivityViewBindingDemoBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.tvInfo.text = "Hi ViewBinding!"
    }
}