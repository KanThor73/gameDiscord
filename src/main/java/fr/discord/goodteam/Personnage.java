package fr.discord.goodteam;

import fr.discord.goodteam.Arme;

public class Personnage {
    public String nom;
    private int pv;
    private int pvMax;
    private Arme arme;

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
        if(estVivant()) {
            System.out.println(nom + " attaque " + cible.getNom());
            cible.updatePV(cible.getDegats());
        }
        else {
            System.out.println(nom + " est à terre et refuse de combattre");
        }
    }

    // Attribuer une arme a un personnage
    public void equiper(Arme arme) {
        this.arme = arme;
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
        }
        else {
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
        if (pv > pvMax/4) {
            System.out.println(nom + " n'a plus que " + pv + " PV.");
        } else if (pv <= pvMax/4 && pv > 0) {
            System.out.println(nom + " n'a plus que " + pv + " PV... il commence a trembler des genoux");
        } else if (pv <= 0) {
            System.out.println(nom + " n'a plus de genous pour trembler, RIP " + nom);
        }
    }

    // affiche les objets portés par le joueur
    public void afficherInventaire() {
        System.out.println("Inventaire de " + nom + " :");

        if (arme != null) {
            arme.afficherStatut();
        }
    }
}
