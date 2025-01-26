public class DeclareException {
    public void methodA(){
        try {
        }catch(Exception e){
                System.out.println("If error in try then catch exe");
            }finally {
            System.out.println("Finally must exe");
        }
    }
    public void methodB() throws SecurityException{

    }
    public void methodC() throws SecurityException,Exception{

    }
}
