package GarbageCollection;

public class TestGarbage {
    public void finalize(){
        System.out.println("Object is cursed");
    }

    public static void main(String[] args) {
        TestGarbage obj = new TestGarbage();
        obj = null;
        System.gc();
    }
}
