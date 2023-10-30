package Entity;

import java.util.Arrays;

public class Ecole {
    String nom;
    int nbrEtudiants;
    public static final int nb_etudiant = 500;
    private Etudiant[] etudiants;

    public Ecole() {
    }

    public Ecole(String nom) {

        etudiants = new Etudiant[nb_etudiant];
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public boolean ajouterEtudiant(Etudiant etudiant) throws Etudiant.EtudiantExisteException {
        if (rechercherEtudiant(etudiant) != -1) {
            throw new Etudiant.EtudiantExisteException("L'étudiant existe déjà dans cette école.");
        }

        etudiants[nbrEtudiants] = etudiant;
        nbrEtudiants++;
        return true;
    }


    public int rechercherEtudiant(Etudiant e) {
        int index = -1;
        for (int i = 0; i < nbrEtudiants; i++) {
            if (e.getId() == etudiants[i].getId())
                return i;
        }
        return index;
    }

    public float getMoyenneDes3A() {
        float totalMoyenne = 0;
        int count = 0;

        for (int i = 0; i < nbrEtudiants; i++) {
            if (etudiants[i] instanceof Etudiant3eme) {
                totalMoyenne += etudiants[i].getMoyenne();
                count++;
            }
        }

        if (count > 0) {
            return totalMoyenne / count;
        } else {
            return 0;
        }
    }
    public float moyenneSalaireAlternants(){
        float totalSalaire = 0;
        int count = 0;

        for (int i = 0; i < nbrEtudiants; i++) {
            if (etudiants[i] instanceof EtudiantAlternance) {
                totalSalaire += ((EtudiantAlternance) etudiants[i]).getSalaire();
                count++;
            }
        }

        if (count > 0) {
            return totalSalaire / count;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Ecole{" +
                "nom='" + nom + '\'' +
                ", nbrEtudiants=" + nbrEtudiants +
                ", etudiants=" + Arrays.toString(etudiants) +
                '}';
    }


    public void changerEcole(Etudiant etd, Ecole e) throws Etudiant.EtudiantExisteException {
        int index = rechercherEtudiant(etd);

        if (index != -1) {
            for (int i = index; i < nbrEtudiants - 1; i++) {
                etudiants[i] = etudiants[i + 1];
            }
            etudiants[nbrEtudiants - 1] = null;
            nbrEtudiants--;

            try {
                e.ajouterEtudiant(etd);
                System.out.println(etd.getNom() + " a été transféré à l'école " + e.getNom());
            } catch (Etudiant.EtudiantExisteException ex) {
                System.out.println("Erreur d'ajout " + etd.getNom() + " vers " + e.getNom() + ". École est remplie.");
                
            }
        } else {
            System.out.println(etd.getNom() + " n'est pas un élève de cette école");
        }
    }


}