package com.example;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracion;
    private String genero;
    private String album;

    public static int SEGUNDOS_POR_MINUTO = 60;

    public Cancion (){
        this.titulo = "Desconocido";
        this.artista = "Desconocido";
        this.genero = "Desconocido";
        this.album = "Desconocido";
        this.duracion = 0;
    }

    public Cancion(String titulo, String artista, int duracion){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void calcularDuracionMinutos(){
        int conversion = duracion / SEGUNDOS_POR_MINUTO;
        System.out.println(conversion);
    }

    public void mostrarInformacion(){
        System.out.println(this.titulo);
        System.out.println(this.artista);
        System.out.println(this.duracion);
        System.out.println(this.genero);
        System.out.println(this.album);
    }

    public void mostrarInformacion(String nombreUsuario){
        System.out.println(this.titulo);
        System.out.println(this.artista);
        System.out.println(this.duracion);
        System.out.println(this.genero);
        System.out.println(this.album);
        System.out.println(nombreUsuario);
    }


}
