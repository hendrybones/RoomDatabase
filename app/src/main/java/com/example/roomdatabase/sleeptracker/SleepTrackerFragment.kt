package com.example.roomdatabase.sleeptracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.roomdatabase.R
import com.example.roomdatabase.database.SleepDatabase
import com.example.roomdatabase.databinding.FragmentSleepQualityBinding
import com.example.roomdatabase.databinding.FragmentSleepTrackerBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class SleepTrackerFragment : Fragment() {
    private var binding : FragmentSleepTrackerBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentSleepTrackerBinding.inflate(layoutInflater)
        val application= requireNotNull(this.activity).application
        val dataSource= SleepDatabase.getInstance(application).sleepDatabaseDao
        val viewModelFactory=SleepTrackerViewModelFactory(dataSource,application)
        val sleepTrackerViewModel=
            ViewModelProviders.of(
                this,viewModelFactory).get(SleepTrackerViewModel::class.java)
        binding!!.sleepTrackerModel=sleepTrackerViewModel
        binding!!.setLifecycleOwner (this)
        return  binding!!.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SleepTrackerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SleepTrackerFragment().apply {

            }
    }
}