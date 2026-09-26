public class MaterielMobile extends Ressources{
    String categorie;
    public MaterielMobile(int numero,String nomRess,String categorie){
        super(numero,nomRess,true);
        this.categorie=categorie;
    }
    public String getcategorie(){
        return categorie;
    }
    @Override
    public String toString(){
         return ("la categorie est "+categorie );
    }
    @Override
    public int dureeMaxReservation(){
        return 8;
    }
    @Override 
    public void liberer(){
        if (dispo==false){
        dispo=true;
        System.out.println("Le materiel est disponible ");
        }
        else{
            System.out.println("Le materirel est deja liberé");
        }
    }
    @Override
    public void reserver(){
        if(dispo==true){
        dispo=false;
        System.out.println("La reservation du materiel est validée");
        }
        else{
            System.out.println("Le materiel est deja reservé");
        }
    }
    @Override 
    public String  estreserve(){
        return (dispo?"disponible":"indisponible");
        
    }
}
