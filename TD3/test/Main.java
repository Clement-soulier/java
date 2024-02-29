import java.util.Scanner;

public class Main{
    public static void main(String[] agrs){
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Entrer l'abscisse:");
        int abs = lecteur.nextInt();
        System.out.println("Entrer l'ord:");
        int ord = lecteur.nextInt();
        Point p = new Point(abs, ord);
    }
}
