import java.util.ArrayList;

public class cfc {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Geeks");
        al.add("for");
        al.add(0,"geeks");

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i)+" ");
        }
        System.out.println();
        for(String str:al){
            System.out.println(str+" ");
        }
    }
}
