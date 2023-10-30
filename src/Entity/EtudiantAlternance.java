package Entity;

import Entity.Etudiant;

public class EtudiantAlternance extends Etudiant {
    int salaire;

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public EtudiantAlternance(int salaire) {
        this.salaire = salaire;
    }

    public EtudiantAlternance(int id, String nom, String prenom, float moyenne, int salaire) {
        super(id, nom, prenom, moyenne);
        this.salaire = salaire;
    }

    @Override
    public void ajouterUneAbsence() {
        this.salaire=this.salaire-50;

    }

    @Override
    public String
    toString() {
        return "EtudiantAlternance{" +
                "salaire=" + salaire +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }
}
