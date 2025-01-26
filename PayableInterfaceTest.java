public class PayableInterfaceTest {
    public static void main(String[] args) {
       Payable[] payableobj = new Payable[4];
       payableobj[0] = new Invoice("01234","seat",2,375.00);
       payableobj[1] = new Invoice("56789","tire",4,79.95);
       payableobj[2]= new SalariedEmploye("john","wick","111-11-1111",800.00);
       payableobj[3] = new SalariedEmploye("nelson","moss","888-88-888",1200.00);

        System.out.println("Invoices and Employees processed polymorphically: ");
        for(Payable p:payableobj){
            System.out.printf("%n%s %n%s: $%,.2f",p.toString(),
                    "payment due: ",p.getpaymentamount());
        }
    }
}
//A Class Can Extend Only One Other Class But Can Implement Many Interfaces.