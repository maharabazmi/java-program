import java.util.Comparator;

public class DobComparator implements Comparator<person> {
    @Override
    public int compare(person o1, person o2) {
        // same logic
        return o2.dob - o1.dob;
    }
}
