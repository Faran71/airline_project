import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Airport airport = new Airport("Luton");

        airport.addFlight(new Flight("Paris", 123,new Plane(3344,10000,4,Model.Boeing747)));
        airport.addFlight(new Flight("Paris", 237,new Plane(33445,15000,7,Model.Boeing777)));
        airport.addFlight(new Flight("Berlin", 456, new Plane(9909,8000,3,Model.AirbusA380)));

        airport.displayFlights();

        airport.bookPassenger(new Passenger(12345678,"Faran","email@bnta.com"),123);
        airport.bookPassenger(new Passenger(98765432, "Charlotte","neweremail@bnta"),456);
        boolean condition=false;
        while(condition == false){
            System.out.println("Enter flight id to get passenger details");
            Scanner scanner = new Scanner(System.in);
            int id = scanner.nextInt();
            try{
                System.out.println("Number of passengers on flight "+ id +" is " + airport.displayPassengers(id));
                condition=true;
            }catch(Exception exception){
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        }


//        airport.cancelFlight(123);
//        airport.displayFlights();
        boolean condition1 = false;
        while(condition1==false){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Where would you like to go for your holiday? ");
            String destination = scanner.nextLine();
            try{
                System.out.println(airport.getFlightTo(destination));
                condition1=true;
            } catch(Exception exception){
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        }

    }


}
