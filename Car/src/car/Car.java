package car;


public class Car extends Automobile{
    protected String carCompany;
    protected String carmodel;
    protected String carcolor;
    protected int carseatNumber;
    protected int cardoorNumber;

    public Car(String carCompany, String carmodel, String carcolor, int carseatNumber, int cardoorNumber, int cc, int milage) {
        super(cc, milage);
        this.carCompany = carCompany;
        this.carmodel = carmodel;
        this.carcolor = carcolor;
        this.carseatNumber = carseatNumber;
        this.cardoorNumber = cardoorNumber;
    }

    @Override
    public void data() {
        System.out.println("car");
        System.out.println("Company: "+carCompany+"\nModel: "+carmodel+"\nColor: "+carcolor+"\nTotal Seat: "+carseatNumber+"\nTotal Door: "+cardoorNumber+"\nCC:"+cc+"\nMilage: "+milage+"Km");
    }
    
    
}
