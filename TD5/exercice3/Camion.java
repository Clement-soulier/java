public class Camion extends AMoteur{
    private int volume_trans;

    public Camion(int vol){
        super();
        volume_trans = vol;
    }

    public void to_string(){
        System.out.println("id: " + id + " distance: " + distance + " cpt_reservoir: " + capacite_reservoir + " niv_essence: " + niveau_essence + " volume transporté: " + volume_trans);
    }
}
