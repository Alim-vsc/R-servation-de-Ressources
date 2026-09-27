Ce projet est une application qui met en œuvre un système permettant à un établissement de gérer la réservation de ses différentes ressources (salles, matériel mobile). En effet face aux multiples erreurs de réservations et de perte des matériels au sein de cet établissement, l’objectif principal de notre travail est de créer un programme informatique permettant la gestion de ces différents types de ressources (matériels et salles) tout   en appliquant rigoureusement des principes de durée d’utilisations et simplifier la vie des utilisateurs. Le système est ainsi structuré autour de plusieurs classes cruciales telles que: 
1.) <<Interface>>
  Reservable
  reserver():void
  liberer():void
  estReserve():string
2.)Classe Mère Ressources (Abstraite)
 numéro : Int
 nomRess : String
 Dispo : Boolean
 getdispo : Boolean
 getnomRess : String
 getnumero : Int
 afficheRessource : void
 toString : string
 dureeMaxReservation () : Int
 Ressources()
3.)Classe fille MaterielMobile
 categorie: String
 getcategorie(): String
 toString(): String
 dureeMaxReservation(): int
 MaterielMobile( numero: int, nomRess: String, categorie: String )
 4.)Classe fille Salle
 capacite: int
 getcapacite(): int
 dureeMaxReservation():int
 toString: string
 Salle( numero: int, nomRess: String, capacite: int )
 5.)Classe Utilisateur
 codeID: int
 nom: String
 email: String
 afficherUtilisateur(): void
 getnom(): String
 getemail(): String
 getcodeID(): int
 Utilisateur( int codeID, String nom, String email )
Toutes ses informations concernant les différentes classes ainsi que l'interface ont été regroupés dans  le diagramme.


