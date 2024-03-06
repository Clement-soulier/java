public class Interne extends Noeud{
    protected Noeud parent;

    public Interne(String n, Noeud par){
        super(n);
        parent = par;
    }

    public Noeud consulterParent(){
        return parent;
    }
}
