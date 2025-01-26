public class Movie implements Comparable<Movie>{
    private double ratings;
    private String name;
    private int year;

    public Movie(String name,double ratings,int year){
        this.name=name;
        this.ratings=ratings;
        this.year=year;
    }
    public int compareTo(Movie m){
        int nameComparison = this.name.compareTo(m.name);
        if(nameComparison==0) {
            return m.year - this.year;
        }
        return nameComparison;
    }
    public String getName() {
        return name;
    }

    public double getRatings() {
        return ratings;
    }

    public int getYear() {
        return year;
    }
}
