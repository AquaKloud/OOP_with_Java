
package demo;
/*abstract class Vehicle{ 
    abstract  void park();
    abstract void start();
    abstract void stop();
}
*/
interface Vehicle{  //fully abstract
    void park();    //implicitly abstract, public
    void start();   //implicitly abstract, public
    void stop();    //implicitly abstract, public
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
interface Vehicle{  //fully abstract
    void park();    //implicitly abstract, public
}
class Car implements Vehicle{

    @Override
    public void park() {
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

package demo;

import java.util.Random;

interface WaterLevelObserver{
    public void update(int waterLevel);
}
        
class Alarm implements WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON ": "Alarm OFF");
    }
}
class Display implements WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println("Water Level : "+waterLevel);
    }
}
class SMSSender implements WaterLevelObserver{
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

interface WaterLevelObserver{
    //public void update(int waterLevel);
}
class Alarm extends WaterLevelObserver{} //Illegal

class Display implements WaterLevelObserver{} //Legal

//////////////////////////////////////////////////////////////////////////////////////
// Case II

package demo;
interface WaterLevelObserver{
    void update(int waterLevel); //implicitly public, abstract
    public void mA();
    void mB();
    protected void mC(); //Ilegal
    
    abstract void mD();
    void mE(){ //Illegal ->implicitly abstract
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////


package demo;
interface WaterLevelObserver{
    void update(int waterLevel);
}
class Alarm implements WaterLevelObserver{
    //Insert code
}
//A.    public void update(int waterLevel){}
//B.    void update(int waterLevel){}
//C.    protected void update(int waterLevel){}
//D.    protected void update(double waterLevel){}
//E.    void upadte(){}

//////////////////////////////////////////////////////////////////////////////////////
// Case III

package demo;
interface WaterLevelObserver{
    void update(int waterLevel);
    void reset();
}
class Alarm implements WaterLevelObserver{} //Illegal

class Display implements WaterLevelObserver{ //Illegal
    public void update(int waterLevel){}
}

class Splitter implements WaterLevelObserver{
    public void update(int waterLevel){}
    public void reset(){}
}

abstract class SMSSender implements WaterLevelObserver{}

//////////////////////////////////////////////////////////////////////////////////////
// Case IV

package demo;
interface WaterLevelObserver{
    void update(int waterLevel);
}
class Alarm implements WaterLevelObserver{

    @Override
    public void update(int waterLevel) {
        System.out.println(waterLevel>=50 ? "Alarm ON":"Alarm OFF");
    }
}

public class Demo {
    public static void main(String[] args) {
        WaterLevelObserver ob;
        ob=new WaterLevelObserver(); //Illegal
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case V

package demo;
interface WaterLevelObserver{
    void update(int waterLevel);
}
class Alarm implements WaterLevelObserver{

    @Override
    public void update(int waterLevel) {
        System.out.println(waterLevel>=50 ? "Alarm ON":"Alarm OFF");
    }
}

public class Demo {
    public static void main(String[] args) {
        WaterLevelObserver ob;
        ob=new Alarm(); //Legal
        ob.update(1001);
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case VI

package demo;
interface WaterLevelObserver{
    //int x; //Illegal
    int x=100; //Legal -->implicitly public, static and final
    
    void update(int waterLevel);
     
    //WaterLevelObserver(){ }//constructor Illegal
}
public class Demo {
    public static void main(String[] args) {
        System.out.println(WaterLevelObserver.x); //100 -->x is static
        WaterLevelObserver.x=200; //Illegal -->x is 
    }
}

//////////////////////////////////////////////////////////////////////////////////////
//Case VII

package demo;
class Lion{}
interface Fox{}
class Father{}
class Son extends Father implements Lion{}
//Son is a Lion
//Son is a Fox

//////////////////////////////////////////////////////////////////////////////////////

package demo;

import java.util.Random;

abstract class WaterLevelObserver{
    abstract public void update(int waterLevel);
}
        
class Alarm extends JFrame, WaterLevelObserver{ //No multiple inheritance in java
    public void update(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON ": "Alarm OFF");
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

import java.util.Random;
import javax.swing.JFrame;

interface WaterLevelObserver{
    public void update(int waterLevel);
}
        
class Alarm extends JFrame implements WaterLevelObserver{
    public void update(int waterLevel){
        System.out.println(waterLevel>=50 ? "Alarm ON ": "Alarm OFF");
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case VIII (Interfaces can be extended)

package demo;
interface Animal{}
interface Fox extends Animal{}

//////////////////////////////////////////////////////////////////////////////////////
// Case IX (Default Methods - Since JDK1.8)

package demo;
interface Vehicle{
    public void park();
    default public void start(){ //since JDK1.8
        System.out.println("default implementaion");
    }
}
class Car implements Vehicle{

    @Override
    public void park() {
        System.out.println("Car Parking..");
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.park();
        v1.start();
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case X Static Methods (Since JDK1.8)
package demo;
interface Vehicle{
    public void park();
    static public void start(){ //since JDK1.8
        System.out.println("static methods...");
    }
}
public class Demo {
    public static void main(String[] args) {
        Vehicle.start();
    }
}

//////////////////////////////////////////////////////////////////////////////////////
Q194
package demo;

public interface Demo {
    public static void main(String[] args) {
        System.out.println("Hello java");
    }
}

