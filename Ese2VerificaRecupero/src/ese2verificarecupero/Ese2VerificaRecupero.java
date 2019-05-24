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
public class Ese2VerificaRecupero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        //System.out.println("inserisci quanti numeri generare");
        
        int buffer = 0;
        
        DatiCondivisi dc = new DatiCondivisi();
        
        t1 t1 = new t1(dc);
        t2 t2 = new t2(dc);
        t3 t3 = new t3(dc);
        t4 t4 = new t4(dc);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
