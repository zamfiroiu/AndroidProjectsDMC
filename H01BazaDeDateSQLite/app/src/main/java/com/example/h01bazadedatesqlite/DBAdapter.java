package com.example.h01bazadedatesqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DBAdapter {
    private SQLiteDatabase database;
    private DBHelper helper;
    public DBAdapter(Context ctx) {
        helper = new DBHelper(ctx, Constante.DBNAME,null, 1);
    }
    public void openConnection() {
        database = helper.getWritableDatabase();
    }
    public void closeConnection() {
        database.close();
    }

    public void insertCafea(Cafea cafea) {
        ContentValues cv = new ContentValues();
        cv.put(Constante.AROMA, cafea.getAroma());
        cv.put(Constante.CANTITATE, cafea.getCantitate());
        database.insert(Constante.NUME_TABELA, null, cv);
    }

    public Cafea selectCafeaByAroma(String aroma) {
        Cursor cursor = database.query(
                Constante.NUME_TABELA,
                new String[]{Constante.AROMA, Constante.CANTITATE},
                Constante.AROMA + " = ?",
                new String[]{aroma},
                null,
                null,
                null);
        if (cursor != null && cursor.moveToFirst()) {
            Cafea cafea = new Cafea(cursor.getString(0),
                                    cursor.getDouble(1));
            return cafea;
        }
        return null;
    }

    public void updateCafea(String aroma, Cafea cafea){
        ContentValues cv=new ContentValues();
        cv.put(Constante.AROMA,cafea.getAroma());
        cv.put(Constante.CANTITATE,cafea.getCantitate());
        database.update(Constante.NUME_TABELA,
                cv,
                Constante.AROMA + " = ?",
                new String[]{aroma}
                );
    }


    public List<Cafea> selectToateCafelele() {
        Cursor cursor = database.query(
                Constante.NUME_TABELA,
                new String[]{Constante.AROMA, Constante.CANTITATE},
                null,
                null,
                null,
                null,
                null);
        List<Cafea> lista = new ArrayList<>();
        if (cursor != null && cursor.moveToFirst()) {
            do {
                lista.add(new Cafea(cursor.getString(0), cursor.getDouble(1)));
            } while (cursor.moveToNext());
        }
        return lista;
    }
}
