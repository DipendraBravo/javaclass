package java8features;

@FunctionalInterface
interface Login{
    public abstract void login();
}
public class AnnonymousInnerClassPractice {
    public static void main(String[] args) {
        Login l = new Login() {
            @Override
            public void login() {
                System.out.println("Login() Method");
            }
        };
        l.login();
    }
}
