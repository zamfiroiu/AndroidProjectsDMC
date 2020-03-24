package com.example.h02roomdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Cafea.class}, version = 1)
public abstract class CafeaDatabase extends RoomDatabase {
    public abstract CafeaDAO cafeaDAO();
}
