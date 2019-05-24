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
public class t2 extends Thread{
    DatiCondivisi dc;

    public t2(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    public void run(){
        dc.sem1Wait();
        
        System.out.println("numero pari GENERATO: " + dc.getNumeroPari());
        
        dc.sem2Signal();
    }
}
