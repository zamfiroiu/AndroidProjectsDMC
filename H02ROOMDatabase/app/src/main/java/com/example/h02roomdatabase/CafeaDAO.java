package com.example.h02roomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface CafeaDAO {

    @Insert
    void insertCafea(Cafea cafea);

    @Query("SELECT * FROM Cafea")
    List<Cafea> getAllCafele();

    @Update
    void update(Cafea cafea);

    @Delete
    void delete(Cafea cafea);
}
