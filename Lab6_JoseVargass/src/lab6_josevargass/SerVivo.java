/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josevargass;

/**
 *
 * @author josevargas
 */
public class SerVivo {
    private String nombre;
    private int poder;
    private int edad;
    private String planeta;
    private String raza;

    public SerVivo() {
    }

    public SerVivo(String nombre, int poder, int edad, String planeta, String raza) {
        this.nombre = nombre;
        this.poder = poder;
        this.edad = edad;
        this.planeta = planeta;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", poder=" + poder + ", edad=" + edad + ", planeta=" + planeta + ", raza=" + raza + '}';
    }
    
    
}
