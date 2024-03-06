public class D extends A{
    static int nbD=0;
    static {System.out.println("Bloc statique de D");}
    {System.out.println("Bloc pas statique de D pour la "+ nbD+" fois");nbD++;}
    public D(){
        System.out.println("Constructeur 1 de D ");
    }
    public D(int paramInutil){
        System.out.println("Constructeur 2 de D ");
    }
    public void m1(){
        System.out.println("m1 de D");
    }
}
