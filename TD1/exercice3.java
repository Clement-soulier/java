import java.util.Scanner;

public class exercice3{
    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);

        int montant;
        do{
            System.out.print("Quel est le montant à rendre (multiple de 5):");
            montant = lecteur.nextInt();
        }while(montant%5 != 0);
       
        lecteur.close();

        int[] coupons = {50,20,10,5};
        int[] nbcoupons = new int[4];
        
        int current_coupon = 0;
        int montant_restant;

        while(montant != 0){
            montant_restant = montant - coupons[current_coupon];
            if(montant_restant < 0) {
                current_coupon += 1;
            }
            else{
                montant = montant_restant;
                nbcoupons[current_coupon] += 1;
            }
        }

        System.out.println("rendu :");
        current_coupon = 0;
        while(current_coupon < 4){
            if(nbcoupons[current_coupon] != 0){
                System.out.println(nbcoupons[current_coupon] + "X" + coupons[current_coupon]);
            }
            current_coupon += 1;
        }
    }
}
