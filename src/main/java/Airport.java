import java.util.ArrayList;

public class Airport {
    private String airportName ;
    private ArrayList<Flight> flights;

    public Airport(){

    }

    public void displayFlights(){
        for(Flight flight : flights){
            System.out.println("Destination: " + flight.getDestination() + " Flight Number: " + flight.getFlightId());
        }
    }
    public void bookPassenger(Passenger passenger, int  flightId){
        for ( Flight flight: flights){
            if( flight.getFlightId()== flightId){
                flight.addPassenger(passenger);
            }
        }
    }
    public void addFlight(Flight flight){
        flights.add(flight);
    }
    public void cancelFlight(int flightId){
        for(Flight flight :flights){
            if (flight.getFlightId() == flightId){
                flights.remove(flight);
            }
        }
    }

}
