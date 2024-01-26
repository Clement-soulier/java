import java.util.Scanner;

public class exercice4{
    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);

        int nb_etudiant;
        String affichage = "[";

        do{
            System.out.print("Veuillez saisir le nombre d'étudiant :");
            nb_etudiant = lecteur.nextInt();
            System.out.println("");
        }while(nb_etudiant <= 0);

        String[] tNoms = new String[nb_etudiant];
        float[] tNotes = new float[nb_etudiant];


        int current_etudiant = 0;
        
        while(current_etudiant < nb_etudiant){
            do{
                System.out.print("nom de l'étudiant n°" + current_etudiant+1 + ":");
                tNoms[current_etudiant] = lecteur.next();
                System.out.println("");
            }while(tNoms[current_etudiant].length() <= 0);

            affichage += tNoms[current_etudiant] + " :";

            do{
                System.out.print("note de " + tNoms[current_etudiant] + " :");
                tNotes[current_etudiant] = lecteur.nextFloat();
                System.out.println("");
            }while(tNotes[current_etudiant] < 0 || tNotes[current_etudiant] > 20);
            affichage += tNotes[current_etudiant];
            if(!(current_etudiant == nb_etudiant - 1)) affichage += ", ";
            current_etudiant += 1;
        }
        

        lecteur.close();
        affichage += "]";
        System.out.println(affichage);
    }
}
