public class Main{
    public static void main(String[] args){
        Dessin dessin = new Dessin();

        Point a = new Point(3, 4, "a");
        Point b = new Point(4, 2, "b");
        Rectangle ab = new Rectangle(a, b);

        Point c = new Point(-4, 2, "c");
        Point d = new Point (4, -4, "d");
        Rectangle cd = new Rectangle(c, d);

        Point e = new Point(-1, 1, "e");
        Point f = new Point(1, -4, "f");
        Rectangle ef = new Rectangle(e, f);

        Point g = new Point(2, -1, "g");
        Point h = new Point(3, -2, "h");
        Rectangle gh = new Rectangle(g, h);

        Point i = new Point(-3, -1, "i");
        Point j = new Point(-2, -2, "j");
        Rectangle ij = new Rectangle(i, j);

        dessin.ajout(ab);
        dessin.ajout(cd);
        dessin.ajout(ef);
        dessin.ajout(gh);
        dessin.ajout(ij);

        dessin.affiche();
        System.out.println(dessin.surface());
        System.out.println(cd.surface());

        Point.setOrigine(d);
    }
}
