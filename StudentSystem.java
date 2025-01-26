import java.util.ArrayList;
import java.util.Collections;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Taiob",91,44));
        list.add(new Student("taw",95,50));
        list.add(new Student("tawhid",99,100));
        list.add(new Student("Jannat",88,02));

        System.out.println("\nsort by roll: ");
        Collections.sort(list);
        for (Student name: list){
            System.out.println(name.getRoll()+" -  "+
                    name.getScore()+" -  "+
                    name.getName()+"  ");
        }
        System.out.println("\nSort by student name: ");
        stuName stuName = new stuName();
        Collections.sort(list,stuName);
        for (Student student:list){
            System.out.println(student.getName()+" -  "+
                    student.getScore()+" -  "+
                    student.getRoll()+" ");
        }
        System.out.println("\nsort by scores:  ");
        stuScores stuScores=new stuScores();
        Collections.sort(list,stuScores);
        for (Student score:list){
            System.out.println(score.getScore()+" -  "+
                    score.getName()+" -  "+
                    score.getRoll()+" ");
        }
    }
}
