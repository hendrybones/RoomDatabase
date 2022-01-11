package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.roomdatabase.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val binding: ViewDataBinding? = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}