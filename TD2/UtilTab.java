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

    public static void copiezone(Double[] t1, Double[] t2, int deb1, int fin1, int deb2){
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

    public static Double[] fusion(Double[] tab1, Double[] tab2){
        int i1=0;
        int i2=0;
        int i=0;
        double[] res = new double[tab.length+tab2.length];
        while(i1<tab1.length && i2 < tab2.length){
            if(tab1[i1] < tab2[i2]){;
                res[i] = tab1[i1];
                i1++;
            } else{
                res[i] = tab2[i2];
                i2++;
            }
            i++;
        }
        if(i1 < tab1.length){
            copieZone(tab1, res, i1, tab1.length - 1, i);
        } else{
            copieZone(tab2, res, i2, tab2.length - 1, i);
        }
        return res;
    }      

    //@tab != null
    public static void inserer(String[] tab, int indice, String element){
        indice = Math.max(0, indice);
        indice = Math.min(tab.length - 1, indice);
        tab[indice] = element;
    }

    public static void inserer(Double[] tab, int indice, Double element){
        indice = Math.max(0, indice);
        indice = Math.min(tab.length - 1, indice);
        tab[indice] = element;
    }

    public static void suppr_reduit(String[] tab, int nombre_element){
        String[] new_tab = new String[tab.length - nombre_element];
        for(int i = 0; i < new_tab.length; i++){
            new_tab[i] = tab[i];
        }
        tab = new_tab;
    }    

    public static void suppr_reduit(Double[] tab, int nombre_element){
        Double[] new_tab = new Double[tab.length - nombre_element];
        for(int i = 0; i < new_tab.length; i++){
            new_tab[i] = tab[i];
        }
        tab = new_tab;
    }

    public static void suppr_element(String[] tab, String element){
        String[] new_tab = new String[tab.length - 1];
        for(int i = 0; i < new_tab.length; i++){
            if(!(tab[i] == element)){
                new_tab[i] = tab[i];
            }
        }
        tab = new_tab;
    }
   
    public static void suppr_element(Double[] tab, Double element){
        Double[] new_tab = new Double[tab.length - 1];
        for(int i = 0; i < new_tab.length; i++){
            if(!(tab[i] == element)){
                new_tab[i] = tab[i];
            }
        }
        tab = new_tab;
    }
    
    public static Double[] tri_fusion(Double[] tab){
        if(tab.length == 1){
            return tab;
        }
        int milieu = tab.length/2;
        double[] tab_left = new double[middle];
        double[] tab_right = new double[tab.length - middle];
        copieZone(tab, tab_left, 0, middle-1, 0);
        copieZone(tab, tab_right, middle, tab.length - 1, 0);
        return fusion(tri_fusion(tab_left), tri_fusion(tab_right));
    }

    public static void main(String[] args){
        Double[] tab1 = {1,2,3,4,5};
        Double[] tab2 = {5,1,4};
        affiche(tab1);
    }
}
