/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese2verificarecupero;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pirovano_Giacomo
 */
public class DatiCondivisi {
    int buffer;
    int InseritoDispari = 0;
    int InseritoPari = 0;
    int numeroPari = 0;
    int numeroDispari = 0;
    
    Semaphore sem1 = new Semaphore(0);
    Semaphore sem2 = new Semaphore(1);
    
    Semaphore sem3 = new Semaphore(1);
    Semaphore sem4 = new Semaphore(0);
    
    Semaphore sem5 = new Semaphore(1);
    Semaphore sem6 = new Semaphore(0);

    public DatiCondivisi() {
        
    }

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
        
    }
    
    public void sem1Wait(){
        try {
            
            sem1.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sem1Signal(){
        sem1.release();
    }
    
    
    public void sem2Wait(){
        try {
            
            sem2.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sem2Signal(){
        sem2.release();
    }
    
    public void sem3Wait(){
        try {
            
            sem3.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sem3Signal(){
        sem3.release();
    }
    
    public void sem4Wait(){
        try {
            
            sem4.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sem4Signal(){
        sem4.release();
    }
    
    public void sem5Wait(){
        try {
            
            sem5.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sem5Signal(){
        sem5.release();
    }
    
    public void sem6Wait(){
        try {
            
            sem6.acquire();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sem6Signal(){
        sem6.release();
    }
    
    
    
    
    
    
    
    
    
    public void controllaDispari(){
        if(buffer != 0){
            int resto = buffer%2;
            if (resto == 1){
                setInseritoDispari(getInseritoDispari()+1);
                setNumeroDispari(buffer);
            }
        }
    }
    
    
    public void controllaPari(){
        if(buffer != 0){
            int resto = buffer%2;
            if (resto == 0){
                setInseritoPari(getInseritoPari()+1);
                setNumeroPari(buffer);
            }
        }
    }
    
    
    
    
    
    public int getInseritoDispari() {
        return InseritoDispari;
    }

    public int getInseritoPari() {
        return InseritoPari;
    }

    public void setInseritoDispari(int InseritoDispari) {
        this.InseritoDispari = InseritoDispari;
    }

    public void setInseritoPari(int InseritoPari) {
        this.InseritoPari = InseritoPari;
    }

    public int getNumeroPari() {
        return numeroPari;
    }

    public void setNumeroPari(int numeroPari) {
        this.numeroPari = numeroPari;
    }

    public int getNumeroDispari() {
        return numeroDispari;
    }

    public void setNumeroDispari(int numeroDispari) {
        this.numeroDispari = numeroDispari;
    }

    
    
    
    
}
