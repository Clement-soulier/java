public class AMoteur extends Vehicule{
    protected int capacite_reservoir;
    protected int niveau_essence;

    public AMoteur(){
        super();
        capacite_reservoir = 0;
        niveau_essence = 0;
    }

    public void to_string(){
        System.out.println("id: " + id + " distance: " + distance + " cpt_reservoir: " + capacite_reservoir + " niv_essence: " + niveau_essence);
    }

    public void approvisionner(int nbLitres){
        if(niveau_essence + nbLitres > capacite_reservoir){
            niveau_essence = capacite_reservoir;
        } else {
            niveau_essence += nbLitres;
        }
    }

    public boolean enPanne(){
        return niveau_essence == 0;
    }
}
