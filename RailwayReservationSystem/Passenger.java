import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {
    private String passengerName;
    private int passengerId;
    Passenger(String passengerName, int passengerId) {
        this.passengerName = passengerName;
        this.passengerId = passengerId;
    }
    public int getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
    public String getPassengerName() {
        return this.passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public void showPassengerFunctions(){
        ArrayList<Train> trains = Admin.trains;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1.Book Train\n 2.Show Trains\n 3.Cancel ticket\n 4.Show Ticket Details\n 5.Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                {
                    System.out.println("Enter Train No : ");
                    int trainNo = sc.nextInt();
                    for(Train train : trains){
                        if(train.getTrainNo() == trainNo){
                            String trainName = train.getTrainName();
                            String trainSource = train.getTrainSource();
                            String trainDestination = train.getTrainDestination();
                            Ticket ticket = new Ticket( passengerId, passengerName, trainNo, trainName, trainSource, trainDestination, true);
                            Admin.tickets.add(ticket);
                            ticket.bookedTicket();
                            
                        }
                        else{
                            System.out.println("Invalid Train Number");
                        }
                        break;

                    }
                }
                break;
            case 2:
            for(Train train : trains){
                System.out.println(train);
            }
                break;
            case 3:{
                System.out.println("Enter Ticket Id : ");
                int ticketId = sc.nextInt();
                for(Ticket ticket : Admin.tickets){
                    if(ticketId == ticket.getTicketId()){
                        ticket.setStatus(false);
                    }
                }
            }
                
                break;
            case 4:
                {
                    System.out.println("Enter Ticket Id : ");
                    int ticketId = sc.nextInt();
                    for(Ticket ticket : Admin.tickets){
                        if(ticketId == ticket.getTicketId()){
                            ticket.bookedTicket();
                        }
                    }
                }
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Key");
                break;
        }
    }
}