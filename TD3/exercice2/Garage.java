public class Garage{
    String nom;
    Voiture[] voitures;

    public Garage(String n, Voiture[] voit){
        nom = n;
        voitures = voit;
    }

    public Garage(String n){
        nom = n;
        voitures = new Voitures[0];
    }
}
