package fr.discord.goodteam;

public class Arme {
    private int degats;
    private String nom;

    public Arme(String nom, int degats) {
        this.nom = nom;
        this.degats = degats;
    }

    public String getNom() {
        return this.nom;
    }

    public int getDegats() {
        return this.degats;
    }
}
