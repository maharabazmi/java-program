import java.util.ArrayList;
import java.util.Collections;

public class BlockBuster {
    public static void main(String[] args) {
        ArrayList<Cinema> list = new ArrayList<>();
        list.add(new Cinema("Sweet November",9.1,1999));
        list.add(new Cinema("The Lake House",8.8,2001));
        list.add(new Cinema("Destination Weeding",7.8,2014));
        list.add(new Cinema("La La Land",9.8,2015));
        System.out.println("Sorted BY decending order: ");
        System.out.println("Sorted by ratings: ");
        //RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list,new RatingCompare());
        for(Cinema cinema:list){
            System.out.println(cinema.ratings+" "
            +cinema.name+" "+
                    cinema.year+" ");
        }
        System.out.println("\nSorted By name: ");
        //NameCompare nameCompare = new NameCompare();
        Collections.sort(list,new RatingCompare());
        for(Cinema cinema:list){
            System.out.println(cinema.name+" "+
                    cinema.ratings+" "+
                    cinema.year+" ");
        }
        System.out.println("\nSorted By year: ");
        Collections.sort(list);
        for(Cinema cinema:list){
            System.out.println(cinema.year+" "+
                    cinema.ratings+" "+
                    cinema.name+" ");
        }
    }
}
