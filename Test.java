class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}

public class Test {
    public static void main(String[] args) {
        // Create a heterogeneous array of Shape objects
        Shape[] s = new Shape[3];

        // Initialize the array with different shapes
        s[0] = new Rectangle();
        s[1] = new Circle();
        s[2] = new Triangle();

        // Iterate through the array and call the draw() method on each object
        for (Shape i:s) {
            i.draw();  // Polymorphism: draw() is called based on the object's actual class
        }
    }
}
