public class SalariedEmploye extends Employee{
    private double weeklySalary;

    public SalariedEmploye(String Firstname, String Lastname
            , String socialSecurityNumber, double weeklySalary){
        super(Firstname,Lastname,socialSecurityNumber);
        if(weeklySalary<0.0)
            throw new IllegalArgumentException("Weekly salary can not >=0.0");
        this.weeklySalary=weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary<0.0)
            throw new IllegalArgumentException("Weekly salary can not >=0.0");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double getpaymentamount() {
        return getWeeklySalary();
    }
    public double earninggs(){
        return getWeeklySalary();
    }
    public String toString()
 {
         return String.format("salaried employee: %s%n%s: $%,.2f",
                 super.toString(), "weekly salary", getWeeklySalary());
         }
}
