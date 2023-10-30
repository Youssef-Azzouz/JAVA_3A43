package Entity;

import java.util.Objects;

public abstract class Etudiant {
    int id;
    String nom;
    String prenom;
    float moyenne;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom, float moyenne) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return id == etudiant.id && Objects.equals(nom, etudiant.nom);
    }

    @Override
    public String toString() {
        return "Entity.Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }

    public abstract void ajouterUneAbsence();


    public static class EtudiantExisteException extends Exception {

        public EtudiantExisteException() {
        }

        public EtudiantExisteException(String message) {
            super(message);
        }


    }
}
