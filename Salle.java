public class Salle extends Ressources{
    int capacite;
    public Salle(int numero,String nomRess,int capacite){
        super(numero,nomRess,true);
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
        if(dispo==true){
        dispo=false;
        System.out.println("la reservation de la salle est validee");
        }
        else{
            System.out.println("La salle est deja reservee");
        }
    }

    @Override 
    public void liberer(){
        if (dispo==false){
        dispo=true;
        System.out.println("la salle est disponible");
        }
        else{
            System.out.println("La salle est deja liberer");
        }
    }
    @Override 
    public String toString(){
        super.toString();
        return ("la capacite est "+capacite);

    }
    @Override 
    public String estreserve(){
        return (dispo?"disponible":"indisponible");
    }
}
