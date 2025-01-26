import java.util.Comparator;

public class RatingCompare implements Comparator<Cinema> {
    public int compare(Cinema c1,Cinema c2){
        if (c1.ratings> c2.ratings)
            return 1;
        if (c1.ratings < c2.ratings)
            return -1;
        else
            return 0;
    }
}
