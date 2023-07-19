package OOPS.poly;


class AA{
    public AA() {
        System.out.println("Default Constructor A");
    }
}

class BB extends AA{
    public BB() {
        System.out.println("Default Constructor B");
    }
}
public class ConstructorOverriding {
    public static void main(String[] args) {
        new BB();
    }
}
