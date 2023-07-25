package this_super;

class ParentThree{
    public ParentThree() {
        System.out.println("Default Constructor parent Three");
    }
}

public class ChildThree extends ParentThree {
    public ChildThree() {
        this(10,20);
        System.out.println("Default Cons ChildThree");
    }
    public ChildThree(int a, int b){
        super();
        System.out.println("Para Child Three "+ a +" "+b);
    }

    public static void main(String[] args) {
        new ChildThree();
    }
}
