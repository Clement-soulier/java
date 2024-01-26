import java.util.Scanner;

/*Faire le tableau note et nom en une boucle
  utiliser un do while pour forcer le nom à faire au moins un caractère
  utiliser des boucles for plutot
  pour éviter la dernière boucle déclarer un string et contruire le tableau au fur et à mesure pour 
  l'afficher à la fin*/

public class exercice4{
    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);

        int nb_etudiant;
        do{
            System.out.print("Veuillez saisir le nombre d'étudiant");
            nb_etudiant = lecteur.nextInt();
            System.out.println("");
        }while(nb_etudiant <= 0);

        String[] tNoms = new String[nb_etudiant];
        float[] tNotes = new float[nb_etudiant];


        int current_etudiant = 0;
        
        //saisie nom
        while(current_etudiant < nb_etudiant){
            System.out.print("nom de l'étudiant n°" + current_etudiant + ":");
            String nom = lecteur.next();
            System.out.println("");
            tNoms[current_etudiant] = nom;
            current_etudiant += 1;
        }


        //saisie notes
        current_etudiant = 0;
        while(current_etudiant < nb_etudiant){
            System.out.print("note de l'étudiant n°" + current_etudiant + ":");
            float note = lecteur.nextFloat();
            System.out.println("");
            tNotes[current_etudiant] = note;
            current_etudiant += 1;
        }

        //affichage
        System.out.print("[");
        current_etudiant = 0;
        while(current_etudiant < nb_etudiant){
            System.out.print(tNoms[current_etudiant] + ":" + tNotes[current_etudiant] + ", ");
            current_etudiant += 1;
        }
        System.out.print("]");

    }
}
