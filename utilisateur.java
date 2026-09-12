public class utilisateur{int codeID;
    String nom;
    String email;
    public utilisateur(int codeID,String nom,String email) {
        this.codeID = codeID;
        this.nom=nom;
        this.email=email;
    }
    public void afficherUtilisateur(){
        System.out.println("le nom est "+nom+" l identifiant est "+codeID+" l email est "+email);
    }
    public String getnom(){
        return nom;
    }
    public String getemail(){
        return email;
    }public int getcodeID(){
        return codeID;
    }
}
