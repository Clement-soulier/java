public class Dessin{
    private Rectangle[] dessin = new Rectangle[0];

    public void ajout(Rectangle rectangle){
        if(dessin.length == 0){
            Rectangle[] new_tab = new Rectangle[dessin.length + 1];
            new_tab[0] = rectangle;
            dessin = new_tab;
        }
        else{
            Rectangle[] new_tab = new Rectangle[dessin.length + 1];
            for(int i = 0; i < dessin.length; i++){
                new_tab[i] = dessin[i];
            }
            new_tab[dessin.length] = rectangle;
            dessin = new_tab;
        }
    }

    public void translate(float x, float y){
        for(int i = 0; i < dessin.length; i++){
            dessin[i].translate(x, y);
        }
    }

    public void symetrie(){
        for(int i = 0; i < dessin.length; i++){
            dessin[i].symetrie();
        }
    }

    public float surface(){
        if(dessin.length == 0){
            return 0;
        }
        float[] surface = new float[dessin.length];
        for(int i = 0; i < dessin.length; i++){
            surface[i] = dessin[i].surface();
        }

        float min = surface[0];
        for(int i = 1; i < surface.length; i++){
            if(surface[i] < min){
                min = surface[i];
            }
        }

        return min;
    }

    public void affiche(){
        for(int i = 0; i < dessin.length; i++){
            System.out.println(dessin[i].info());
        }
    }
}
