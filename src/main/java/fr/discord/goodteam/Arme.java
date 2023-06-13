package fr.discord.goodteam;

import fr.discord.goodteam.Objet;

public class Arme extends Objet {
    private int degats;

    public Arme() {
        super("Branche ridicule", "Un simple bout de bois ramassé au bord du chemin");
        degats = 2;
    }

    public Arme(String nom, int degats) {
        super(nom);
        this.degats = degats;
        // vérifier que degats soient positifs ? ou différencier armes de frappes et
        // armes de soin ?
    }

    public Arme(String nom, String description, int degats) {
        super(nom, description);
        this.degats = degats;
        // vérifier que degats soient positifs ? ou différencier armes de frappes et
        // armes de soin ?
    }

    public int getDegats() {
        return this.degats;
    }

    @Override
    public void afficherStatut() {
        super.afficherStatut();
        System.out.println("Degats : " + degats);
    }
}
