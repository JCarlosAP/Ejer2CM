package com.example.ejercicio2cm;

import android.content.Context;
import android.view.View;

import com.example.ejercicio2cm.R;

import java.io.Serializable;

public class Alumno implements Serializable {
    private long id;
    private String nombre;
    private String ap;
    private String am;
    private String genero;
    private String cuenta;
    private Context contexto;

    public Alumno(long id, String nombre, String ap, String am, String genero, String cuenta, View.OnClickListener contexto) {
        this.id = id;
        this.nombre = nombre;
        this.ap = ap;
        this.am =am;
        this.genero = genero;
        this.cuenta = cuenta;

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getap() {
        return ap;
    }
    public void setap(String ap) {
        this.ap = ap;
    }

    public String getam() {
        return am;
    }
    public void setam(String am){
        this.am = am;
    }

    public String getgenero() {
        return genero;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }

    public String getcuenta() {
        return cuenta;
    }
    public void setcuenta(String cuenta){
        this.cuenta = cuenta;
    }

    public Context getContexto() {
        return contexto;
    }

    public void setContexto(Context contexto) {
        this.contexto = contexto;
    }

    @Override
    public String toString() {
        return contexto.getResources().getString(R.string.texto_nombre)
                + getNombre();
    }
}

