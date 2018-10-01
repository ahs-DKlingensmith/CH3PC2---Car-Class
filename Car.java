
/*
 * Car Class
 */

public class Car {
    
    //Establish attributes
    private int yearModel;
    private String make;
    private int speed;
    
    /**
     * The Car constructor accepts the arguments for the 
     * yearModel and make fields
     */    
    public Car(int ym, String m)    {
        yearModel = ym;
        make = m;
        speed = 0;
    }
    
    /**
     * The getYearModel method returns the argument passed
     * to the yearModel field
     */
    public int getYearModel()   {
        return yearModel;
    }
    
    /**
     * The getMake method returns the argument passed
     * to the make field
     */
    public String getMake() {
        return make;
    }
    
    /**
     * The getSpeed method returns the argument passed
     * to the speed field
     */
    public int getSpeed()   {
        return speed;
    }
    
    /**
     * The accelerate method increases the speed argument by 5
     */
    public void accelerate()    {
        speed += 5;
    }
    
    /**
     * The brake method decreases the speed argument by 5
     */
    public void brake() {
        speed -= 5;
    }
    
    
    
}
