package checkstyle.ejemplo.entidades;

import java.util.*;

public class auto {
    
    private int k;
    private String Marca;
    public static int velocidadMaxima = 120;
    
    public auto(int kilometraje, String m) {
        this.k = kilometraje;
        this.Marca = m;
    }
    
    public void setKilometraje(int kilometraje) {
        this.k = kilometraje;
    }
    
    public int getkilometraje() {
        System.out.println("El kilometraje es: " + k + ", cuidado con el return this.kilometraje");
        return k;
    }
    
    public void Avanzar(int d){
        k += d;
    }
    
    public void Reparacion(int valor1, int valor2, int valor3, String marcaFinal, String kilometraje){
        this.Marca = marcaFinal;
    }


}
