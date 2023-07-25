import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;

public class Flight extends Plane{

    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengerList;
    private LocalTime departureTime;

    public Flight(String destination, int flightId, Plane plane, LocalTime departureTime){
        super(plane.getPlaneId(), plane.getRange(), plane.getCapacity(), plane.getModel());
        this.destination = destination;
        this.flightId = flightId;
        passengerList = new ArrayList<Passenger>();
        this.departureTime = departureTime;
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

    public int getNumberOfPassengers(){
        return passengerList.size();
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
}
