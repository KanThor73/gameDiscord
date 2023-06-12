package fr.discord.goodteam;

import fr.discord.goodteam.Personnage;
import fr.discord.goodteam.Arme;

public class Game {
    public static void main(String[] args) {

        Personnage perso1 = new Personnage("David", 500);
        Personnage perso2 = new Personnage("Goliath", 800);
        Arme lancePierre = new Arme("Lance-pierre", "Petit mais costaud", 85);
        Arme lanceGeante = new Arme("Lance geante", 40);

        perso2.equiper(lancePierre);
        perso1.equiper(lanceGeante);

        perso1.afficherInventaire();
        System.out.println("");

        perso2.afficherInventaire();
        System.out.println("");

        while (perso1.estVivant() && perso2.estVivant()) {
            perso1.attaque(perso2);
            perso2.afficherStatut();

            System.out.println();

            perso2.attaque(perso1);
            perso1.afficherStatut();

            System.out.println();
        }

        if (perso1.estVivant()) {
            System.out.println(perso1.getNom() + " a vaincu " + perso2.getNom());
        } else {
            System.out.println(perso2.getNom() + " a vaincu " + perso1.getNom());
        }
    }
}
