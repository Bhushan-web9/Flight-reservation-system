package flight.system;

public class Main {
    public static void main(String[] args) {

        // creating object passenger1 of Passenger class
        Passenger passenger1= new Passenger("Swami Vivekanand Road", "Mumbai","Maharashtra",
                "Ramesh", "8784561232","ramesh@gmail.com");

        //creating object flight1 of Flight class
        Flight flight1=new Flight(90903,"Air India", 100);

        //creating object passenger2 of passenger calss
        Passenger passenger2= new Passenger("Mohammad ali road","Mumbai","Maharashtra",
                "Suresh","7987456165","suresh@gmail.com");

        //creating object flight2 of passenger class
        Flight flight2=new Flight(80803,"Air India",150);

        //creating object of RegularTicket using polymorphism
        Ticket ticket1= new RegularTicket("Mumbai","Goa","03:03:2021 12:00:00",
                "03:03:2021 01:15:00",3500,true,false,true, flight1,passenger1);

        //creating object of TouristTicket class using polymorphism
        Ticket ticket2= new TouristTicket("Mumbai","Bangalore",
                "03:03:2021 04:30:00","03:03:2021 06:15:00",4000,
                "Vivanta Bengaluru, Residency", new String[]{"a", "b", "c", "d", "e"},flight2,passenger2);

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);

    }
    //function to print Ticket details
    public  static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.statusOfTicket());
    }
}

