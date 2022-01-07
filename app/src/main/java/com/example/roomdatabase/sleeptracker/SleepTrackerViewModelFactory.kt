package com.example.roomdatabase.sleeptracker

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.paging.DataSource
import com.example.roomdatabase.database.SleepDatabaseDao
import java.lang.IllegalArgumentException

class SleepTrackerViewModelFactory(
    private val dataSource: SleepDatabaseDao,
    private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        //we check if there is an instance of viewModel available and return an interface.
        if (modelClass.isAssignableFrom(SleepTrackerViewModel ::class.java)){
            return SleepTrackerViewModel(dataSource,application) as T
        }
        throw IllegalArgumentException("Unknown viewModel class")

    }

}