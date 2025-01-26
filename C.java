public class C {
    public static void main(String[] args) {
        B b= new B();
    }
}
// it's very interesting in subclass B's no-args constructor
//invoked A's no-args constructors.
// that's why the main method in C show the output
// of A classes "A's no-args constructor in invoked"