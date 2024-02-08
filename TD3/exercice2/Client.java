public class Client{
    int numero;
    String nom;
    String prenom;
    String adresse;
    Achat[] achats;


    public Client(int num, String n, String p, String adr){
        numero = num;
        nom = n;
        prenom = p;
        adresse = adr;
        achats = new Achat[0];
    }
    
    public Client(int num, String n, String p, String adr, Achat[] ach){
        numero = num;
        nom = n;
        prenom = p;
        adresse = adr;
        achats = ach;
    }
}
