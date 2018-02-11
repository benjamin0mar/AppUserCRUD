package com.makeasy.frontend.androiddb;

/**
 * Created by frontend on 09/02/2018.
 */

public class SQLConstants {
    // base de datos
    public static final String DB = "bdusers.db";

    // referencia a las tablas
    public static final String tableUsers = "users";

    // columnas
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOMBRE= "nombre";
    public static final String COLUMN_APELLIDO = "apellido";
    public static final String COLUMN_PHOTO = "photo";
    public static final String COLUMN_VOTO = "voto";


    // consultas
    public static final String SQL_DELETE="DROP TABLE" +tableUsers;
    public static final String SQL_CREATE_TABLE_USERS = "CREATE TABLE "+ tableUsers + "("+
            COLUMN_ID+" TEXT PRIMARY KEY,"+
            COLUMN_NOMBRE+" TEXT, "+
            COLUMN_APELLIDO+" TEXT, "+
            COLUMN_PHOTO+" TEXT, "+
            COLUMN_VOTO+" INT);";
}
