public class Marks {
    public String id;
    public double quizMark;
    public double midMark;
    public double finalMark;

    public Marks(String id,double quizMark,double midMark,double finalMark){
        this.id=id;
        this.quizMark=quizMark;
        this.midMark=midMark;
        this.finalMark=finalMark;
    }
    public void passedOrNot(){
        double totalMarks = this.quizMark+this.midMark+this.finalMark;
        if(totalMarks>=55){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
    }
}
