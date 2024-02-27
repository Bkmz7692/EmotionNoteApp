package com.bkmzdev.dreamjournal.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bkmzdev.dreamjournal.dao.NoteDAO
import com.bkmzdev.dreamjournal.entities.Emotes

@Database(entities = [Emotes::class], version = 1, exportSchema = false)
abstract class EmotesDatabase: RoomDatabase() {
    companion object{
        var emotesDatabase:EmotesDatabase? = null

        @Synchronized
        fun getDatabase(context:Context): EmotesDatabase {
            if (emotesDatabase != null){
                emotesDatabase = Room.databaseBuilder(context, EmotesDatabase::class.java, "emotes.db").build()
            }
            return emotesDatabase!!
        }
    }
    abstract fun NoteDAO(): NoteDAO
}