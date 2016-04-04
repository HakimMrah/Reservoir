/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservoir;

/**
 *
 * @author fcd
 */
public class UnReservoir {
    private int litreContenue;
    private int contenuMax;
    
    public UnReservoir(int p_litreContenue){
        litreContenue = p_litreContenue;
        contenuMax = 100;
    }
    
    public int getNiveau(){
        return litreContenue;
    }
}
