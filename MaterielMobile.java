public class materiel extends ressources{
    String categorie;
    public materiel(int numero,String nom,String categorie){
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
