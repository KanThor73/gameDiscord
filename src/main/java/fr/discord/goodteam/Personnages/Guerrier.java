package fr.discord.goodteam.Personnages;

import fr.discord.goodteam.Armes.Arme;

public class Guerrier extends Personnage {

    private static final int pvMax = 1500; // propre a chaque type de perso ==> avantage de classe
    private Glaive glaive;

    public Guerrier(String nom, int pv) {
        super(nom, pv);
        arme = new Arme();
    }

    public Guerrier(String nom, int pv, Arme arme) {
        super(nom, pv, arme);
        this.arme = arme;
    }

    // capacite speciale

    // public esquive(){

    // }
}
