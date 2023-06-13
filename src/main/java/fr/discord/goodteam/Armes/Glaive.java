package fr.discord.goodteam.Armes;

import fr.discord.goodteam.Armes.Arme;

public class Glaive extends Arme {
	private final String nom = "Glaive";
	private final int degats = 120;
	private String alter = "hemorragie";

	@Override
	public void afficherStatut() {
		super.afficherStatut();
		System.out.println("Alteration : " + alter);
	}
}
