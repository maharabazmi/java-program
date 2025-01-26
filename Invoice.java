public class Invoice implements Payable{
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double priceperItem;

    public Invoice(String partNumber, String partDescription, int quantity, double priceperItem){
        if(quantity <0)
            throw new IllegalArgumentException("Quantity must be >=0");
        if(priceperItem<0.0)
            throw new IllegalArgumentException("Price per item must be >=0.0");
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        this.quantity=quantity;
        this.priceperItem=priceperItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantity(int quantity) {
        if(quantity<0)
            throw new IllegalArgumentException("Quantity must be >=0");
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPriceperItem(double priceperItem) {
        if(priceperItem<0.0)
            throw new IllegalArgumentException("Price per item must be >=0.0");
        this.priceperItem = priceperItem;
    }

    public double getPriceperItem() {
        return priceperItem;
    }
    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%.2f,",
                "invoice","part number",
                getPartNumber(),getPartDescription(),
                "quantity",getQuantity(),"price per Item"
                ,getPriceperItem());
    }
    public double getpaymentamount(){
        return getQuantity()*getPriceperItem();
    }
}
