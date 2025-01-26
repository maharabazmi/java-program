import java.util.ArrayList;
import java.util.Collections;

public class movieMain {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens",8.3,2015));
        list.add(new Movie("Star wars",9.0,1977));
        list.add(new Movie("Star wars",8.8,1945));
        list.add(new Movie("Return of the Jedi",8.4,1983));

        Collections.sort(list);
        for(Movie movie:list){
            System.out.println(movie.getName()+" "+
                    movie.getRatings()+" "+
                    movie.getYear());
        }
    }
}
