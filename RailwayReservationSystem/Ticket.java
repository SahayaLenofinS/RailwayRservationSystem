public class Ticket {
    private boolean status;
    private String passengerName;
    private String trainName;
    private int trainNo;
    private int passengerId;
    private int ticketId;
    private String source;
    private String destination;
    Ticket(int passengerId, String passengerName, int trainNo, String trainName, String source, String destination, boolean status){
        this.ticketId  = (int) Math.random();
        this.passengerName = passengerName;
        this.status = status;
        this.trainName = trainName;
        this.trainNo = trainNo;
        this.passengerId = passengerId;
        this.source = source;
        this.destination = destination;
    }
    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPassengerName() {
        return this.passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getTrainName() {
        return this.trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public int getTrainNo() {
        return this.trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public int getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void bookedTicket(){
        System.out.println("Hello "+passengerName +"\n" + "Your Ticket Id : "+ticketId);
        System.out.println("Passenger Name : "+passengerId+"\n"+"Passenger Name : "+passengerName+"\n");
        System.out.println("Status : "+status+"\n"+"Source : "+source+"\n"+"Destination : "+destination+"\n");
    }
}
