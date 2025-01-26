public abstract class Vehicle {
    public String model = "E class";
    public String year = "2008";
    public abstract void goFast();

    public void show(){
        System.out.println("Model: "+model+"Year: "+year);
    }
}
