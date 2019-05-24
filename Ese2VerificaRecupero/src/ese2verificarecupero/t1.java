/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese2verificarecupero;

import java.util.Random;

/**
 *
 * @author Pirovano_Giacomo
 */
public class t1 extends Thread{
    DatiCondivisi dc;
    int buffer;
    Random random = new Random();

    public t1(DatiCondivisi dc) {
        this.dc = dc;
    }

    
    
    public void run(){
        dc.sem2Wait();
        dc.sem3Wait();
        dc.sem5Wait();
        
        buffer = random.nextInt(36);
        
        dc.setBuffer(buffer);
        System.out.println(buffer);
        
        dc.controllaDispari();
        dc.controllaPari();
        
        dc.sem1Signal();
        dc.sem4Signal();
        dc.sem6Signal();
    }
}
