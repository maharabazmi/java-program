public class Car extends Vehicle{
    public void goFast(){
        System.out.println("Car can go First");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.show();
        c.goFast();
    }
}
