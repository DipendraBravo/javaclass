package OOPS.Abstraction;

abstract class  Product{
    static int productPrice;
    static int discount;
    public void getDiscount(int offer){
        discount = productPrice - offer;
        System.out.println("After discount price is "+ discount);
    }
    public void getUserDetails(String fname, String lname, String productName){
        System.out.println("User FirstName: "+ fname);
        System.out.println("User LastName: "+ lname);
        System.out.println("User ProductName: "+ productName);
    }
}
class ProductImpl extends Product{

}
public class AbstractionImplementation {
    public static void main(String[] args) {
        ProductImpl obj = new ProductImpl();
        obj.getUserDetails("Dipendra","Tamang","Apple");
        ProductImpl.productPrice=12000; //assign value on static vairable in abstract class
        obj.getDiscount(2000);
    }
}
