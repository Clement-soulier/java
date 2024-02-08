public class Cercle{
    Point centre;
    float rayon;

    public Cercle(float abs, float ord, float ray){
        centre = new Point(abs, ord);
        rayon = ray;
    }

    public Cercle(Point center, float ray){
        centre = center;
        rayon = ray;
    }

    public Cercle(float abs, float ord){
        centre = new Point(abs, ord);
        rayon = 1;
    }

    public Cercle(Point center){
        centre = center;
        rayon = 1;
    }
}
