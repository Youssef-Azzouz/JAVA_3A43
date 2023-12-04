import java.util.HashSet;
import java.util.TreeSet;
class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departementsSet = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departementsSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : departementsSet) {
            if (departement.getNomDepartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departementsSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departementsSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement departement : departementsSet) {
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById(TreeSet<Departement> departements) {
        TreeSet<Departement> sortedDepartements = new TreeSet<>(departements);
        return sortedDepartements;
    }
}