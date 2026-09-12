Ce projet est une application qui met en œuvre un système permettant à un établissement de gérer la réservation de ses différentes ressources (salles, matériel mobile). En effet face aux multiples erreurs de réservations et de perte des matériels au sein de cet établissement, l’objectif principal de notre travail est de créer un programme informatique permettant la gestion de ces différents types de ressources (matériels et salles) tout   en appliquant rigoureusement des principes de durée d’utilisations et simplifier la vie des utilisateurs. 
Le système est ainsi structuré autour de plusieurs classes cruciales telles que :
 1.) Ressource (Classe mère) : elle contient les éléments fondamentaux 
Attributs privés : Int numéro, String nom, Boolean disponible
Méthodes clés :  libérer (), toString (), réserver ()
Méthode : dureeMaxReservation () implantée spécialement par chaque classe fille.
2.) La classe Salle.java (classe fille) :  elle decoule de la classe Ressource
Attributs privés : Int numéro, String nom, Boolean disponible
Attribut supplémentaire : Int capacite
 Elle fixe la durée maximale de réservation limitée à 4 heures
 3.) La classe MaterielMobile.java (classe fille) : elle est issue de la classe ressource
Attributs privés : Int numéro, String nom, Boolean disponible
Attribut supplémentaire : String catégorie
Sa particularité est la durée maximale de réservation limitée à 8 heures
4.) la classe utilisateur.java (classe fille)
Attributs : code ID, String nom, String email
5.)La classe Main.java : il contient les scenarios de tests pour la vérification de la création des classes salles, MaterielMobiles, la disponibilité ainsi que l’affiche des différentes informations.


