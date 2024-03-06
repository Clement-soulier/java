public class Main{
    public static void main(String[] args){
        Racine n = new Racine("a");
        n.ajouterEnfant();
        n.ajouterEnfant();
        n.consulterEnfant(0).ajouterEnfant();
        n.consulterEnfant(1).ajouterEnfant();
        n.consulterEnfant(1).ajouterEnfant();

        System.out.println("racine :" + n.nom);
        System.out.println("enfant :" + n.consulterEnfant(0).nom + " a pour parent : " + n.consulterEnfant(0).consulterParent().nom);
        System.out.println("enfant :" + n.consulterEnfant(1).nom + " a pour parent : " + n.consulterEnfant(1).consulterParent().nom);
        System.out.println("enfant :" + n.consulterEnfant(0).consulterEnfant(0).nom + " a pour parent : " + n.consulterEnfant(0).consulterEnfant(0).consulterParent().nom);
        System.out.println("enfant :" + n.consulterEnfant(1).consulterEnfant(0).nom + " a pour parent : " + n.consulterEnfant(1).consulterEnfant(0).consulterParent().nom);
        System.out.println("enfant :" + n.consulterEnfant(1).consulterEnfant(1).nom + " a pour parent : " + n.consulterEnfant(1).consulterEnfant(1).consulterParent().nom);
    }
}
