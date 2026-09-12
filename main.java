public class main {
    public static void main(String[] args) {
        ressources salleA=new salle(10,"salleA",40);
        ressources projecteurA=new MaterielMobile(15,"projecteur02","videoProjecteur");
        ressources pc=new MaterielMoblie(20,"pc01","ordinateur portable");
        System.out.println(pc.toString());
        System.out. println(projecteurA.tostring());
        System.out.println(pc.dureeMaxReservation());
        salleA.reserve();
        salleA.dureeMaxReservation();
        pc.dureeMaxReservation();
        projecteurA.dureeMaxReservation();
        System.out.println(salleA.getdisponible());
        System.out.println(pc.getdisponible());
        System.out.println(projecteurA.getdisponible());
        salleA.liberer();
        System.out.print(pc.getdisponible());
    }
}


