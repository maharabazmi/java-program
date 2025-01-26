import java.util.ArrayList;
import java.util.Scanner;
public class DistinctNumber {
    public static void main(String[] args) {
        ArrayList<Integer> listo = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0): ");
        int value;
        do{
            value = s.nextInt();
            if(!listo.contains(value)&& value!=0){
                listo.add(value);
            }
        }while(value !=0);
        for(int i=0; i<listo.size();i++){
            System.out.println(listo.get(i)+" ");
        }
    }
}
