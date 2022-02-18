package car;


public class Bike extends Automobile{
    protected String bikeCompany;
    protected String bikemodel;
    protected String bikecolor;
    protected String bikebreakType;

    public Bike(String bikeCompany, String bikemodel, String bikecolor, String bikebreakType, int cc, int milage) {
        super(cc, milage);
        this.bikeCompany = bikeCompany;
        this.bikemodel = bikemodel;
        this.bikecolor = bikecolor;
        this.bikebreakType = bikebreakType;
    }

    
    @Override
    public void data() {
        System.out.println("bike");
        System.out.println("Company: "+bikeCompany+"\nModel: "+bikemodel+"\nColor: "+bikecolor+"\nBreak Type: "+bikebreakType+"\nCC:"+cc+"\nMilage: "+milage+"Km");
    }
    
    
}
