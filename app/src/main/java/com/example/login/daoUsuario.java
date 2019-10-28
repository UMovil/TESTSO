package com.example.login;

import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class daoUsuario {

    Context c;
    usuarios u;
    ArrayList<usuarios> lista;
    SQLiteDatabase sql;

    String bd = "BDUsuarios";

    String tabla = "create table if not exists usuario(id integer primary key autoincrement,nombre text,correo text,contraseña text, nota float)";


    public daoUsuario(Context c) {

        this.c = c;

        sql = c.openOrCreateDatabase(bd, c.MODE_PRIVATE, null);

        sql.execSQL(tabla);

        u = new usuarios();


    }


    public boolean insertUsuario(usuarios u) {
        if (buscar(u.getCorreo()) == 0) {

            ContentValues cv = new ContentValues();

            cv.put("nombre", u.getNombre());
            cv.put("correo", u.getCorreo());
            cv.put("contraseña", u.getContraseña());

            return (sql.insert("usuario", null, cv) > 0);
        } else {

            return false;
        }

    }

    public int buscar(String u) {

        int x = 0;

        lista = selectusuarios();

        for (usuarios us : lista) {

            if (us.getCorreo().equals(u)) {
                x++;
            }
        }
        return x;
    }

    public ArrayList<usuarios> selectusuarios() {

        ArrayList<usuarios> lista = new ArrayList<usuarios>();
        lista.clear();

        Cursor cr = sql.rawQuery("select * from usuario", null);
        if (cr != null && cr.moveToFirst()) {

            do {

                usuarios u = new usuarios();
                u.setId(cr.getInt(0));
                u.setNombre(cr.getString(1));
                u.setCorreo(cr.getString(2));
                u.setContraseña(cr.getString(3));

                lista.add(u);

            } while (cr.moveToNext());
        }
        return lista;


    }

    public int login(String u, String p) {

        int a=0;


        Cursor cr = sql.rawQuery("select * from usuario", null);
        if (cr != null && cr.moveToFirst()) {

            do {

               if (cr.getString(2).equals(u)&&cr.getString(3).equals(p)){

               a++;
               }

            } while (cr.moveToNext());




        }
         return a;
    }

    public  usuarios getusuarios(String c, String p){

        lista =selectusuarios();

        for (usuarios us:lista) {
            if (us.getCorreo().equals(c)&& us.getContraseña().equals(p) ){

                return us;


            }
        }
        return null;

    }
    public  usuarios getusuariosById(int id){

        lista =selectusuarios();

        for (usuarios us:lista) {
            if (us.getId()==id ){

                return us;


            }
        }
        return null;

    }
}
