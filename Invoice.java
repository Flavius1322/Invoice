public class Invoice   {

    private  int id;
    Customer customer;
    private double amount;

    public Invoice(int id, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getConstomerName(String name) {
        return name;
    }

    public double getAmountAfterDiscount(double discount) {
        return amount - discount/100 * discount ;
    }
}
