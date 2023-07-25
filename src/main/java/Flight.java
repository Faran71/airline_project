import java.util.ArrayList;

public class Flight extends Airport{

    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengerList;

    public Flight(String destination, int flightId){
        this.destination = destination;
        this.flightId = flightId;
        passengerList = new ArrayList<Passenger>();
    }

    public void addPassenger(Passenger nameOfPassenger){
        passengerList.add(nameOfPassenger);
    }

    public void removePassenger(Passenger nameOfPassenger){
        passengerList.remove(nameOfPassenger);
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return this.flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
}
