package com.example.roomself.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int,var firstName:String,
    var lastName :String )
