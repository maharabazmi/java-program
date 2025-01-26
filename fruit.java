public class fruit {
    public fruit(String name){
        System.out.println("Fruit's constructor is invoked");
    }
/*Since no constructor is explicitly defined in Apple, Apple’s default no-arg constructor
is defined implicitly. Since Apple is a subclass of Fruit, Apple’s default constructor
automatically invokes Fruit’s no-arg constructor. However, Fruit does not have a
no-arg constructor, because Fruit has an explicit constructor defined. Therefore, the
program cannot be compiled.
    */
    public fruit() {
    }
}
