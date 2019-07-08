package com.example.petagram.pojo;

public class Mascota {

    private String Nombre;
    private String Raiting;
    private int Foto;

    public Mascota(int foto, String nombre, String raiting){
        this.Foto       = foto;
        this.Nombre     = nombre;
        this.Raiting    = raiting;
    }

    public String getNombre() {return Nombre;}
    public void setNombre(String nombre) {this.Nombre = nombre;}

    public String getRaiting() {return Raiting;}
    public void setRanking(String ranking) {this.Raiting = ranking;}

    public int getFoto() {return Foto;}
    public void setFoto(int foto) {this.Foto = foto;}
}
