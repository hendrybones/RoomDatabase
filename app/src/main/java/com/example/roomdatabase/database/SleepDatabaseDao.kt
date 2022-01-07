package com.example.roomdatabase.database

import androidx.room.Insert

interface SleepDatabaseDao {
    @Insert
    suspend fun insert()

}