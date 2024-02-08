public class Segment{
    Point debut;
    Point fin;
    
    public Segment(float x1, float y1, float x2, float y2){
        debut = new Point(x1, y1);
        fin = new Point(x2, y2);
    }

    public Segment(Point pt1, Point pt2){
        debut = pt1;
        fin = pt2;
    }
}
