public class main {
    public static void main(String[] args) {
        utilisateur OMAR=new utilisateur(2,"OMAR","omar@gmail");
        OMAR.afficherUtilisateur();
        ressources videoprojecteur=new ressources(1,"videoprojecteur",true);
        videoprojecteur.afficheRessource();
        ressources  ordinateur =new ressources(2,"ordinateur",true);
        ordinateur.afficheRessource();
        reservation reservation1=new reservation();
        reservation1.reserver(2,"OMAR","videoprojecteur",true,"10h","12h");
        reservation1.annulation(true);


    }
}

