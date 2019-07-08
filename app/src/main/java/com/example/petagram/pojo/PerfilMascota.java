package com.example.petagram.pojo;

public class PerfilMascota {

    private String Nombre;
    private String Raiting;
    private int Foto;

    public PerfilMascota(int foto, String raiting){
        this.Foto       = foto;
        this.Raiting    = raiting;
    }

    public String getRaiting() {return Raiting;}
    public void setRanking(String ranking) {this.Raiting = ranking;}

    public int getFoto() {return Foto;}
    public void setFoto(int foto) {this.Foto = foto;}
}
