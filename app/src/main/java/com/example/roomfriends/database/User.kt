package com.example.roomfriends.database

import android.os.Bundle
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "nama") var nama: String,
    @ColumnInfo(name = "email") var email: String,
    @ColumnInfo(name = "pass") var pass: String,
    @ColumnInfo(name = "tanggal") var tanggal: String
)