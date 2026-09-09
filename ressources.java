public class ressources{
    int numero;
    String nomRess;
    boolean dispo;
    public ressources( int numero,String nomRess,boolean dispo){
        this.numero=numero;
        this.nomRess=nomRess;
        this.dispo=true;

    }
    public void disponibilite(boolean dispo){
        if (dispo=true){
            System.out.println("le materiel est disponible");
        }
        else{
            System.out.println("le materiel est disponible");
        }
    }
    public void afficheRessource(){
        System.out.println(" le nom du materiel est "+nomRess+" son numero est "+numero);
    }
}
