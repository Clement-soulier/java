public class C extends A{
    static int nbC=0;
    static {System.out.println("Bloc statique de C");}
    {System.out.println("Bloc non statique de C pour la "+ nbC+" fois");nbC++;}
    public C(){
        System.out.println("Constructeur 1 de C ");
    }
    public C(int paramInutil){
        System.out.println("Constructeur 2 de C ");
    }
    public void m2(){
        System.out.println("m2 de C");
    }
}
