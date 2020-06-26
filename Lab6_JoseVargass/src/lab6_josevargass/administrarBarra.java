/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josevargass;

import javax.swing.JButton;
import javax.swing.JProgressBar;

/**
 *
 * @author josevargas
 */
public class administrarBarra extends Thread{
    private JProgressBar barra;
    private JButton jb;
    private boolean avanzar;
    private boolean vive;

    public administrarBarra(JProgressBar barra, JButton jb) {
        this.barra = barra;
        this.jb = jb;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        int cont = 1;
        while(vive){
            if(avanzar){
                if(barra.getValue() != 100){
                    barra.setValue(cont);
                    cont++;
                }else{
                    jb.setEnabled(true);
                }
             } //FIN IF
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
    
    
}
