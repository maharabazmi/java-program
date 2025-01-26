public class Tiger extends Animal implements Cat,Bard{
    @Override
    public void fly() {
        System.out.println("Tiger can not fly");
    }

    @Override
    public void jump() {
        System.out.println("Tiger can jump");
    }

    @Override
    public void run() {
        System.out.println("Tiger can run");
    }

    @Override
    public void name() {
        System.out.println("Tiger shipon");
    }

    @Override
    public void eat() {
        System.out.println("Hunter ");
    }

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.fly();
        t.jump();
        t.name();
        t.run();
        t.type();
        t.eat();
    }
}
