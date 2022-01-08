package com.example.roomdatabase.sleepquality

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.roomdatabase.R
import com.example.roomdatabase.databinding.FragmentSleepQualityBinding


class SleepQualityFragment : Fragment() {

    private var binding : FragmentSleepQualityBinding ? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        val binding= DataBindingUtil.inflate<FragmentSleepQualityBinding>(inflater,R.layout.fragment_sleep_quality,container,false)
        binding= FragmentSleepQualityBinding.inflate(layoutInflater)

        return binding!!.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SleepQualityFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SleepQualityFragment().apply {

            }
    }
}