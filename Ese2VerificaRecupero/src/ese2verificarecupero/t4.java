/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese2verificarecupero;

/**
 *
 * @author Pirovano_Giacomo
 */
public class t4 extends Thread{
    DatiCondivisi dc;
    int tempBuff = 50;
    int tempPari = 99999;
    int tempDisp = 99999;

    public t4(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    public void run(){
        dc.sem6Wait();
        
        
        
        
        if(tempBuff != dc.getBuffer()){
            System.out.println("buffer cambiato: " + dc.getBuffer());
        }
        
        if(tempPari != dc.getInseritoPari()){
            System.out.println("numeri pari inseriti aumentati: " + dc.getInseritoPari());
        }
        
        if(tempDisp != dc.getInseritoDispari()){
            System.out.println("numeri dispari inseriti aumentati: " + dc.getInseritoDispari());
        }
        
        
        tempBuff = dc.getBuffer();
        tempPari = dc.getInseritoPari();
        tempDisp = dc.getInseritoDispari();
        
        dc.sem5Signal();
    }
}
