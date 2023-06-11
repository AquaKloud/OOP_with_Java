package demo;
class Customer{ //compiler inserts "extends Object"
    
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.equals(c1); //Legal 
        c1.getClass(); //Legal
        c1.hashCode(); //Legal 
        c1.toString(); //
        
        Object ob=new Object();
        ob.equals(ob);
        ob.getClass();
        ob.hashCode();
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{}
class Customer extends A{ //compiler inserts "extends Object"
    
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.equals(c1);
        c1.hashCode(); //Legal
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Customer { 

    public Customer() {
        super(); //Legal ==>from class Object
    }
        
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

import javax.swing.JFrame;

class Customer { 

}
public class Demo {
    public static void main(String[] args) {
        Object ob;
        ob=new JFrame();     //Legal
        ob=new String();     //Legal
        ob=new int[4];       //Legal
        ob=new Customer();   //Legal
        ob=new Customer[5];   //Legal   
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

import javax.swing.JFrame;

class Customer { 

}
class A{}

public class Demo {
    public static void main(String[] args) {
        Object[] objects={new A(),new JFrame(),new Customer(),new Integer(null)};
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// "public Class getClass()"

package demo;
class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer(1001, "Danapala");
        Class ob=c1.getClass(); //returns Template Object of Customer
        System.out.println(ob.getName()); //demo.Customer
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// "public int hashCode()

package demo;
class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer(1001, "Danapala");
        Customer c2=new Customer(1001, "Danapala");
        Customer c3=new Customer(1002, "Gunapala");
        System.out.println("c1 : "+c1.hashCode());
        System.out.println("c2 : "+c2.hashCode());
        System.out.println("c3 : "+c3.hashCode());
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// "public String toString()"

package demo;
class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        int x=100;
        System.out.println(x);
        
        String name=new String("Danapala");
        System.out.println(name);
        System.out.println(name.toString());
        
        Customer c1=new Customer(1001, "Danapala");
        System.out.println(c1);
        System.out.println(c1.toString());
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
    /*
    public String toString(){
        return getClass().getName()+'@'+Integer.toHexString(hashCode());
    }
    */
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer(1001, "Danapala");
        System.out.println(c1); //[1001-Danapala]
        System.out.println(c1.toString());//[1001-Danapala]
        System.out.println(new Customer(1002,"Gunapala")); //[1002-Gunapala]
    }
}

//////////////////////////////////////////////////////////////////////////////////////


package demo;

import java.util.ArrayList;

class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
public class Demo {
    public static void main(String[] args) {
        ArrayList <String>stringList=new ArrayList<>();
        stringList.add(new String("Danapala"));
        stringList.add(new String("Gunapala"));
        stringList.add(new String("Somapala"));
        stringList.add(new String("Siripala"));
        System.out.println(stringList);
        
        ArrayList <Customer>customerList=new ArrayList<>();
        customerList.add(new Customer(1001, "Danapala"));
        customerList.add(new Customer(1002, "Gunapala"));
        customerList.add(new Customer(1003, "Somapala"));
        customerList.add(new Customer(1004, "Siripala"));
        System.out.println(customerList); //Output-? [1001-Danapala, 1002-Guanapala, 1003-Somapala, 1004-Siripala]
    } 
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

import java.util.ArrayList;

class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return code+"-"+name;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        ArrayList <String>stringList=new ArrayList<>();
        stringList.add(new String("Danapala"));
        stringList.add(new String("Gunapala"));
        stringList.add(new String("Somapala"));
        stringList.add(new String("Siripala"));
        System.out.println(stringList);
        
        ArrayList <Customer>customerList=new ArrayList<>();
        customerList.add(new Customer(1001, "Danapala"));
        customerList.add(new Customer(1002, "Gunapala"));
        customerList.add(new Customer(1003, "Somapala"));
        customerList.add(new Customer(1004, "Siripala"));
        System.out.println(customerList); //Output-? [1001-Danapala, 1002-Guanapala, 1003-Somapala, 1004-Siripala]
    } 
}

//////////////////////////////////////////////////////////////////////////////////////
// Method "public boolean equals(Object)"

package demo;

class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return code+"-"+name;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        int x=100,y=100,z=200;
        System.out.println("x== y : "+(x==y)); //true
        System.out.println("x== z : "+(x==z)); //false
        
        Customer c1=new Customer(1001, "Danapala");
        Customer c2=new Customer(1001, "Danapala");
        Customer c3=new Customer(1002, "Gunapala");
        Customer c4=c1;
        System.out.println("c1==c2 : "+(c1==c2)); //false ?
        System.out.println("c1==c3 : "+(c1==c3));
        System.out.println("c1==c4 : "+(c1==c4)); //true
    } 
}

//////////////////////////////////////////////////////////////////////////////////////
// Method "public boolean equals(Object)"

package demo;

class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return code+"-"+name;
    }
    /*
    public boolean equals(Object obj){
        return this==obj;
    }
    */
    
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer(1001, "Danapala");
        Customer c2=new Customer(1001, "Danapala");
        Customer c3=new Customer(1002, "Gunapala");
        Customer c4=c1;
        System.out.println("c1==c2 : "+c1.equals(c2)); //false
        System.out.println("c1==c3 : "+c1.equals(c3)); //false
        System.out.println("c1==c4 : "+c1.equals(c4)); //true
    } 
}

//////////////////////////////////////////////////////////////////////////////////////
// Overriding equals(Obj)

package demo;

class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return code+"-"+name;
    }
    /*
    public boolean equals(Object obj){
        return this==obj;
    }
    */

    @Override
    public boolean equals(Object obj) {
        //return this.code==obj.code; ==>obj.code ?
        //Customer c1=obj; //Illegal
        Customer c1=(Customer) obj;  //Object Reference casting
        return this.code==c1.code;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer(1001, "Danapala");
        Customer c2=new Customer(1001, "Danapala");
        Customer c3=new Customer(1002, "Gunapala");
        Customer c4=c1;
        System.out.println("c1==c2 : "+c1.equals(c2)); //
        System.out.println("c1==c3 : "+c1.equals(c3)); 
        System.out.println("c1==c4 : "+c1.equals(c4)); 
    } 
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

class Customer { 
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return code+"-"+name;
    }
    /*
    public boolean equals(Object obj){
        return this==obj;
    }
    */

    @Override
    public boolean equals(Object obj) {
        //return this.code==obj.code; ==>obj.code ?
        //Customer c1=obj; //Illegal
        Customer c1=(Customer) obj;  //Object Reference casting
        return this.code==c1.code;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer(1001, "Danapala");
        Customer c2=new Customer(1001, "Danapala");
        String s1=new String("Danapala");
        
        System.out.println("c1==c2 : "+c1.equals(c2)); //
        System.out.println("s1==c1 : "+s1.equals(c1));
        
        System.out.println("c1==s1 : "+c1.equals(s1)); //Runtime Error
    } 
}

//////////////////////////////////////////////////////////////////////////////////////
// Using "instanceof"

package demo;

class Customer {

    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return code + "-" + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Customer) {
            Customer c1 = (Customer) obj;  //Object Reference casting
            return this.code == c1.code;
        }else{
            return false;
        }
    }

}

public class Demo {

    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Danapala");
        Customer c2 = new Customer(1001, "Danapala");
        String s1 = new String("Danapala");

        System.out.println("c1==c2 : " + c1.equals(c2)); //
        System.out.println("s1==c1 : " + s1.equals(c1));

        System.out.println("c1==s1 : " + c1.equals(s1)); //Runtime Error
    }
}

//////////////////////////////////////////////////////////////////////////////////////
