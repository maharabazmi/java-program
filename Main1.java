import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
Elements in an ArrayList are actually objects.
In the examples above, we created elements (objects)
 of type "String". Remember that a String in Java is an
 object (not a primitive type). To use other types, such
 as int, you must specify an equivalent wrapper class:
  Integer. For other primitive types, use:
  Boolean for boolean,
Character for char, Double for double, etc:
 */
/*
Another useful class in the java.util package
is the Collections class, which include the sort()
dcmethod for sorting lists alphabetically or numerically:
 */
public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(100);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        Collections.sort(myNumbers);
        for(int i :myNumbers){
            System.out.println(i);
        }
    }
}
