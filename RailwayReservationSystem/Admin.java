import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    static ArrayList<Train> trains = new ArrayList<>();
    static ArrayList<Ticket> tickets = new ArrayList<>();
    public void showAdminFunctions(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1.Add Train\n 2.Show Train Details\n 3.Show Booked tickets\n 4.Show Cancelled Ticket\n 5.Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Enter Train No");
                int trainNo = sc.nextInt();
                System.out.println("Enter Train Name");
                String trainName = sc.next();
                System.out.println("Enter Train Source");
                String trainSource = sc.next();
                System.out.println("Enter Train Destination");
                String trainDestination = sc.next();
                int trainCapacity = 50;
                trains.add(new Train(trainNo, trainName, trainSource, trainDestination, trainCapacity));
            }
                break;
            case 2:
            {
                for(Train train : trains){
                    System.out.println("Train No : "+train.getTrainNo()+"\n"+"Train Name : "+train.getTrainName()+"\n"+"Train Capacity : "+train.getTrainCapacity()+"\n"+"Source : "+train.getTrainSource()+"\n"+"Destination : "+train.getTrainDestination()+"\n");
                }
            }
                break;
            case 3:
                {
                    for(Ticket ticket : tickets){
                        ticket.bookedTicket();
                    }
                }
                break;
            case 4:
                {
                    for(Ticket ticket : tickets){
                        if(ticket.getStatus() == false){
                            System.out.println("Cancelled ticket Id Is : "+ticket.getTicketId());
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
