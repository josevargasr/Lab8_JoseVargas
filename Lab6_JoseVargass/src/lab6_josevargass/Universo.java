/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josevargass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josevargas
 */
public class Universo {
    private String nombre;
    private ArrayList<SerVivo> seresvivos = new ArrayList();
    File archivo = null;

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
        archivo = new File("./"+nombre+".txt");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getSeresvivos() {
        return seresvivos;
    }

    public void setSeresvivos(ArrayList seresvivos) {
        this.seresvivos = seresvivos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (SerVivo p : seresvivos) {
                bw.write(p.getNombre()+ "|");
                bw.write(p.getPoder() + "|");
                bw.write(p.getEdad() + "|");
                bw.write(p.getPlaneta() + "|");
                bw.write(p.getRaza() + "|");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
        
    }
    
    public void cargarArchivo(){
        Scanner sc = null;
        seresvivos = new ArrayList();
        if(archivo.exists()){
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while(sc.hasNext()){
                    seresvivos.add(new SerVivo(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
        
    }
    
}
