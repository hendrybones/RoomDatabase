package com.example.roomdatabase.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import org.junit.After
import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class SleepDatabaseTest {
    private lateinit var sleepDatabaseDao: SleepDatabaseDao
    private lateinit var db: SleepDatabase

    @Before
     fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        // initialize the db and dao variable
        db = Room.inMemoryDatabaseBuilder(context, SleepDatabase::class.java).build()
        sleepDatabaseDao = db.sleepDatabaseDao

    }
    @After
    fun closeDb(){
        db.close()
    }
    @Test
    suspend fun insertANDGetNight(){
        val night=SleepNight()
        sleepDatabaseDao.insert(night)
        val tonight=sleepDatabaseDao.getTonight()
        assertEquals(tonight?.sleepQuality, -1)
    }

}