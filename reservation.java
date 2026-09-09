public class reservation{
    public utilisateur codeID;
    public utilisateur nom;
    public ressources nomRess;
    public ressources numero;
    public ressources dispo;
    String heurdebut;
    String heurfin;
    public void reserver(int codeID,String nom,String nomRess,boolean dispo,String heurdebut,String heurfin){
        if (dispo=true){
            dispo=false;
            System.out.println("l utilisateur "+nom+" d identifiant "+codeID+" a reserve le materiel "+nomRess+" de numero "+numero+" de "+heurdebut+" a "+heurfin);
        }
        else{
             System.out.println("deja reserve");
        }
    }
    public void annulation(boolean dispo){
        dispo=true;
    }
}
