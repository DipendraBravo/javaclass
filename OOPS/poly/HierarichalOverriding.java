package OOPS.poly;

class NRB{
    public int rateOfInterest(){
        return 0;
    }
}
class Nabil extends NRB{
    public int rateOfInterest(){
        return 2;
    }
}

class Kumari extends NRB{

    public int rateOfInterest() {
        return 3;
    }
}
public class HierarichalOverriding {
    public static void main(String[] args) {
        NRB nabil = new Nabil();
        System.out.println(nabil.rateOfInterest());

        NRB kumari = new Kumari();
        System.out.println(kumari.rateOfInterest());
    }
}
