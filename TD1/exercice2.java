import java.util.Scanner;

public class exercice2{
    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);

        System.out.println("Entrer une date :");
        
        int jour, mois, annee;
        int jour_max = 31;

        //année
        System.out.print("Année :");
        annee = lecteur.nextInt();
        System.out.println("");

        boolean bisexctile = (annee%400 == 0 || annee%4 == 0) && !(annee%100 == 0);

        //mois
        do{
            System.out.print("mois :");
            mois = lecteur.nextInt();
            System.out.println("");
        }while(mois <= 0 || mois > 12);


        //mise à jour jour_max
        if(bisexctile && mois == 2) jour_max = 29;
        if(!bisexctile && mois ==2) jour_max = 28;
        if(mois == 4 || mois == 6 || mois == 9 || mois == 11) jour_max = 30;

        //jour
        do{
            System.out.print("Jour :");
            jour = lecteur.nextInt();
            System.out.println("");
        }while(jour <= 0 || jour > jour_max);

        lecteur.close();

        //calcul lendemain
        jour = jour%jour_max + 1;
        if(jour == 1) mois += 1;
        if(mois > 12) mois = 1;
        if(jour == 1 && mois == 1) annee += 1;
        
        System.out.println("Demain nous serons le :" + jour + "/" + mois + "/" + annee);
    }
}
