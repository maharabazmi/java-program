public class CastingDemo {
    public static void main(String[] args) {
        // create and initialize two objects
        Object object1 = new CircleFromGeometricObject(1);
        Object object2 = new RactangleFromSimpleGeometricObject(1,1);

        // display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }
    // a method for displaying an object
    public static void displayObject(Object object){
        if(object instanceof CircleFromGeometricObject){
            System.out.println("The circle area is : "+((CircleFromGeometricObject)object).getArea());
            System.out.println("The circle diameter is : "+((CircleFromGeometricObject)object).getDiameter());
        }else if(object instanceof RactangleFromSimpleGeometricObject){
            System.out.println("The Rectangle area is : "+((RactangleFromSimpleGeometricObject)object).getArea());
        }
    }
}
/*
Casting can be done only when the source object is an instance of the target class.
Tip
To help understand casting, you may also consider the analogy of fruit, apple, and
orange, with the Fruit class as the superclass for Apple and Orange. An apple is
a fruit, so you can always safely assign an instance of Apple to a variable for Fruit.
However, a fruit is not necessarily an apple, so you have to use explicit casting to assign
an instance of Fruit to a variable of Apple.
 */