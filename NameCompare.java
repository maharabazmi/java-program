import java.util.Comparator;

public class NameCompare implements Comparator<Cinema> {
    public int compare(Cinema c1,Cinema c2){
        return c2.name.compareTo(c1.name);
    }
}
