package fr.discord.goodteam.Inventaire;

import fr.discord.goodteam.Inventaire.Objet;

public class PotionVie extends ObjetStackable { // on peut envisager une classe générique Potion, si on souhaite ajouter
												// des Potions de mana ou autres
	private int gainPv;

	public PotionVie(int gainPv) {
		super("Potion de vie", "Rend " + gainPv + " points de vie");
		setup(gainPv);
	}

	public PotionVie(int gainPv, int stack) throws Exception {
		super("Potion de vie", "Rend " + gainPv + " points de vie", stack);
		setup(gainPv);
	}

	private void setup(int gainPv) {
		if (gainPv <= 0) {
			throw new Error("Une potion de vie doit rendre des points de vie : " + gainPv);
		}
		this.gainPv = gainPv;
	}

	public int use() throws Exception {
		verifStack(this);
		gain(-1);
		return gainPv;
	}
}
