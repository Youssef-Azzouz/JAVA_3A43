import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class AffectationHashMap {
    private Map<Employe, Departement> affectations = new HashMap<>();

    // Méthode pour ajouter une affectation
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        // Vérifier si l'employé est déjà affecté à un département
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
            System.out.println("Affectation ajoutée : " + e + " -> " + d);
        } else {
            System.out.println("L'employé est déjà affecté à un département.");
        }
    }
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        // Vérifier si l'affectation existe
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("Affectation supprimée pour : " + e + " dans le département : " + d);
        } else {
            System.out.println("Affectation non trouvée pour cet employé dans ce département.");
        }
    }
    // Méthode pour rechercher le département d'un employé
    public Departement rechercherDepartementParEmploye(Employe employe) {
        return affectations.get(employe);
    }

    // Méthode pour supprimer une affectation
    public void supprimerEmploye (Employe e) {
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("Affectation supprimée pour : " + e);
        } else {
            System.out.println("Affectation non trouvée pour cet employé.");
        }
    }

    // Méthode pour afficher toutes les affectations
    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des affectations :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe employe : affectations.keySet()) {
            System.out.println(employe);
        }
    }
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement departement : affectations.values()) {
            System.out.println(departement);
        }
    }
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(new EmployeComparator());
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}
