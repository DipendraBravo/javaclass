package MultiThreading;

import java.nio.file.attribute.AttributeView;

class AvailableSeats{
    int seats=3;
    public synchronized void bookTicket(String userName, int totalSeat) throws InterruptedException {
        if(seats>= totalSeat && totalSeat>0){
            System.out.println("Hello "+userName+" you have booked "+totalSeat+" ticket successfully");
            seats=seats-totalSeat;
            System.out.println("Remaining seat are "+seats);
            Thread.sleep(3000);
            notify();
        }else{
            System.out.println("Hello "+userName+" no more availability of tickets");
        }

    }
}
class Tickets extends Thread{
    AvailableSeats availableSeats;
    String userName;
    int totalSeat;
    public Tickets (AvailableSeats availableSeats, String userName, int totalSeat){
        this.availableSeats=availableSeats;
        this.userName=userName;
        this.totalSeat=totalSeat;
    }

    @Override
    public void run(){

        try {
            availableSeats.bookTicket(userName,totalSeat);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class CaseStudyTicketSystem {
    public static void main(String[] args) throws InterruptedException {
        AvailableSeats availableSeats = new AvailableSeats();
        Tickets t = new Tickets(availableSeats,"dipendra",2);
        Tickets t2 = new Tickets(availableSeats,"nobel",2);
        t.start();
        t2.start();
        t.join();
        t2.join();
    }
}
