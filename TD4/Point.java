public class Point{
    private static Point origine = new Point(0, 0, "origine");
    private String nom;
    private float abscisse;
    private float ordonnee;

    public static void setOrigine(Point p){
        origine.setAbs(p.getAbs());
        origine.setOrd(p.getOrd());
    }
    
    public static Point getOrigine(){
        return origine;
    }

    public Point(float x, float y, String name){
        nom = name;
        abscisse = x;
        ordonnee = y;
    }

    public float getAbs(){
        return abscisse;
    }

    public float getOrd(){
        return ordonnee;
    }
    
    public String getName(){
        return nom;
    }

    public void setAbs(float x){
        abscisse = x;
    }

    public void setOrd(float y){
        ordonnee = y;
    }

    public void setName(String name){
        nom = name;
    }

    public float getX(){
        return abscisse - origine.getAbs();
    }

    public float getY(){
        return ordonnee - origine.getOrd();
    }

    public boolean pegX(Point p){
        return abscisse <= p.getAbs();
    }

    public boolean pegY(Point p){
        return ordonnee <= p.getOrd();
    }

    public void translate(float x, float y){
        abscisse += x;
        ordonnee += y;
    }

    public void symetrie(){
        float x = abscisse - origine.getAbs();
        float y = ordonnee - origine.getOrd();
        abscisse = -x;
        ordonnee = -y;
    }

    public String info(){
        return nom + "(" + abscisse + "," + ordonnee + ")";
    }
}
