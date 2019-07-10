package com.example.petagram.db;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;

import com.example.petagram.R;
import com.example.petagram.pojo.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;

    public ConstructorMascotas(Context context){
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
        BaseDatos db = new BaseDatos(context);
        //insertarTresMascotas(db);

        return db.obtenerMascotas();
    }

    public void insertarTresMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE,"Odin");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO,R.drawable.perro1);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE,"Tony Stark");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO,R.drawable.perro2);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE,"Fido");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO,R.drawable.perro3);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE,"Loki");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO,R.drawable.perro4);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE,"Firulais");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO,R.drawable.perro5);
        db.insertarMascota(contentValues);
    }

    public void darLikeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_ID_MASCOTA,mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_LIKE, LIKE);
        db.insertarLikeMascota(contentValues);
    }

    public int obtenerLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);
    }
}
