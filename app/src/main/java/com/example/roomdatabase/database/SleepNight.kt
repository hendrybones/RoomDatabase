package com.example.roomdatabase.database

import androidx.core.location.LocationRequestCompat
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class SleepNight(
    @PrimaryKey(autoGenerate = true)
    var nightId: Long=0L,
    @ColumnInfo(name="start_time_milli")
    val startTimeMilli: Long=System.currentTimeMillis(),
    @ColumnInfo(name="end_time_milli")
    var endTimeMilli: Long=startTimeMilli,
    @ColumnInfo(name="quality_rating")
    var sleepQuality: Int =-1

)