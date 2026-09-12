public class ressources{
    int numero;
    String nomRess;
    boolean dispo;
    public ressources( int numero,String nomRess,boolean dispo){
        this.numero=numero;
        this.nomRess=nomRess;
        this.dispo=true;
    }
    public boolean getdispo(){
        return dispo;
    }
    
    public string getnomRess(){
        returm nomRess;
    }
    
    public int getnumero(){
        retur numero;
    }

    public void afficheRessource(){
        System.out.println(" le nom du materiel est "+nomRess+" son numero est "+numero);
    }
    public void reserver(){

   }
   public void liberer(){
   }
   @Override
    public String toString(){
        return("le numero est "+numero+" et le nom est "+nom);

    }
}
