package fr.discord.goodteam.Armes;

import fr.discord.goodteam.Armes.Arme;

public class BouleDeFeu extends Arme {
    private final String nom = "BouleDeFeu";
    private final int degats = 90;
    private String alter = "brulure";

    @Override
    public void afficherStatut() {
        super.afficherStatut();
        System.out.println("Alteration : " + alter);
    }

}
