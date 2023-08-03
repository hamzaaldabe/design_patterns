abstract class Plan {
    protected double rate;
    abstract void getRate();
    public void calculateBill(int months){
        System.out.println("Ypu have to pay: "+months*rate+"$");

    }
}
