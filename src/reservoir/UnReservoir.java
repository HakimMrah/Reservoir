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
    private boolean vide = true;
    private boolean plein = false;
    
    public UnReservoir(int p_litreContenue){
        litreContenue = p_litreContenue;
        this.testPleinVide();
        contenuMax = 100;
    }
    
    private void testPleinVide(){
        if(litreContenue > 0){
            vide = false;
        }
        else if(litreContenue == 100){
            vide = false;
            plein = true;
        }
    }
    
    public boolean estVide(){
        return vide;
    }
    
    public boolean estPlein(){
        return plein;
    }
    public int getCapacite(){
        return contenuMax;
    }
    
    public int getNiveau(){
        return litreContenue;
    }
    
    public void setNiveau(int litre){
        litreContenue += litre;
    }
    
    public int getEspaceLibre(){
        return 100-litreContenue;
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
        if(((100 -reservoirRemplir) >= reservoirVider)){
            p_reservoirRemplir.setNiveau(reservoirVider);
            litreContenue = 0;
            this.testPleinVide();
            p_reservoirRemplir.testPleinVide();
        }
    }
     public void remplir(UnReservoir p_reservoirRemplir){
        int reservoirVider = this.litreContenue;
        int reservoirRemplir = p_reservoirRemplir.getNiveau();
        if(/*reservoirVider >= (100-reservoirRemplir) && */(reservoirRemplir + reservoirVider) >= 100){
            int difference = reservoirVider - (100 - reservoirRemplir);
            p_reservoirRemplir.setNiveau(reservoirVider -difference);
            this.litreContenue -= (reservoirVider -difference);
            this.testPleinVide();
            p_reservoirRemplir.testPleinVide();
        }
     }
    
     public void mettreUnDans(UnReservoir p_reservoirRemplir){
         int reservoirVider = this.litreContenue;
        int reservoirRemplir = p_reservoirRemplir.getNiveau();
        if(reservoirVider != 0 && reservoirRemplir != contenuMax){
            this.litreContenue--;
            //p_reservoirRemplir.setNiveau(p_reservoirRemplir.getNiveau()+1);
            p_reservoirRemplir.litreContenue++;
            this.testPleinVide();
            p_reservoirRemplir.testPleinVide();
        }
     }
    
}
