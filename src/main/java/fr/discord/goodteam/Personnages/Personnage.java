package fr.discord.goodteam.Personnages;

import fr.discord.goodteam.Armes.Arme;
import fr.discord.goodteam.Inventaire.PotionVie;

public class Personnage {
    public String nom;
    private int pv;
    private int pvMax;
    private Arme arme;
    private String alter;

    public Personnage(String nom, int pv) {
        setup(nom, pv);
        arme = new Arme();
    }

    public Personnage(String nom, int pv, Arme arme) {
        setup(nom, pv);
        this.arme = arme;
    }

    private void setup(String nom, int pv) {
        this.nom = nom;
        this.pv = pv;
        pvMax = pv;
    }

    // inflige des degats a un autre perso
    public void attaque(Personnage cible) {
        if (estVivant()) {
            System.out.println(nom + " attaque " + cible.getNom());
            cible.updatePV(getDegats());
        } else {
            System.out.println(nom + " est à terre et refuse de combattre");
        }
    }

    // Attribuer une arme a un personnage
    public void equiper(Arme arme) {
        this.arme = arme;
    }

    // Boire une potion de vie
    public void boire(PotionVie pot) throws Exception {
        if (estVivant()) {
            System.out.println(nom + " boit une potion de vie");
            updatePV(-pot.use());
        } else {
            System.out.println(nom + " est à terre et refuse de boire");
        }
    }

    // Recupere le nom du perso
    public String getNom() {
        return nom;
    }

    // Indique si le perso est vivant
    public boolean estVivant() {
        return (pv > 0);
    }

    // Indique si le perso a tous ses pv
    public boolean estFullVie() {
        return (pv == pvMax);
    }

    // Retourne les degats occasionnés par l'arme du joueur
    public int getDegats() {
        if (arme != null) {
            return arme.getDegats();
        } else {
            return 1;
        }
    }

    // Attribution des degats
    private void updatePV(int degats) {
        this.pv = pv - degats;
        if (pv < 0) {
            pv = 0;
        }
        if (pv > pvMax) {
            pv = pvMax;
        }
    }

    // Affiche les stats du perso
    public void afficherStatut() {
        System.out.print(nom + " a " + pv + "/" + pvMax + " PV");
        if (pv > pvMax / 4) {
            System.out.println("");
        } else if (pv <= pvMax / 4 && pv > 0) {
            System.out.println("... il commence a trembler des genoux");
        } else if (pv <= 0) {
            System.out.println("\nIl n'a plus de genoux pour trembler, RIP " + nom);
        }
    }

    // affiche les objets portés par le joueur
    public void afficherInventaire() {
        System.out.println("Inventaire de " + nom + " :");

        if (arme != null) {
            arme.afficherStatut();
        }
    }

    // Ajoute un effet d'alteration
    public void putAlter(Personnage cyble){
        if (alter != null) {
            
        }
    }
}
