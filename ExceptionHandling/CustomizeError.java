package ExceptionHandling;

public class CustomizeError {
    public static void main(String[] args) throws Exception {
        userName("admin");
    }
    public static void userName(String name) throws Exception{
        if(name == "Admins"){
            System.out.println("Username is "+name);
        }else{
            throw new Exception("Username is not matched");
        }
    }
}
