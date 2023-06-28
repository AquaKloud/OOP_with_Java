

package demo;
class Vehicle{
    void park(){ //wrong method implementation
        //
    }
}
class Car extends Vehicle{
    void park(){
        System.out.println("Car Parking");
    }
}
class Bus extends Vehicle{
    void park(){
        System.out.println("Bus Parking");
    }
}
class Van extends Vehicle{
    void park(){
        System.out.println("Van Parking");
    }
}
        
public class Demo {
    public static void main(String[] args) {
        Vehicle v1;
        v1=new Car();
        v1.park(); //Car Parking
        
        v1=new Bus();
        v1.park(); //Bus Parking
        
        v1=new Van();
        v1.park();//Van Parking
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Vehicle{
    void park(); //IllegaL
}
class Car extends Vehicle{
    void park(){
        System.out.println("Car Parking");
    }
}
class Bus extends Vehicle{
    void park(){
        System.out.println("Bus Parking");
    }
}
class Van extends Vehicle{
    void park(){
        System.out.println("Van Parking");
    }
}
        
public class Demo {
    public static void main(String[] args) {
        Vehicle v1;
        v1=new Car();
        v1.park(); //Car Parking
        
        v1=new Bus();
        v1.park(); //Bus Parking
        
        v1=new Van();
        v1.park();//Van Parking
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// (Abstract Method)

package demo;
class Vehicle{ //Illegal
    abstract void park(); //Legal
}
class Car extends Vehicle{
    void park(){
        System.out.println("Car Parking");
    }
}
class Bus extends Vehicle{
    void park(){
        System.out.println("Bus Parking");
    }
}
class Van extends Vehicle{
    void park(){
        System.out.println("Van Parking");
    }
}
        
public class Demo {
    public static void main(String[] args) {
        Vehicle v1;
        v1=new Car();
        v1.park(); //Car Parking
        
        v1=new Bus();
        v1.park(); //Bus Parking
        
        v1=new Van();
        v1.park();//Van Parking
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// (Abstract Classes)

package demo;
abstract class Vehicle{ //Legal
    abstract void park(); //Legal
}
class Car extends Vehicle{
    void park(){
        System.out.println("Car Parking");
    }
}
class Bus extends Vehicle{
    void park(){
        System.out.println("Bus Parking");
    }
}
class Van extends Vehicle{
    void park(){
        System.out.println("Van Parking");
    }
}
        
public class Demo {
    public static void main(String[] args) {
        Vehicle v1;
        v1=new Car();
        v1.park(); //Car Parking
        
        v1=new Bus();
        v1.park(); //Bus Parking
        
        v1=new Van();
        v1.park();//Van Parking
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

import java.util.Random;

abstract class WaterLevelObserver{
    abstract public void update(int waterLevel);
}
        
class Alarm extends WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON ": "Alarm OFF");
    }
}
class Display extends WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}
class SMSSender extends WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println("Sending SMS : "+waterLevel);
    }
}

class ControlRoom{
    private WaterLevelObserver[] observers=new WaterLevelObserver[10];
    private int waterLevel;
    private int nextIndex;
    public void addWaterLevelObserver(WaterLevelObserver waterLevelObserver ){
        observers[nextIndex++]=waterLevelObserver;
    }
        
    public void notifyObservers(){
        for (int i = 0; i < nextIndex; i++) {
            observers[i].update(waterLevel);
        }
    }
    public void setWaterLevel(int waterLevel){
        if(this.waterLevel!=waterLevel){
            this.waterLevel=waterLevel;
            notifyObservers();
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        ControlRoom controlRoom=new ControlRoom();
        controlRoom.addWaterLevelObserver(new Alarm());
        controlRoom.addWaterLevelObserver(new Display());
        controlRoom.addWaterLevelObserver(new SMSSender());
                        
        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101); //0 to 100;
            controlRoom.setWaterLevel(waterLevel);
            try{Thread.sleep(1000);}catch(Exception ex){}
            
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case I

package demo;
class Vehicle{
    void park(); //Illegal
}

//////////////////////////////////////////////////////////////////////////////////////
// Case II

package demo;
class Vehicle{ //Illegal ?
    abstract  void park(); //Legal 
}

//////////////////////////////////////////////////////////////////////////////////////
// Case III

package demo;
abstract class Vehicle{ 
    abstract  void park(){ //Illegal
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case IV

package demo;
abstract class Vehicle{ //Legal
    void park(){ //
        //code for implementation
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case V

package demo;
abstract class Vehicle{ //Legal
    abstract  void park();
    void start(){
        System.out.println("Starting a vehicle");
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case VI

package demo;
abstract class Vehicle{ 
    abstract  void park();
    void start(){
        System.out.println("Starting..");
    }
    abstract void stop();
}
class Car extends Vehicle{
    
}
class Van extends {
    void park(){
        System.out.println("Van Parking");
    }
}
class Bus extends {
    void park(){
        System.out.println("Bus Parking");
    }
    void stop(){
        //
    }
}
abstract class MB extends Vehicle{}
        
//////////////////////////////////////////////////////////////////////////////////////
// Case VII

package demo;
abstract class Vehicle{ 
    abstract  void park();
}
public class Demo {
    public static void main(String[] args) {
        Vehicle v1; //Legal
        v1=new Vehicle(); //Illegal
    }   
}

//////////////////////////////////////////////////////////////////////////////////////
// Case VIII

package demo;
abstract class Vehicle{ 
    abstract  void park();
}
class Car extends Vehicle{
    void park(){
        System.out.println("Car Parking...");
    }
}
        
public class Demo {
    public static void main(String[] args) {
        Vehicle v1;
        v1=new Car();
        v1.park(); //Legal
    }   
}

//////////////////////////////////////////////////////////////////////////////////////
// Case IX

package demo;
abstract class Vehicle{ 
    int year;
    abstract  String name;
    
    abstract  void park();
}

//////////////////////////////////////////////////////////////////////////////////////
// Case X

package demo;
abstract class Vehicle{ 
    int year;

    public Vehicle() {    }

    abstract public Vehicle(int year);
        
    abstract  void park();
}

//////////////////////////////////////////////////////////////////////////////////////
// Case XI

package demo;
class Animal{
    
}
abstract class Vehicle extends Animal{ 

}

//////////////////////////////////////////////////////////////////////////////////////
// Case XII

package demo;
abstract class Vehicle{ 
    static abstract  void park();	//Illegal
    final abstract void start();	//Illegal
    private abstract void stop();	//Illegal
}

