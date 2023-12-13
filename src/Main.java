public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectationHashMap = new AffectationHashMap();

        // Création d'employés et départements
        Employe employe1 = new Employe(1, 5, "Doe", "John", "IT");
        Employe employe2 = new Employe(2, 3, "Smith", "Jane", "HR");

        Departement departement1 = new Departement(101, "IT", 50);
        Departement departement2 = new Departement(102, "HR", 30);

        // Ajout d'affectations
        affectationHashMap.ajouterEmployeDepartement(employe1, departement1);
        affectationHashMap.ajouterEmployeDepartement(employe2, departement2);

        // Affichage initial
        affectationHashMap.afficherEmployesEtDepartements();

        // Ajout du même employé à un autre département
        affectationHashMap.ajouterEmployeDepartement(employe1, departement2);

        // Affichage après modification
        affectationHashMap.afficherEmployesEtDepartements();
    }
}
