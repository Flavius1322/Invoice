import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1,"Andrei",10);
        Customer customer2 = new Customer(2,"Mihai",20);

        Invoice invoice1 = new Invoice(1,50);
        Invoice invoice2 = new Invoice(2,100);

        Account account1 = new Account(1,100);
        Account account2 = new Account(2,300);


       System.out.println(invoice1.getAmountAfterDiscount(200));


        System.out.println(account1.withdraw(200));

    }
}
