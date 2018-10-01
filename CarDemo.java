/**
 * Dylan Klingensmith
 * Car Demo
 * AP Computer Science 
 * 9/28/18
 */

public class CarDemo {

    public static void main(String[] args) {
        
        //Establish car object
        Car vehicle = new Car(1512, "Lamborghini");
        
        //Accelerate five times and get speed each time
        for (int x = 0; x < 5; x++) {
            vehicle.accelerate();
            System.out.println(vehicle.getSpeed());
        }
        System.out.println(" ");
        
        //Brake five times and get the speed each time
        for (int y = 0; y < 5; y++) {
            vehicle.brake();
            System.out.println(vehicle.getSpeed());
        }
        
        
    }

}
