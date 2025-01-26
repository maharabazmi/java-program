import java.util.ArrayList;
import java.math.*;
public class largestNumber {
    public static void main(String[] args) {
    ArrayList<Number> list = new ArrayList<>();
    list.add(45);
    list.add(3445.53);
    list.add(new BigInteger("5738957395738957893753"));
    list.add(new BigDecimal("2.5468465465465465465"));
        System.out.println("The largerst number is: "+getLargestNumber(list));
    }
    public static Number getLargestNumber(ArrayList<Number> list){
        if(list == null || list.size()==0)
         return null;

        Number number =list.get(0);
        for(int i=1;i<list.size();i++){
            if(number.doubleValue()<list.get(i).doubleValue()){
                number = list.get(i);
            }
        }
        return number;
    }
}
