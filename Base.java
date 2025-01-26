public class Base extends Circle{
    private double length;
    public Base(double length,double radius){
        super(radius);
        this.length=length;
    }
    public double getArea(){
        return getRadius()*length;
    }
}
