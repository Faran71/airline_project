import java.util.ArrayList;

public class Airport {
    private String airportName;
    private ArrayList<Flight> flights;

    public Airport(String airportName) {
        this.airportName = airportName;
        flights = new ArrayList<Flight>();

    }

    public void displayFlights() {
        for (Flight flight : flights) {
            System.out.println("Destination: " + flight.getDestination() + "         Flight Number: " + flight.getFlightId());
        }
    }

    public void bookPassenger(Passenger passenger, int flightId) {
        for (Flight flight : flights) {
            if (flight.getFlightId() == flightId) {
                flight.addPassenger(passenger);
            }
        }
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void cancelFlight(int flightId) {
        for (Flight flight : flights) {
            if (flight.getFlightId() == flightId) {
                flights.remove(flight);
            }
        }
    }

    public int displayPassengers(int flightId) throws Exception{
        for (Flight flight : flights) {
            if (flight.getFlightId() == flightId) {
                return flight.getNumberOfPassengers();
            }

        }
        throw new Exception("Flight ID is invalid, please retry.");
    }

    public ArrayList<Integer> getFlightTo(String destinationOfArrival) throws Exception{
        ArrayList<Integer> flightNumbers= new ArrayList<>();
        boolean condition = false;
        for (Flight flight : flights){
            if (flight.getDestination().equals(destinationOfArrival)){
//                System.out.println("Flight Id: "+flight.getFlightId());
                flightNumbers.add(flight.getFlightId());
                condition= true;
            }
        }
        if (condition==true){
            return flightNumbers;}
        else{throw new Exception("No flights to this destination. Please enter a different destination.");}
    }


}
