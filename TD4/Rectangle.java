public class Rectangle{
    private String nom;
    private Point extremite1;
    private Point extremite2;

    public Rectangle(Point p1, Point p2){
        nom = p1.getName() + p2.getName();
        extremite1 = p1;
        extremite2 = p2;
    }

    public float getPPAbs(){
        if(extremite1.pegX(extremite2)){
            return extremite1.getAbs();
        }
        return extremite2.getAbs();
    }

    public float getPGAbs(){
        if(extremite1.pegX(extremite2)){
            return extremite2.getAbs();
        }
        return extremite1.getAbs();
    }

    public float getPPOrd(){
        if(extremite1.pegY(extremite2)){
            return extremite1.getOrd();
        }
        return extremite2.getOrd();
    }    

    public float getPGOrd(){
        if(extremite1.pegY(extremite2)){
            return extremite2.getOrd();
        }
        return extremite1.getOrd();
    }

    public void translate(float x, float y){
        extremite1.translate(x, y);
        extremite2.translate(x, y);
    }
    
    public void symetrie(){
        extremite1.symetrie();
        extremite2.symetrie();
    }

    public float surface(){
        float longueur = this.getPGAbs() - this.getPPAbs();
        float largeur = this.getPGOrd() - this.getPPOrd();
        return longueur * largeur;
    }

    public String info(){
        return nom + "[" + extremite1.info() + "," + extremite2.info() + "]";
    }
}
