//////////////////////////////////////////////////////////////////////////////////////
// Rule No.1  Static Methods (Case I)

package demo;
class Vehicle{
    void park(){
        System.out.println("Vehicle Parking..");
    }
}
class Car extends Vehicle{

    @Override
   static void park() { //Illegal
        System.out.println("Car Parking");
    }
    
}

//////////////////////////////////////////////////////////////////////////////////////
// Rule No.1 Static Methods (Case II)

package demo;
class Vehicle{
    static void park(){
        System.out.println("Vehicle Parking..");
    }
}
class Car extends Vehicle{

    @Override
   void park() { //Illegal
        System.out.println("Car Parking");
    }
    
}

//////////////////////////////////////////////////////////////////////////////////////
// Rule No.1 Static Methods (Case III)

package demo;
class Vehicle{
    static void park(){
        System.out.println("Vehicle Parking..");
    }
}
class Car extends Vehicle{

    //@Override
   static void park() { //Legal
        System.out.println("Car Parking");
    }
    
}
public class Demo {

    public static void main(String[] args) {
        Vehicle v1=new Car();
        v1.park();
                
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Rule No. 2 private Methods

package demo;
class Vehicle{
    private void park(){
        System.out.println("Vehicle Parking..");
    }
    public void callPark(){
        park();
    }
}
class Car extends Vehicle{

   //@Override
   void park() { //Legal
        System.out.println("Car Parking");
    }
    
}
public class Demo {

    public static void main(String[] args) {
        Car c1=new Car();
        c1.callPark();
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Rule No.3 Final Methods

package demo;
class Vehicle{
    final void park(){
        System.out.println("Vehicle Parking..");
    }
    
}
class Car extends Vehicle{

   //@Override
   void park() { 
        System.out.println("Car Parking");
    }
    
}

//////////////////////////////////////////////////////////////////////////////////////
// Exercise (Final Classes)

package demo;
final class Vehicle{
    void park(){ //Implicitly final methods
        System.out.println("Vehicle Parking..");
    }
    
}
class Car extends Vehicle{

}

//////////////////////////////////////////////////////////////////////////////////////
// Rule No. 4 (Weaker Access Privileges)

package demo;
class Vehicle{
   protected void park(){
        System.out.println("Vehicle Parking..");
    }
    
}
class Car extends Vehicle{

   @Override
   /*Insert code to legal*/void park() { 
        System.out.println("Car Parking");
    }
    
}
//A.    public   -->Legal
//B.    protected->Legal
//C.    default -->Illegal  (Insert nothing)
//D.    private -->Illegal

//////////////////////////////////////////////////////////////////////////////////////
// Rule N0. 5 (Same return types)

package demo;

class Vehicle {

    boolean  park() {
        System.out.println("Vehicle Parking..");
        return true;
    }
}

class Car extends Vehicle {

    
    double park() { //Illegal
        System.out.println("Car Parking");
        return 12.23;
    }
    
    int park(int location){//Overloading -->Legal
        return 122;
    }

}

//////////////////////////////////////////////////////////////////////////////////////
// Rule No.5 (Covariant Since JDK1.5)

package demo;
class Animal{}
class Dog extends Animal{}
class Vehicle {

    Animal  park() {
        System.out.println("Vehicle Parking..");
        Animal a1=new Animal();
        return a1;
    }
}

class Car extends Vehicle {
    
    Dog park() { //Legal Since JDK1.5 -->Covariant
        System.out.println("Car Parking");
        Dog d1=new Dog();
        return d1;
    }
}

//////////////////////////////////////////////////////////////////////////////////////
