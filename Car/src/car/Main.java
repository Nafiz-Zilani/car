package car;


public class Main {

    
    public static void main(String[] args) {
        Car c1 = new Car("bugaati", "chiron", "Black",2,2,1000,6);
        c1.data();
        
        Car c2 = new Car("lamborgini", "hurkn", "Mad-Blue", 4, 4, 1200, 25);
        c2.data();
        
        Bike b1 = new Bike("Yamaha", "R15 V3", "Black", "spngle ABS", 150, 40);
        b1.data();
        Bike b2 = new Bike("Honda", "X-Blade", "Black", "Single ABS", 160, 45);
        b2.data();
    }
    
}
