package fr.discord.goodteam;

public class Game {
    public static void main(String[] args) {

        Personnage perso1 = new Personnage("David", 500, 80);
        Personnage perso2 = new Personnage("Goliath", 800, 40);

        while (perso1.estVivant() && perso2.estVivant()) {
            System.out.println(perso1.getNom() + " attaque " + perso2.getNom());
            perso1.attaque(perso2);
            perso2.afficherStatut();

            System.out.println(perso2.getNom() + " attaque " + perso1.getNom());
            perso2.attaque(perso1);
            perso1.afficherStatut();
        }

        if (perso1.estVivant()) {
            System.out.println(perso1.getNom() + " a vaincu " + perso2.getNom());
        } else {
            System.out.println(perso2.getNom() + " a vaincu " + perso1.getNom());
        }
    }
}
