/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionebanca;

/**
 *
 * @author monica ciuchetti
 */
class Cliente extends Thread{
    Conto conto;
    int saldo;
    int noperazioni;
    
    /**
     * creazione del Cliente della banca associato ad un Conto
     * 
     * @param c 
     */
    Cliente(Conto c){
        conto = c;
        noperazioni = 4;
    }
    
    @Override
    public void run(){
       int i = 0;
       while(i < noperazioni){
            conto.deposito(100);
            conto.prelievo(200);
            i++;
       }
       
    }
}
