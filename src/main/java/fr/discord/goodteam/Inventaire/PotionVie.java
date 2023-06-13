package fr.discord.goodteam.Inventaire;

public class PotionVie extends ObjetStackable { // on peut envisager une classe générique Potion, si on souhaite ajouter
                                                // des Potions de mana ou autres
    private int gainPv;

    public PotionVie(int gainPv) throws Exception {
        super("Potion de vie", "Rend " + gainPv + " points de vie");
        setup(gainPv);
    }

    public PotionVie(int gainPv, int stack) throws Exception {
        super("Potion de vie", "Rend " + gainPv + " points de vie", stack);
        setup(gainPv);
    }

    private void setup(int gainPv) throws Exception {
        if (gainPv <= 0) {
            throw new Exception("Une potion de vie doit rendre des points de vie");
        }
        this.gainPv = gainPv;
    }

    public int use() throws Exception {
        gain(-1);
        verifStack(this);
        return gainPv;
    }
}
