public class Vehicule{
    static int nbVehicule = 0;
    protected int id;
    protected int distance;
    
    public Vehicule(){
        id = nbVehicule++;
        distance = 0;
    }

    public void to_string(){
        System.out.println("id: " + id + " distance: " + distance);
    }

    public void avancer(int dist){
        distance += dist;
    }
}
