package fr.discord.goodteam.Personnages;

import fr.discord.goodteam.Armes.Arme;

// idee on ne peut instancier qu'un 'type' de perso ex:mage et non la class perso

public class Mage extends Personnage {
    private static final int pvMax = 2000; // propre a chaque type de perso ==> avantage de classe
    private Arme arme;

    public Mage(String nom, int pv) {
        super(nom, pv);
        arme = new Arme();
    }

    public Mage(String nom, int pv, Arme arme) {
        super(nom, pv, arme);
        this.arme = arme;
    }

    // capacite speciale

    // public volDeVie(){

    // }

}
