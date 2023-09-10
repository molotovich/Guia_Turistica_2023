package com.molosoft.guiaturistica;

public class Word {
    private final String mLugar;
    private final String mDescripcion;
    private int mImagen;


    public Word(String lugar, String descripcion, int imagen) {
        this.mLugar = lugar;
        this.mDescripcion = descripcion;
        this.mImagen = imagen;
    }

    public String getLugar() {
        return mLugar;
    }

    public String getDescripcion() {
        return mDescripcion;
    }

    public int getImagen() {
        return mImagen;
    }
}