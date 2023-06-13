package fr.discord.goodteam.Inventaire;

import fr.discord.goodteam.Inventaire.Objet;

public class ObjetStackable extends Objet {
    private static final int MAX_STK = 20;
    private int stack;

    public ObjetStackable(String nom) {
        super(nom);
        stack = 1;
    }

    public ObjetStackable(String nom, String descr) {
        super(nom, descr);
        stack = 1;
    }

    public ObjetStackable(String nom, int nb) throws Exception {
        super(nom);
        stack = nb;
        verifStack(this);
    }

    public ObjetStackable(String nom, String descr, int nb) throws Exception {
        super(nom, descr);
        stack = nb;
        verifStack(this);
    }

    public int getStackNb() {
        return stack;
    }

    // permet de modifier la quantité d'objet, passer un argument négatif pour un
    // retrait
    // on peut imaginer d'éviter la vérification et de retourner la différence
    public void gain(int val) throws Exception {
        stack += val;
        verifStack(this);
    }

    @Override
    public void afficherStatut() {
        super.afficherStatut();
        System.out.println("En " + stack + " exemplaires ");
    }

    public static void verifStack(ObjetStackable obj) throws Exception {
        if (obj.stack < 0 || obj.stack > MAX_STK) {
            throw new Exception("Out of range : stack = " + obj.stack);
        }
        if (obj.stack == 0) { // on aimerait détruire l'objet si le stack est vide
            throw new Exception("Objet en 0 exemplaire");
        }
    }
}
