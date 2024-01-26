import java.util.Scanner;

public class exercice3{
    public static void main(String[] args){
        Scanner lecteur = new Scanner(System.in);
        do{
            System.out.print("Quel est le montant à rendre (multiple de 5):");
            int montant = lecteur.nextInt();
        }while(montant%5 != 0) 
        
        int[] coupons = {50,20,10,5};
        int[] nbcoupons = [4];
        
        int current_coupon = 0;
        int montant_restant;

        while(montant != 0){
            montant_restant = montant - coupons[current_coupon];
            if(montant_restant < 0) {
                current_coupon += 1;
            }
            else{
                montant = motant_restant;
                nbcoupons[current_coupon] += 1
            }
        }

        System.out.println("rendu :");
        current_coupon = 0
        while(current_coupons < 4){
            if(nbcoupons[current_coupon] != 0){
                System.out.println(nbcoupons[current_coupon] + "X" + coupons[current_coupon]);
            }
        }
    }
}
