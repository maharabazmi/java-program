public class semp extends emp{
    private double weeklysalary;
    public semp(String firstname, String lastname, String socialsecurityNum, double weeklysalary){
        super(firstname,lastname,socialsecurityNum);
        if(weeklysalary<0.0)
            throw new IllegalArgumentException("weekly salary must be >=0.0");
        this.weeklysalary=weeklysalary;
    }
    public void setWeeklysalary(double weeklysalary){
        if(weeklysalary<0.0)
            throw new IllegalArgumentException("weekly salary must be >=0.0");
        this.weeklysalary=weeklysalary;
    }

    public double getWeeklysalary() {
        return weeklysalary;
    }

    @Override
    public double earnings() {
        return getWeeklysalary();
    }
    public String toString(){
        return String.format("Salarid employee: %s%n%s: $%,.2f",
                super.toString(),"weekly salary",getWeeklysalary());
    }
}
