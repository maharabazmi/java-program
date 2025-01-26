public class Course {
    private String courseName;
    private String[] students = new String[10];
    private String[] Students = new String[10];
    private int nnumOfstudents;

    public Course(String courseName){
        this.courseName=courseName;
    }
    public void addStudent(String student){
        students[nnumOfstudents]= student;
        nnumOfstudents++;
    }
    public void adddStudent(String studennt){
        Students[nnumOfstudents]= studennt;
        nnumOfstudents++;
    }
    public  String[] getStudents(){
        return students;
    }
    public String[] getstudents(){
        return Students;
    }

    public int getNnumOfstudents() {
        return nnumOfstudents;
    }

    public String getCourseName() {
        return courseName;
    }
}
