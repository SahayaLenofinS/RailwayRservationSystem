import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        while(true){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Admin \n"+"2.Passenger \n"+"Enter your option : ");
        int choice = sc.nextInt();
        String adminName = "Admin123";
        String adminPassword = "Railway@2024";
        switch(choice){
            case 1 : {
                System.out.print("Enter Admin User Name : ");
                String name = sc.next();
                System.out.print("Enter Admin Password : ");
                String password = sc.next();
                if(adminName.equals(name)){
                    if(adminPassword.equals(password)){
                        Admin admin = new Admin();
                        admin.showAdminFunctions();
                    }
                }
                else{
                    System.out.println("Invalid Username Or Password");
                }
            }
            break;
            case 2 : {
                System.out.print("Enter Passenger User Name : ");
                String passengerName = sc.next();
                int passengerId = (int) Math.random();
                Passenger passenger = new Passenger(passengerName, passengerId);
                passenger.showPassengerFunctions();
            }
            break;

        }
    }
    }
}