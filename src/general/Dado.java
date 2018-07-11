/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.util.Random;

/**
 *
 * @author Junior
 */
public class Dado {
    
    private int valor;

    public int darValor() {
        Random ran = new Random();
        int val = 0;
        do{
           val = ran.nextInt(7); 
        }while(val == 0); 
        return val;
    }
    
    

    
    
    
    
}
