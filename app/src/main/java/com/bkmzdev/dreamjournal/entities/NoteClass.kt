package com.bkmzdev.dreamjournal.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Emotes")
data class Emotes(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "emotion")
    var emotion: String,

    @ColumnInfo(name = "situation")
    var situation: String,

    @ColumnInfo(name = "actions")
    var actions: String,

    @ColumnInfo(name = "thoughts")
    var thoughts: String,

    @ColumnInfo(name = "date")
    var date: String,
){
    override fun toString(): String {
        return "$emotion: $date"
    }
}