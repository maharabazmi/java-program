public abstract class emp {
    private final String firstname;
    private final String lastname;
    private final String socialsecurityNum;

    public emp(String firstname,String lastname,String socialsecurityNum){
        this.firstname=firstname;
        this.lastname=lastname;
        this.socialsecurityNum=socialsecurityNum;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSocialsecurityNum() {
        return socialsecurityNum;
    }
    public String toString(){
        return String.format("%s %s%nsocial Security number: %s",getFirstname()
        ,getLastname(),getSocialsecurityNum());
    }
    public abstract double earnings();
}
