package com.example.consumingrest;

public class Pokemon {
    private String nombre;
    private String tipo1;
    private String tipo2;
    private String foto;
    private String fotoShiny;
    private int hp;
    private int ataque;
    private int defensa;
    private int atEsp;
    private int defEsp;
    private int velocidad;

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFotoShiny() {
        return fotoShiny;
    }

    public void setFotoShiny(String fotoShiny) {
        this.fotoShiny = fotoShiny;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtEsp() {
        return atEsp;
    }

    public void setAtEsp(int atEsp) {
        this.atEsp = atEsp;
    }

    public int getDefEsp() {
        return defEsp;
    }

    public void setDefEsp(int defEsp) {
        this.defEsp = defEsp;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
