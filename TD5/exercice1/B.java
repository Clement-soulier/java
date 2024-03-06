public class B extends A{
    static int nbB=0;
    static {System.out.println("Bloc statique de B");}
    {System.out.println("Bloc non statique de B pour la "+ nbB+" fois");nbB++;}
    public B(){
        System.out.println("Constructeur 1 ");
    }
    public void m1(){
        System.out.println("m1 de B");
    }
}
