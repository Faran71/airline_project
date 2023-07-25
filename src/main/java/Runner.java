import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Airport airport = new Airport("Luton");

        airport.addFlight(new Flight("Paris", 123,new Plane(3344,10000,180,Model.Boeing747)));
        airport.addFlight(new Flight("Berlin", 456, new Plane(9909,8000,220,Model.AirbusA380)));

        airport.displayFlights();

        airport.bookPassenger(new Passenger(12345678,"Faran","email@bnta.com"),123);
        airport.bookPassenger(new Passenger(98765432, "Charlotte","neweremail@bnta"),456);

        System.out.println(airport.displayPassengers(123));

//        airport.cancelFlight(123);
//        airport.displayFlights();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to go for your holiday? ");
        String destination = scanner.nextLine();
        airport.getFlightTo(destination);


    }


}
