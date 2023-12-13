import java.util.Comparator;

public class EmployeComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe employe1, Employe employe2) {
        return Integer.compare(employe1.getIdentifiant(), employe2.getIdentifiant());
    }
}
