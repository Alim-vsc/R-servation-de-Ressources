public class MaterielMobile extends ressources{
    String categorie;
    public MaterielMobile(int numero,String nom,String categorie){
        super( numero,nom);
        this.categorie=categorie;
    }
    public String getcategorie(){
        return categorie;
    }
    @Override
    public String toString(){
       super.toString();
       return("lacategorie est "+categorie);
    }
    @Override
    public int dureeMaxReservation(){
        return 8;
    }
    @Override 
    public void liberer(){
        dispo=true;
    }
    public void reserver(){
        dispo=false;
    }
}
