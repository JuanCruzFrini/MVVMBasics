package com.example.examplemvvm.data.databse

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.examplemvvm.data.databse.dao.QuoteDao
import com.example.examplemvvm.data.databse.entities.QuoteEntity

@Database(entities =  [QuoteEntity::class], version = 1, exportSchema = false)
abstract class QuoteDatabase : RoomDatabase() {

    abstract fun getQuoteDao():QuoteDao
}