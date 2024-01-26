import java.util.Scanner;

/*faire la validation de la date au moment de récup
  l'input et reboucler sur la question si pas valide jusqu'a ce 
  que ce soit valide do while
  utiliser des variable pour définir le jour max et s'en servir pour
  la validation
  saisir annee, mois, jour
  bisextile si divisible par 400 ou 4 et pas par 100
  newJour = jour%maxJour + 1
  new mois par défaut le meme mais si newjour == 1 alors mois += 1
  nouvel an si mois et jour sont à 1*/


public class exercice2{
    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);

        System.out.println("Entrer une date :");
        System.out.print("Jour :");
        int jour = lecteur.nextInt();
        System.out.println("");
        System.out.print("mois :");
        int mois = lecteur.nextInt();
        System.out.println("");
        System.out.print("Année :");
        int annee = lecteur.nextInt();
        System.out.println("");

        //validation jour
        if(jour > 31){
            System.out.println("la date n'est pas valide");
            System.exit(-1);
        }
        else if(mois < 1 || mois > 12){
            System.out.println("la date n'est pas valide");
            System.exit(-1);
        }
        else if(annee < 0){
            System.out.println("la date n'est pas valide");
            System.exit(-1);
        }
        else if(mois == 2 && annee%400 == 0 && jour > 29){
            System.out.println("la date n'est pas valide");
            System.exit(-1);
        }
        else if(mois == 2 && jour > 28){
            System.out.println("la date n'est pas valide");
            System.exit(-1);
        }
        else if((mois == 2 || mois == 4 || mois == 6 || mois == 9 || mois == 11) && jour > 31){
            System.out.println("la date n'est pas valide");
            System.exit(-1);
        }

        
        //calcul lendemain
        jour += 1;
        if(mois == 2 && annee%400 == 0 && jour > 29){
            jour = 1;
            mois += 1;
        }
        else if(mois == 2 && jour > 28){
            jour = 1;
            mois += 1;
        }
        else if((mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10) && jour > 31){
            jour = 1;
            mois += 1;
        }
        else if((mois == 2 || mois == 4 || mois == 6 || mois == 9 || mois == 11) && jour > 30){
            jour = 1;
            mois += 1;
        }
        else if(mois == 12 && jour > 31){
            mois = 1;
            jour = 1;
            annee += 1;
        }
        System.out.println("Demain nous serons le :" + jour + "/" + mois + "/" + annee);
    }
}
