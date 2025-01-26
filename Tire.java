public class Tire implements Bounceable{
    public void bounce(){
        System.out.println("love");
    }

    @Override
    public void setBounce(int b) {
        int a =b;
        System.out.println(a);
        System.out.println("Fuck");
    }

    public static void main(String[] args) {
        Tire t = new Tire();
        t.bounce();;
        t.setBounce(5);
    }
}
