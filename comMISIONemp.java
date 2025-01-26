public class comMISIONemp extends emp{
    private double grosssales;
    private double commisionsales;

    public comMISIONemp(String firstname,String lastname,String socialsecurityNum,
                        double grosssales,double commisionsales){
        super(firstname,lastname,socialsecurityNum);
        if(commisionsales<=0.0||commisionsales>=1.0)
            throw new IllegalArgumentException("Commision rate must be > 0.0 and <1.0");
        if(grosssales<0.0)
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        this.grosssales=grosssales;
        this.commisionsales=commisionsales;
    }
    public void setGrosssales(double grosssales){
        if (grosssales < 0.0) // validate
             throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grosssales=grosssales;
    }

    public double getGrosssales() {
        return grosssales;
    }

    public void setCommisionsales(double commisionsales) {
        if(commisionsales<=0.0||commisionsales>=1.0)
            throw new IllegalArgumentException("Commision rate must be > 0.0 and <1.0");
        this.commisionsales = commisionsales;
    }

    public double getCommisionsales() {
        return commisionsales;
    }

    @Override
    public double earnings() {
        return getCommisionsales()*getGrosssales();
    }
    public String toSring(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrosssales(),
                "commission rate", getCommisionsales());
    }
}
