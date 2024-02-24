package com.bkmzdev.dreamjournal.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bkmzdev.dreamjournal.entities.Emotes


@Dao
interface NoteDAO {
    @get:Query("SELECT * FROM emotes ORDER BY id DESC")
    val allNotes: List<Emotes>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(emotes: Emotes)

    @Delete
    fun deleteNotes(emotes: Emotes)
}