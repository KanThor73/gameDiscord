package fr.discord.goodteam.Personnages;

import fr.discord.goodteam.Personnages.Personnage;
import fr.discord.goodteam.Armes.Arme;
import fr.discord.goodteam.Armes.Glaive;

public class Guerrier extends Personnage {

    private static final int pvMax = 1500; // propre a chaque type de perso ==> avantage de classe
    private Glaive glaive;

    public Guerrier(String nom, int pv) {
        super(nom, pv, new Arme());
    }

    public Guerrier(String nom, int pv, Arme arme) {
        super(nom, pv, arme);
    }

    // capacite speciale

    // public esquive(){

    // }
}
