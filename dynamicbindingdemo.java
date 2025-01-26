public class dynamicbindingdemo {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new person());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}
