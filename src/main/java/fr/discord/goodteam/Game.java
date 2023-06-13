package fr.discord.goodteam;

import fr.discord.goodteam.Armes.Arme;
import fr.discord.goodteam.Inventaire.PotionVie;
import fr.discord.goodteam.Personnages.Personnage;
import fr.discord.goodteam.Exceptions.NullStackException; // temporaire

public class Game {
	public static void main(String[] args) {

		Personnage perso1 = new Personnage("David", 500);
		Personnage perso2 = new Personnage("Goliath", 800);
		Arme lancePierre = new Arme("Lance-pierre", "Petit mais costaud", 85);
		Arme lanceGeante = new Arme("Lance geante", 40);

		perso1.equiper(lancePierre);
		perso2.equiper(lanceGeante);

		perso1.afficherInventaire();
		System.out.println();

		perso2.afficherInventaire();
		System.out.println();

		while (perso1.estVivant() && perso2.estVivant()) {
			perso1.attaque(perso2);
			perso2.afficherStatut();

			System.out.println();

			perso2.attaque(perso1);
			perso1.afficherStatut();

			System.out.println();
		}

		perso2.boire(new PotionVie(100));
		PotionVie pot = new PotionVie(1000);
		perso1.boire(pot);
		perso1.boire(pot);

		perso1.afficherStatut();
		System.out.println();

		if (perso1.estVivant()) {
			System.out.println(perso1.getNom() + " a vaincu " + perso2.getNom());
		} else {
			System.out.println(perso2.getNom() + " a vaincu " + perso1.getNom());
		}
	}
}
