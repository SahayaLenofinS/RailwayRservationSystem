public class Train {
    private String passengerName;
    private int trainNo;
    private String trainName;
    private String trainSource;
    private String trainDestination ;
    private int trainCapacity;
    private boolean payment;
    public Train(int trainNo, String trainName, String trainSource, String trainDestination, int trainCapacity){
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.trainSource = trainSource;
        this.trainDestination =trainDestination;
        this.trainCapacity = trainCapacity;
    }
    public int getTrainNo() {
        return this.trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
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

    public String getTrainSource() {
        return this.trainSource;
    }

    public void setTrainSource(String trainSource) {
        this.trainSource = trainSource;
    }

    public String getTrainDestination() {
        return this.trainDestination;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination = trainDestination;
    }

    public int getTrainCapacity() {
        return this.trainCapacity;
    }

    public void setTrainCapacity(int trainCapacity) {
        this.trainCapacity = trainCapacity;
    }

    public boolean isPayment() {
        return this.payment;
    }

    public boolean getPayment() {
        return this.payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }
    public void showTrainDetails(){
        System.out.println("Train No : "+trainNo+"\n"+"Train Name : "+trainName+"\n"+"Train Capacity : "+trainCapacity+"\n"+"Source : "+trainSource+"\n"+"Destination : "+trainDestination+"\n");
    }
}
