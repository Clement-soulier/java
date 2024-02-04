import java.util.Scanner;

public class UtilTab{
    public static String[] creerTabString(){
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Quel est le nombre d'élément :");
        int nombre_element = lecteur.nextInt();
        System.out.println("");
        nombre_element = Math.max(0, nombre_element);
        String[] tab = new String[nombre_element];
        for(int i = 0; i < nombre_element; i++){
            System.out.print("quel est l'élément n°" + i + ":");
            tab[i] = lecteur.next();
        }
        lecteur.close();
        return tab;
    }

    public static Double[] creerTabDouble(){
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Quel est le nombre d'élément :");
        int nombre_element = lecteur.nextInt();
        System.out.println("");
        nombre_element = Math.max(0, nombre_element);
        Double[] tab = new Double[nombre_element];
        for(int i = 0; i < nombre_element; i++){
            System.out.print("quel est l'élément n°" + i + ":");
            tab[i] = lecteur.nextDouble();
        }
        lecteur.close();
        return tab;
    }

    public static void affiche(String[] tab){
        if(tab != null){
            System.out.print("[");
            for(int i = 0; i < tab.length; i++){
                System.out.print(tab[i]);
                if(i != tab.length - 1){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }

    public static void affiche(Double[] tab){
        if(tab != null){
            System.out.print("[");
            for(int i = 0; i < tab.length; i++){
                System.out.print(tab[i]);
                if(i != tab.length - 1){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
    }

    public static void copiezone(String[] t1, String[] t2, int deb1, int fin1, int deb2){
        deb1 = Math.max(0, deb1);
        fin1 = Math.min(t1.length - 1, fin1);
        int nbec = (fin1-deb1) - 1;
        nbec = Math.max(nbec, 0);
        nbec = Math.min(nbec, t2.length - deb2);
        for(int i = 0; i < nbec; i++){
            t2[deb2 + i] = t1[deb1 + i];
        }
    }

    public static void copiezone(String[] t1, Double[] t2, int deb1, int fin1, int deb2){
        deb1 = Math.max(0, deb1);
        fin1 = Math.min(t1.length - 1, fin1);
        int nbec = (fin1-deb1) - 1;
        nbec = Math.max(nbec, 0);
        nbec = Math.min(nbec, t2.length - deb2);
        for(int i = 0; i < nbec; i++){
            t2[deb2 + i] = t1[deb1 + i];
        }
}
    //@tab != null;
    public static String[] agrandir(String[] tab, int taille){
        if(taille > 0){
            String[] new_tab = new String[tab.length + taille];
            for(int i = 0; i < tab.length; i++){
                new_tab[i] = tab[i];
            }
            return new_tab;
        }
        return tab;
    }

    //@tab != null;
    public static Double[] agrandir(Double[] tab, int taille){
        if(taille > 0){
            Double[] new_tab = new Double[tab.length + taille];
            for(int i = 0; i < tab.length; i++){
                new_tab[i] = tab[i];
            }
            return new_tab;
        }
        return tab;
    }

    public static String[] fusion(String[] tab1, String[] tab2){
        if(!(tab1 == null) && !(tab2 == null)){
            String[] new_tab = new String[tab1.length + tab2.length - 1];
            for(int i = 0; i < tab1.length; i++){
                new_tab[i] = tab1[i];
            }
            for(int i = 0; i < tab2.length; i++){
                new_tab[i + tab1.length - 1] = tab2[i];
            }
            return new_tab;
        }
        return new String[1];
    }

    public static Double[] fusion(Double[] tab1, Double[] tab2){
        if(!(tab1 == null) && !(tab2 == null)){
            Double[] new_tab = new Double[tab1.length + tab2.length - 1];
            for(int i = 0; i < tab1.length; i++){
                new_tab[i] = tab1[i];
            }
            for(int i = 0; i < tab2.length; i++){
                new_tab[i + tab1.length - 1] = tab2[i];
            }
            return new_tab;
        }
        return new Double[1];
    }

    //@tab != null
    public static void inserer(String[] tab, int indice, String element){
        indice = Math.max(0, indice);
        indice = min(tab.length - 1, indice);
        tab[indice] = element;
    }


    public static void main(String[] args){
        String[] tab1 = {"a","b","c","d"};
        afficheStringTab(tab1);
        String[] tab2 = {"d","c","b","a"};
        afficheStringTab(tab2);
        String[] tab = copieString(tab1, tab2, 0, 3, 0);
        afficheStringTab(tab);
    }


}
