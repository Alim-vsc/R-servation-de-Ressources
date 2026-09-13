public class main {
    public static void main(String[] args) {
        ressources salleA=new salle(10,"salleA",40);
        ressources projecteurA=new MaterielMobile(15,"projecteur02","videoProjecteur");
        ressources pc=new MaterielMobile(20,"pc01","ordinateur portable");
        utilisateur user=new utilisateur(001,"Omar","omar@example.com");
        System.out.println(user.getnom());
        user.afficherUtilisateur();
        System.out.println(pc.toString());
        System.out. println(projecteurA.toString());
        System.out.println(pc.dureeMaxReservation());
        System.out.println(salleA.dureeMaxReservation());
        salleA.reserver();
        projecteurA.dureeMaxReservation();
        System.out.println(salleA.getdispo());
        salleA.liberer();
        System.out.println(salleA.getdispo());
        projecteurA.reserver();
        System.out.println(pc.getdispo());
        System.out.println(projecteurA.getdispo());
        projecteurA.liberer();
        System.out.println(projecteurA.getdispo());
        System.out.print(pc.getdispo());
        salleA.afficheRessource();
        pc.afficheRessource();
        projecteurA.afficheRessource();
    }
}


