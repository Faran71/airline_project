import java.time.LocalTime;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Airport airport = new Airport("Luton");

        airport.addFlight(new Flight("Paris", 123,new Plane(3344,10000,1,Model.Boeing747), LocalTime.of(16,40)));
        airport.addFlight(new Flight("Paris", 237,new Plane(33445,15000,7,Model.Boeing777),LocalTime.of(2,40)));
        airport.addFlight(new Flight("Berlin", 456, new Plane(9909,8000,3,Model.AirbusA380),LocalTime.of(10,40)));
        airport.addFlight(new Flight("Madrid", 489, new Plane(9909,8000,3,Model.AirbusA380),LocalTime.of(7,40)));
        airport.addFlight(new Flight("London", 986, new Plane(9909,8000,3,Model.AirbusA380),LocalTime.of(8,40)));
        airport.addFlight(new Flight("Dubai", 777, new Plane(9909,8000,3,Model.AirbusA380),LocalTime.of(23,40)));


        airport.displayFlights();

//        try {
//            airport.bookPassenger(new Passenger(12345678,"Faran","email@bnta.com"),123);;
//        } catch(Exception exception){
//            System.out.println(exception.getMessage());
//            exception.printStackTrace();
//        }
//
//        try {
//            airport.bookPassenger(new Passenger(98765432, "Charlotte", "neweremail@bnta"), 123);
//        } catch(Exception exception){
//            System.out.println(exception.getMessage());
//            exception.printStackTrace();
//        }


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Would you like to book a flight? Enter true or false.");
        boolean runProgram = scanner2.nextBoolean();
        boolean morePassenger = runProgram;
        Scanner scanner = new Scanner(System.in);
        while(morePassenger == true){
            System.out.println("What is your name?");
//            Scanner scanner = new Scanner(System.in);
            String nameEntered = scanner.nextLine();

            System.out.println("What is you email address");
            String emailEntered = scanner.nextLine();

            System.out.println("Please enter your passport number?");
            int passNumber = scanner.nextInt();




            boolean condition1 = false;
            while(condition1==false){
            Scanner scanner1 = new Scanner(System.in);
                System.out.println("Where would you like to go for your holiday? ");
                String destination = scanner1.nextLine();
                try{
                    System.out.println(airport.getFlightTo(destination));
                    condition1=true;
                } catch(Exception exception){
                    System.out.println(exception.getMessage());
                    exception.printStackTrace();
                }
            }

            System.out.println("Pick a Flight id?");
            int flightId = scanner.nextInt();

            try{
                airport.bookPassenger(new Passenger(passNumber,nameEntered,emailEntered),flightId);;
            } catch(Exception exception){
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
            System.out.println("Would you like to book another? true or false?");
            boolean addToFlight = scanner.nextBoolean();
            morePassenger = addToFlight;
        }




        System.out.println("Would you like to see passenger information? Enter true or false.");
        boolean runProgramInfo = scanner.nextBoolean();
        airport.displayFlights();
        boolean condition=false;
        if (runProgramInfo){
            while(condition == false){
                System.out.println("Enter flight number to get passenger details");
    //            Scanner scanner = new Scanner(System.in);
                int id = scanner.nextInt();
                try{
                    System.out.println("Number of passengers on flight "+ id +" is " + airport.displayPassengers(id));
                    condition=true;
                }catch(Exception exception){
                    System.out.println(exception.getMessage());
                    exception.printStackTrace();
                }
            }
        }


//        airport.cancelFlight(123);
//        airport.displayFlights();


    }


}
