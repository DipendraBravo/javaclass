package OOPS.has.a.relationship;

class Company{
    String companyName;
    String companyAddress;

    public Company(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }
}


public class Employee {

    int empId;
    String empUserName;
    String empEmail;
    Company company;

    public Employee(int empId, String empUserName, String empEmail, Company company) {
        super();
        this.empId = empId;
        this.empUserName = empUserName;
        this.empEmail = empEmail;
        this.company = company;
    }

    public  void display(){
        System.out.println(empId);
        System.out.println(empUserName);
        System.out.println(empEmail);
        System.out.println(company.companyName);
        System.out.println(company.companyAddress);
    }

    public static void main(String[] args) {
        Company com = new Company("singer company","jhapa");
        Employee employee = new Employee(12,"Dipendra", "dipendra.tamang9@gmail.com",com);
        employee.display();

    }
}
