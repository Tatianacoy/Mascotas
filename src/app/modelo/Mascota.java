package app.modelo;

public class Mascota {
    private String tipoMascota;
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private int nivel;
    private String toxoplasmosis;

    public Mascota(String tipoMascota, String nombre, String raza, String color, int edad) {
        this.tipoMascota = tipoMascota;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public Mascota(String tipoMascota, String nombre, String raza, String color, int edad, int nivel) {
        this.tipoMascota = tipoMascota;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.nivel = nivel;
    }

    public Mascota(String tipoMascota, String nombre, String raza, String color, int edad, String toxoplasmosis) {
        this.tipoMascota = tipoMascota;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.toxoplasmosis = toxoplasmosis;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
}
