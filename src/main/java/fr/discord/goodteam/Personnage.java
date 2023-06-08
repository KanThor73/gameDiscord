package fr.discord.goodteam;

public class Personnage {
    private Arme armeEquipe = new Arme();
    public String nom;
    private int pv;
    private int atk; // private int atk = armeEquipe.getDegats; ==> quand les armes seront stockees
    private boolean isFirst = (pv == 500); // avantage si pv min ==> attaque en premier
    private boolean statut = true;

    public Personnage(String nom, int pv, int atk) {
        this.nom = nom;
        this.setAtk(atk);
        this.setPv(pv);
    }

    private void setPv(int pv) {
        if (this.pv >= 500 || this.pv <= 800)
            this.pv = pv;
        else {
            System.out.println("Valeurs des PV incorrect, a set entre 500 et 800.");
        }
    }

    private void setAtk(int atk) {
        if (this.atk >= 500 || this.atk <= 800) {
            this.atk = atk;
        } else {
            System.out.println("Valeurs de l'attaque incorrect, a set entre 80 et 120.");
        }
    }

    // Affiche les stats du perso
    public void afficherStatut() {
        if (pv > 200) {
            System.out.println(nom + " n'a plus que " + pv + " PV.");
            System.out.println("Attaque : " + atk);
        } else if (pv <= 100 && pv > 0) {
            System.out.println(nom + " n'a plus que " + pv + " PV... il commence a trembler des genoux");
            System.out.println("Attaque : " + atk);
        } else if (pv < 0) {
            System.out.println(nom + " n'a plus de genous pour trembler, RIP " + nom);
        }
    }

    // inflige des degats a un autre perso
    public void attaque(Personnage cible) {
        cible.updatePV(cible.armeEquipe.getDegats());
    }

    // Attribution des degats

    public void updatePV(int degats) {
        this.pv = pv - degats;
        if (pv <= 0) {
            statut = false;
        }
    }

    // Recupere le nom du perso
    public String getNom() {
        return nom;
    }

    // Indique si le perso est vivant
    public boolean estVivant() {
        return statut;
    }

    public int getDegatArme() {
        return armeEquipe.getDegats();
    }

}
