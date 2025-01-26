public class Student implements Comparable<Student>{
    private String name;
    private double Score;
    private int roll;
    public Student(String name,double Score,int roll){
        this.name=name;
        this.Score=Score;
        this.roll=roll;
    }
    public int compareTo(Student s){
     return this.getRoll()-s.getRoll();
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return Score;
    }

    public int getRoll() {
        return roll;
    }
}
