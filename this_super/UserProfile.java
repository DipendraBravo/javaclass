package this_super;

public class UserProfile {
    public String userName;
    public String email;
    public long contact;
    public String address;

    //this keyword will refer to the current class instance variables
    public UserProfile(String userName, String email, long contact, String address) {
        this.userName = userName;
        this.email = email;
        this.contact = contact;
        this.address = address;
    }
/*
    //properties are diff
    public UserProfile(String uName, String mail, long con, String add) {
        userName = uName;
        email = mail;
        contact = con;
        address = add;
    }
*/
    //instance method display()
    public void display(){
        System.out.println(userName);
        System.out.println(email);
        System.out.println(contact);
        System.out.println(address);
    }

    public static void main(String[] args) {
       UserProfile obj = new UserProfile("dipendra","dipendra.tamang9@gmail.com",98L,"Laxmipur");
        obj.display();
    }


}
