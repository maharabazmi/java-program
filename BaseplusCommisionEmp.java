public class BaseplusCommisionEmp extends comMISIONemp{
    private double basesalary;
    public BaseplusCommisionEmp(String firstName, String lastName,
String socialSecurityNumber, double grossSales,
 double commissionRate, double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        if (baseSalary < 0.0) // validate baseSalary
             throw new IllegalArgumentException("Base salary must be >= 0.0");
         this.basesalary = baseSalary;
    }

    public void setBasesalary(double basesalary) {
        if (basesalary < 0.0) // validate baseSalary
             throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.basesalary = basesalary;
    }

    public double getBasesalary() {
        return basesalary;
    }

    @Override
    public double earnings() {
        return getBasesalary()+super.earnings();
    }
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBasesalary());
    }
}
