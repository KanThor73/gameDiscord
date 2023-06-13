package fr.discord.goodteam.Personnages;

import fr.discord.goodteam.Personnages.Personnage;
import fr.discord.goodteam.Armes.Arme;
import fr.discord.goodteam.Armes.BouleDeFeu;

// idee on ne peut instancier qu'un 'type' de perso ex:mage et non la class perso

public class Mage extends Personnage {
    private static final int pvMax = 2000; // propre a chaque type de perso ==> avantage de classe
    private BouleDeFeu bouleDeFeu;

    public Mage(String nom, int pv) {
        super(nom, pv, new Arme());
    }

    public Mage(String nom, int pv, Arme arme) {
        super(nom, pv, arme);
    }

    // capacite speciale

    // public volDeVie(){

    // }

}
