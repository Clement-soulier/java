public class Voiture extends AMoteur{
    protected int nbPlace;

    public Voiture(int n_places){
        super();
        nbPlace = n_places;
    }

    public void to_string(){
        System.out.println("id: " + id + " distance: " + distance + " cpt_reservoir: " + capacite_reservoir + " niv_essence: " + niveau_essence + " nombre de places: " + nbPlace);
    }
}
