public class payrollsystemTest {
    public static void main(String[] args) {
        semp s = new semp("john","smith","111-11-111",800.00);
        hourlyemp h = new hourlyemp("nella","joshwa","222-22-222",16.75,40);
        comMISIONemp c = new comMISIONemp("ted","mosby","333-33-333",10000,.06);
        BaseplusCommisionEmp b = new BaseplusCommisionEmp("clay","jensen","444-44-444",5000,.04,300);
        System.out.println("Employees processed individually:");


         System.out.printf("%n%s%n%s: $%,.2f%n%n",
                 s, "earned", s.earnings());
         System.out.printf("%s%n%s: $%,.2f%n%n",
                 h, "earned", h.earnings());
         System.out.printf("%s%n%s: $%,.2f%n%n",
                 c, "earned", c.earnings());
         System.out.printf("%s%n%s: $%,.2f%n%n",
                 b,
                 "earned", b.earnings());
         emp[] e = new emp[4];
         e[0] =  s;
         e[1] = h;
         e[2] = c;
         e[3] = b;
        System.out.printf("Employees processed polymorphically:%n%n");
        for(emp currentemploye : e){
            System.out.println(currentemploye);
            if(currentemploye instanceof BaseplusCommisionEmp){
                BaseplusCommisionEmp empp = (BaseplusCommisionEmp) currentemploye;
                empp.setBasesalary(1.10*empp.getBasesalary());

                System.out.printf("new base salary with 10% increase is : $%,.2f",empp.getBasesalary());

            }
            System.out.printf("Earned $%,.2f",currentemploye.earnings());

        }
        for (int j = 0; j < e.length; j++)
            System.out.printf("Employee %d is a %s%n", j,
                    e[j].getClass().getName());
    }

}
