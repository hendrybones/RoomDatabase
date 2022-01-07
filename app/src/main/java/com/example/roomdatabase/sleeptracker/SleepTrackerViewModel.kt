package com.example.roomdatabase.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.roomdatabase.database.SleepDatabaseDao

class SleepTrackerViewModel (
    val database: SleepDatabaseDao,
    application: Application) : AndroidViewModel(application) {


}