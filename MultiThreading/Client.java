package MultiThreading;

class SeatsAvailable{
    int seats = 3;
    public synchronized void bookMovieTicket(String uname, int totalSeats) throws InterruptedException {
        if(seats>=totalSeats && totalSeats>0){
            System.out.println("Hello "+uname+" You have booked "+totalSeats+" Tickets");
            seats=seats-totalSeats;
            System.out.println("Ticket left:"+seats);
            Thread.sleep(3000);
        }
        else {
            System.out.println("Hello "+uname+" Seats Not Available");
        }

    }

}
class Ticket extends Thread{
    SeatsAvailable seatsAvailable;
    String userName;
    int noOfSeats;
    public Ticket(String userName, int noOfSeats, SeatsAvailable seatsAvailable){
        this.userName =userName;
        this.noOfSeats =noOfSeats;
        this.seatsAvailable =seatsAvailable;
    }
    @Override
    public void run(){
        try{
        seatsAvailable.bookMovieTicket(userName,noOfSeats);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }


}
public class Client {
    public static void main(String[] args) {
        SeatsAvailable available = new SeatsAvailable();
        Ticket t = new Ticket("dipendra",2,available);
        Ticket t2 = new Ticket("dipendra",1,available);
        Ticket t3 = new Ticket("dipendra",1,available);
        t.start();
        t2.start();
        t3.start();
    }
}
