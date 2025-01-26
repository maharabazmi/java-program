import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        //The ArrayList class has many useful methods.
        // For example, to add elements to the list,
        // use the add() method:
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volkswagen");
        //You can also add an item at a specified
        // position by referring to the index number:
        cars.add(0,"audi");
        cars.get(3);//To access an element in the ArrayList,
        // use the get() method and refer to the index number:
        cars.set(0,"Opel");//To modify an element,
        // use the set() method and refer to the index number:
        cars.remove(2);//To remove an element,
        // use the remove() method and refer to the index number:
        //cars.clear();//To remove all the elements in the ArrayList,
        // use the clear() method:
        //To find out how many elements an ArrayList have,
        // use the size method:
        cars.size();//To find out how many elements an ArrayList have,
        // use the size method:
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }//Loop through the elements of an
        // ArrayList with a for loop, and use the size()
        // method to specify how many times the loop should run:
        for(String i:cars){
            System.out.println(i);
        }//You can also loop through an
        // ArrayList with the for-each loop:
        Collections.sort(cars);
        for (String u :cars){
            System.out.println(u);
        }
        /*
        Another useful class in the java.util package
         is the Collections class, which include the sort()
        method for sorting lists alphabetically or numerically:
         */
        System.out.println(cars);
    }
}
