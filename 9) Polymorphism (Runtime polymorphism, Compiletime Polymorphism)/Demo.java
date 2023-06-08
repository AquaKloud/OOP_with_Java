package demo;
class Vehicle{
    void park(){
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
// Object Arrays

package demo;
class Vehicle{
    void park(){
        //
    }
}
public class Demo {
    public static void main(String[] args) {
        int[] xr=new int[5];
        xr[0]=100;
        
        Vehicle[] vehicles=new Vehicle[5];
        vehicles[0]=new Vehicle();
        
    }   
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Customer{
    int code;
    double salary;

    public Customer(int code, double salary) {
        this.code = code;
        this.salary = salary;
    }
    public void printCustomer(){
        System.out.println(code+"-"+salary);
    }
}
public class Demo {
    public static void main(String[] args) {
        
        int[] xr={12,32,43,54,65,67};
        for (int y : xr) {
            System.out.print(y+" ");
        }
        System.out.println();
        
        Customer[] customers={
            new Customer(1001,5000),
            new Customer(1002,6000),
            new Customer(1003,3000),
            new Customer(1004,2000),
        };
        //Inser code here to print Customer salary
        
    }   
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Customer{
    int code;
    double salary;

    public Customer(int code, double salary) {
        this.code = code;
        this.salary = salary;
    }
    public void printCustomer(){
        System.out.println(code+"-"+salary);
    }
}
public class Demo {
    public static void main(String[] args) {
        
        int[] xr={12,32,43,54,65,67};
        for (int y : xr) {
            System.out.print(y+" ");
        }
        System.out.println();
        
        Customer[] customers={
            new Customer(1001,5000),
            new Customer(1002,6000),
            new Customer(1003,3000),
            new Customer(1004,2000),
        };
        //Inser code here to print Customer salary
        for (Customer customer : customers) {
            customer.printCustomer();
        }
    }   
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Vehicle{
    void park(){
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
class Customer{}
public class Demo {
    public static void main(String[] args) {
        Car[] cars={new Car(),new Car(), new Car()}; //Legal
        
        Car[] cars2={new Car(), new Vehicle()}; //Illegal
        
        Vehicle[] vehicles={new Car(), new Bus(), new Van(),new Vehicle()};//Legal ?
        Vehicle[] vehicles1={new Vehicle(),new Car(), new Customer()};//Illegal
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Vehicle{
    void park(){
        System.out.println("Vehicle Parking..");
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
class Customer{}
public class Demo {
    public static void main(String[] args) {
        Vehicle[] vehicles={new Car(), new Bus(), new Van(),new Vehicle()};
        for (Vehicle vehicle : vehicles) {
            vehicle.park(); //Single interface 
        }
        //-------------------------------
        System.out.println("-----------------");
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].park(); //single interface
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

import java.util.Random;

class Alarm{
    public void operateAlarm(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON ": "Alarm OFF");
    }
}
class Display{
    public void display(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}
class SMSSender{
    public void sendSMS(int waterLevel){
        System.out.println("Sending SMS : "+waterLevel);
    }
}
class ControlRoom{
    private Alarm alarm;
    private Display display;
    private SMSSender sMSSender;
    private int waterLevel;
    
    public void addAlarm(Alarm alarm){
        this.alarm=alarm; 
    }
    public void addDisplay(Display display){
        this.display=display;
    }
    public void addSMSSender(SMSSender sMSSender){
        this.sMSSender=sMSSender;
    }
    public void notifyObservers(){
        alarm.operateAlarm(waterLevel);
        display.display(waterLevel);
        sMSSender.sendSMS(waterLevel);
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
        controlRoom.addAlarm(new Alarm());
        controlRoom.addDisplay(new Display());
        controlRoom.addSMSSender(new SMSSender());
        
        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101); //0 to 100;
            controlRoom.setWaterLevel(waterLevel);
            try{Thread.sleep(1000);}catch(Exception ex){}
            
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// (Adding a Splitter)

package demo;

import java.util.Random;
import java.util.SplittableRandom;

class Alarm{
    public void operateAlarm(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON ": "Alarm OFF");
    }
}
class Display{
    public void display(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}
class SMSSender{
    public void sendSMS(int waterLevel){
        System.out.println("Sending SMS : "+waterLevel);
    }
}
class Splitter{
    public void split(int waterLevel){
        System.out.println(waterLevel>=75 ? "Splitter ON":"Splitter OFF");
    }
}
class ControlRoom{
    private Alarm alarm;
    private Display display;
    private SMSSender sMSSender;
    private Splitter splitter;
    
    private int waterLevel;
    
    public void addSplitter(Splitter splitter){
        this.splitter=splitter;
    }
    
    public void addAlarm(Alarm alarm){
        this.alarm=alarm; 
    }
    public void addDisplay(Display display){
        this.display=display;
    }
    public void addSMSSender(SMSSender sMSSender){
        this.sMSSender=sMSSender;
    }
    public void notifyObservers(){
        alarm.operateAlarm(waterLevel);
        display.display(waterLevel);
        sMSSender.sendSMS(waterLevel);
        splitter.split(waterLevel);
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
        controlRoom.addAlarm(new Alarm());
        controlRoom.addDisplay(new Display());
        controlRoom.addSMSSender(new SMSSender());
        controlRoom.addSplitter(new Splitter());
                
        Random r=new Random();
        while(true){
            int waterLevel=r.nextInt(101); //0 to 100;
            controlRoom.setWaterLevel(waterLevel);
            try{Thread.sleep(1000);}catch(Exception ex){}
            
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// (Using "polymorphism)

package demo;

import java.util.Random;

class WaterLevelObserver{
    public void update(int waterLevel){
        //
    }
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
// Adding a Splitter

package demo;

import java.util.Random;

class WaterLevelObserver{
    public void update(int waterLevel){
        //
    }
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

package demo;

class Vehicle{
    int year=1999;
    void park(){
        System.out.println("Vehicle Parking..");
    }
}
class Car extends Vehicle{
    int year=2000;
    void park(){
        System.out.println("Car Parking");
    }
}

public class Demo {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.park();
        System.out.println(v1.year);
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

class Vehicle{
    int year=1999;
    void park(){
        System.out.println("Vehicle Parking..");
    }
}
class Car extends Vehicle{
    int year=2000;
    void park(){
        System.out.println("Car Parking");
    }
    public void printYear(){
        System.out.println("year of Car     : "+year);
        System.out.println("year of Vehicle : "+super.year);
    }
    public void callPark(){
        park();
        super.park();
    }
}

public class Demo {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.printYear();
        c1.callPark();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a=10;
}
class B extends A{
    int a=20;
    void print(){
        int a=30;
        System.out.println("a Local : "+a); //30
        System.out.println("a sub   : "+a); //20
        System.out.println("a super : "+a); //10
    }
}
public class Demo {
    public static void main(String[] args) {
        B b1=new B();
        b1.print();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a=10;
}
class B extends A{
    int a=20;
    void print(){
        int a=30;
        System.out.println("a Local : "+a); //30
        System.out.println("a sub   : "+this.a); //20
        System.out.println("a super : "+super.a); //10
    }
}
public class Demo {
    public static void main(String[] args) {
        B b1=new B();
        b1.print();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a=10;
}
class B extends A{
    int a=20;
}
class C extends B{
    int a=30;
    void print(){
        System.out.println("a of A : "+a); //10
        System.out.println("a of B : "+a); //20
        System.out.println("a of C : "+a); //30
    }
}
public class Demo {
    public static void main(String[] args) {
        C c1=new C();
        c1.print();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a=10;
}
class B extends A{
    int a=20;
}
class C extends B{
    int a=30;
    void print(){
        System.out.println("a of A : "+super.super.a); //10 //Illegal ? 
        System.out.println("a of B : "+super.a); //20
        System.out.println("a of C : "+a); //30
    }
}
public class Demo {
    public static void main(String[] args) {
        C c1=new C();
        c1.print();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a=10;
}
class B extends A{
    //int a=20;
}
class C extends B{
   // int a=30;
    void print(){
        System.out.println("a of B : "+super.a); //20
        System.out.println("a of C : "+this.a); //30
    }
}
public class Demo {
    public static void main(String[] args) {
        C c1=new C();
        c1.print();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    //int a=10;
}
class B extends A{
    //int a=20;
}
class C extends B{
    int a=30;
    void print(){
        System.out.println("a of B : "+super.a); //20
        System.out.println("a of C : "+this.a); //30
    }
}
public class Demo {
    public static void main(String[] args) {
        C c1=new C();
        c1.print();
    }
}

//////////////////////////////////////////////////////////////////////////////////////
