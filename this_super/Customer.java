package this_super;

public class Customer {
    //instance methods
    public void addCustomer(){
        this.deleteCustomer();
        System.out.println("Add Customer");
        this.updateCustomer();
    }
    public void deleteCustomer(){
        System.out.println("Delete Customer");
    }
    public void updateCustomer(){
        System.out.println("Update Customer");
    }
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.addCustomer();
    }
}
