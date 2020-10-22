package com.kyunglp.kotlinjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.kyunglp.kotlinjetpack.databinding.ActivityMainBinding
import com.kyunglp.kotlinjetpack.model.User

class MainActivity : AppCompatActivity() {
    lateinit var  ob:ObservableField<String>
    lateinit var  user:User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
       val dataBinding= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
         ob=ObservableField<String>()
        ob.set("AAA")
        user= User()
        user.name="HEHE"
        dataBinding.user=user
        dataBinding.mainActivity=this

    }


    fun onTvClick(view: View){
        user.name="AAAAAAAAAAA"
        Toast.makeText(this,"AA",Toast.LENGTH_SHORT).show()

    }
}