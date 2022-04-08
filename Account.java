public class Account {

    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }

    public String getCustomerName() {
        return getCustomerName() ;
    }

    public double deposit (double amount) {
        return balance + amount;
    }

    public double withdraw (double amount) {
        if (balance >= amount) {
            return balance - amount;
        } else
            System.out.println("Amount withdrawn exceeds the current balance!");

            return 0;

    }

}
