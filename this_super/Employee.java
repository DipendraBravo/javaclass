package this_super;

public class Employee {

    //this() refers to the current class constructor

    public Employee() {
        this("dipendra",98l);
        System.out.println("Default Constructor");
    }

    public Employee(String empName, long empContact) {
        System.out.println(empName);
        System.out.println(empContact);
    }


    public static void main(String[] args) {
        new Employee();
    }
}
