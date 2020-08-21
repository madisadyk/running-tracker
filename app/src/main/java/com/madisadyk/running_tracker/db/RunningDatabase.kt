package com.madisadyk.running_tracker.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters
abstract class RunningDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDAO
}