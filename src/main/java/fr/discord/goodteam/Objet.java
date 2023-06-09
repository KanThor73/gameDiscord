package fr.discord.goodteam;

public class Objet {
    private String nom;
    private String description;

    /*private Objet() {
        // Attention, private, tout objet doit avoir un nom

        nom = "Insecte";
        description = "A kind of bug";
    }*/

    public Objet(String nom) {

        this.nom = nom;
        description = null;
    }

    public Objet(String nom, String descr) {

        this.nom = nom;
        description = descr;
    }

    public String getNom() {

        return nom;
    }

    public void afficherStatut() {

        System.out.println(nom);
        if (description != null) {
            System.out.println(description);
        }
    }
}