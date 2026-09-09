public class utilisateur{int codeID;
    String nom;
    String email;
    public Utilisateur(int codeID,String nom,String email) {
        this.codeID = codeID;
        this.nom=nom;
        this.email=email;
    }
    public void afficherUtilisateur(){
        System.out.println("le nom est "+nom+" l identifiant est "+codeID+" l email est "+email);
    }
}
