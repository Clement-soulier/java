public class Velo extends SansMoteur{
    protected int nbVitesse;

    public Velo(int nb_vitesse){
        super();
        nbVitesse = nb_vitesse;
    }

    public void to_string(){
        System.out.println("id: " + id + " distance: " + distance + " nombre vitesses: " + nbVitesse);
    }
}
