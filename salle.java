public class salle extends ressources{
    int capacite;
    public salle(int numero,String nom,int capacite){
        super(numero, nom);
        this.capacite=capacite;
    }
    public  int getcapacite(){
        return capacite;

    }
     @Override 
    public int dureeMaxReservation(){
        return 4;
    }
    @Override
    public void reserver(){
        dispo=false;
    }
    @Override 
    public void liberer(){
        dispo=true;
    }
    @Override 
    public String toString(){
        super.toString();
        return ("la capacite est "+capacite);

    }
}