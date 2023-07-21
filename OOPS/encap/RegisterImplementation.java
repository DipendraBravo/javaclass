package OOPS.encap;

public class RegisterImplementation extends Register {
    public static void main(String[] args) {
        //Encap: Wrapping the data and their methods into a single unit
        RegisterImplementation registerImplementation = new RegisterImplementation();
        registerImplementation.setFname("Dipendra");
        registerImplementation.setLname("Tamang");
        registerImplementation.setGender('M');
        registerImplementation.setAge(25);

        System.out.println(registerImplementation.getFname());
        System.out.println(registerImplementation.getLname());
        System.out.println(registerImplementation.getGender());
        System.out.println(registerImplementation.getAge());

    }
}
