public class Cinema implements Comparable<Cinema>{
    double ratings;
   String name;
   int year;
    public int compareTo(Cinema c){
        return c.year-this.year;
    }
    public Cinema(String name,double ratings,int year){
        this.name=name;
        this.ratings=ratings;
        this.year=year;
    }
}
