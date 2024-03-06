public class Noeud{
    public String nom;
    protected Interne[] enfants;

    public Noeud(String n){
        nom = n;
        enfants = new Interne[0];
    }

    public void ajouterEnfant(){
        Interne enfant = new Interne(nom + enfants.length, this);
        if(enfants.length == 0){
            enfants = new Interne[1];
            enfants[0] = enfant;
        } else {
            Interne[] new_enfants = new Interne[enfants.length + 1];
            for(int i = 0; i < enfants.length; i++){
                new_enfants[i] = enfants[i];
            }
            new_enfants[enfants.length] = enfant;
            enfants = new_enfants;
        }
    }

    public Interne consulterEnfant(int i){
        return enfants[i];
    }
}
