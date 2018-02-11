package com.makeasy.frontend.androiddb.POJOS;

import android.content.ContentValues;

import com.makeasy.frontend.androiddb.SQLConstants;

/**
 * Created by frontend on 09/02/2018.
 */

public class User {
    private String id;
    private String nombre;
    private String apellido;
    private String photo;
    private int votos;

    public User(String id, String nombre, String apellido, String photo, int votos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.photo = photo;
        this.votos = votos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

   public ContentValues toValues(){
        ContentValues contentValues = new ContentValues(5);

        contentValues.put(SQLConstants.COLUMN_ID,id);
        contentValues.put(SQLConstants.COLUMN_NOMBRE,id);
        contentValues.put(SQLConstants.COLUMN_APELLIDO,id);
        contentValues.put(SQLConstants.COLUMN_PHOTO,id);
        contentValues.put(SQLConstants.COLUMN_VOTO,votos);

        return contentValues;
   }

}
