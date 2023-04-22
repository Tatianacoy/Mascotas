package app.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.modelo.Mascota;

public class RegistroMascotas {
    private static List<Mascota> mascotas = new ArrayList<>();

    public RegistroMascotas(){
        //mascotas.add(new app.modelo.Mascota("Canino", "mono", "dkkd", "amarillo", 15, 12));
        //mascotas.add(new app.modelo.Mascota("Felino", "mono", "dkkd", "amarillo", 15, "Si"));

    }

    public void agregar(Mascota mascota){
       mascotas.add(mascota);
    }
    public void retirar(int id){
        mascotas.remove(id);
    }
    public void consultar(){
        for(int i = 0; i < mascotas.size(); i++){
            System.out.println("Tipo app.modelo.Mascota: " + mascotas.get(i).getTipoMascota());
            System.out.println("Nombre: " + mascotas.get(i).getNombre());
            System.out.println("Raza: " + mascotas.get(i).getRaza());
            System.out.println("Color: " + mascotas.get(i).getColor());
            System.out.println("Edad: " + mascotas.get(i).getColor());
            if(mascotas.get(i).getTipoMascota().equalsIgnoreCase("Canino")){
                System.out.println("Nivel: " + mascotas.get(i).getNivel());
            }else {
                System.out.println("Tiene toxoplasmosis? " + mascotas.get(i).getToxoplasmosis());
            }
            System.out.println("-".repeat(30));
        }
    }
    public boolean validarNivel(int nivel) {
        return nivel >= 0 && nivel <= 10;
    }
    public boolean validarNumero(String num){
        return num.matches("[0-9]*");
    }
    public double edadPromedio(){
        double edad = 0;
        for(int i = 0; i < mascotas.size(); i++){
            edad += mascotas.get(i).getEdad();
        }
        return edad/mascotas.size();
    }
    public int totalCaninos(){
        int total = 0;
        for(int i = 0; i < mascotas.size(); i++){
            if(mascotas.get(i).getTipoMascota().equalsIgnoreCase("canino")){
                total += 1;
            }

        }
        return total;
    }
    public int totalFelino(){
        int total = 0;
        for(int i = 0; i < mascotas.size(); i++){
            if(mascotas.get(i).getTipoMascota().equalsIgnoreCase("felino")){
                total += 1;
            }

        }
        return total;
    }
    public static List<Mascota> getMascotas() {
        return mascotas;
    }


}
