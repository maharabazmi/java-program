public abstract class Employee implements Payable {
    private final String Firstname;
    private final String Lastname;
    private final String socialSecurityNumber;

    public Employee(String Firstname,String Lastname, String socialSecurityNumber){
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.socialSecurityNumber=socialSecurityNumber;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public String toString(){
        return String.format("%s %s%n security number: %s",getFirstname()
        ,getLastname(),getSocialSecurityNumber());
    }
}
