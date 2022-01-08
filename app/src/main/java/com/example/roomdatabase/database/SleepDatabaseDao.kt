package com.example.roomdatabase.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SleepDatabaseDao {
    @Insert
    fun insert(night: SleepNight)
    @Update
    fun update(night: SleepNight)
    @Query("SELECT * FROM daily_sleep_quality_table where nightId=:key" )
    fun get(key:Long): SleepNight
    @Query("SELECT* FROM daily_sleep_quality_table ORDER BY nightId DESC")
    fun getAllNights(): LiveData<List<SleepNight>>
    @Query("SELECT* FROM daily_sleep_quality_table ORDER BY nightId DESC LIMIT 1")
    fun getTonight():SleepNight



}