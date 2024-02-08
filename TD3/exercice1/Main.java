public class Main{

    public static void main(String[] args){
        Point centre = new Point();
        Point a = new Point(1f);
        Point b = new Point(-1f, -1f);
        Segment seg_a = new Segment(centre, a);
        Segment seg_b = new Segment(centre, b);
        Cercle cercle = new Cercle(centre, 2);
        Cercle cercle_a = new Cercle(a, 0.5f);
        Cercle cercle_b = new Cercle(b, 0.5f);


        //reconstruction meilleur représentation car par dépendant
        //des points qui peuvent changer
        Cercle c1 = new Cercle(1f,1f,0.5f);
        Cercle c2 = new Cercle(-1f,1f,0.5f);
        Cercle c3 = new Cercle(0f,0f,2f);

        Segment s1 = new Segment(0f,0f,1f,1f);
        Segment s2 = new Segment(0f,0f,-1f,1f);
    }
}
