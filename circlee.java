public class circlee extends GeometricObject{
    private double radius;
    public circlee(){
    }
    public circlee(double radius){
        this.radius=radius;
    }
    public circlee(double radius,String color,boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
