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
    
    public void setNiveau(int litre){
        litreContenue += litre;
    }
    
    /*public int viderDans(int litre){
        int difference = 0;
        litreContenue += litre;
        if(litreContenue > contenuMax){
            difference = litreContenue - 100;
            litreContenue -= difference;
        }
        return difference;
    }*/
    
    public void viderDans(UnReservoir p_reservoirRemplir){
        int reservoirVider = this.litreContenue;
        int reservoirRemplir = p_reservoirRemplir.getNiveau();
        if(((100 -reservoirRemplir) > reservoirVider)){
            p_reservoirRemplir.setNiveau(reservoirVider);
            litreContenue = 0;
        }
    }
    
    
    
}
