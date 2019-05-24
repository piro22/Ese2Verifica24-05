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
public class t3 extends Thread{
    DatiCondivisi dc;

    public t3(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    public void run(){
        dc.sem4Wait();
        
        System.out.println("numero dispari GENERATO: " + dc.getNumeroDispari());
        
        dc.sem3Signal();
    }
}
