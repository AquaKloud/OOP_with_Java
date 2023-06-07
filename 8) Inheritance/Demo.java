//-----------------------------Calculator.java-----------------------------------
package demo;

import javax.swing.*;
class Calculator extends JFrame{
	//
	//
}

//-----------------------------Demo.java------------------------------------------
package demo;

class Demo{
	public static void main(String args[]){
		Calculator c1;
		c1=new Calculator();
		c1.setSize(300,300);
		c1.setDefaultCloseOperation(3);
		c1.setVisible(true);
	}
}

//////////////////////////////////////////////////////////////////////////////////////
// Case I

package demo;

import javax.swing.JFrame;

class Calculator extends JFrame{
    //
    //
    //
}
//Calculator IS-A JFrame
//Calulator --> Sub class
//JFrame    --> Super Class

//////////////////////////////////////////////////////////////////////////////////////
// Case II

package demo;

import javax.swing.JFrame;

class Calculator extends JFrame{

    Calculator(){
        setSize(300, 300); //Legal ?
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Legal ?
        setLocationRelativeTo(null); //Legal
        //myMethod(); //Illegal ?
    }
    
}

public class Demo {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.setVisible(true);
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a;
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    void printB(){
        System.out.println("B : "+b);
    }
    void printAB(){
        System.out.println("a : "+a); //Legal ?
        System.out.println("b : "+b);
    }
    void callPrint(){
        printA(); //Legal ?
        printB();
    }
}
public class Demo {
    public static void main(String[] args) {
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case III

package demo;
class A{
    int a;
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    void printB(){
        System.out.println("B : "+b);
    }
    void printAB(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    void callPrint(){
        printA();
        printB();
    }
}
public class Demo {
    public static void main(String[] args) {
        A a1=null;
        a1.a=100;
        a1.printA();
        //a1.x=23; //Illegal        

        B b1=null;
        b1.a=100; //Legal
        b1.b=200;
        b1.printA(); //Legal 
        b1.printB();
    }
}

//////////////////////////////////////////////////////////////////////////////////////


package demo;
import javax.swing.JButton;
import javax.swing.JFrame;

class Calculator extends JFrame{
    
}

public class Demo {
    public static void main(String[] args) {
        Calculator c1=null;
        c1.setSize(300, 300); //Legal
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.add(new JButton()); //Legal ?
        c1.setVisible(true);
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case IV

package demo;
class A{
    int a;
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    void printB(){
        System.out.println("B : "+b);
    }
    void printAB(){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
    void callPrint(){
        printA();
        printB();
    }
}
public class Demo {
    public static void main(String[] args) {
        B b1=new B();
        b1.a=100; 
        b1.b=200;
        b1.printA();
        b1.printB();
        b1.printAB();
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case V (Executing static blocks)

package demo;
class A{
    int a;
    static{
        System.out.println("Static block of A");
    }
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    static{
        System.out.println("Static block of B");
    }
    void printB(){
        System.out.println("B : "+b);
    }
}
public class Demo {
    public static void main(String[] args) {
        B b1=new B();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a;
    static{
        System.out.println("Static block of A");
    }
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    static{
        System.out.println("Static block of B");
    }
    void printB(){
        System.out.println("B : "+b);
    }
}
class C extends B{
    int c;
    static{
        System.out.println("Static block of C");
    }
    void printC(){
        System.out.println("C : "+c);
    }
}
public class Demo {
    public static void main(String[] args) {
        new C();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a;
    static{
        System.out.println("Static block of A");
    }
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    static{
        System.out.println("Static block of B");
    }
    void printB(){
        System.out.println("B : "+b);
    }
}
class C extends B{
    int c;
    static{
        System.out.println("Static block of C");
    }
    void printC(){
        System.out.println("C : "+c);
    }
}
class D extends B{
    int d;
    static{
        System.out.println("Static block of D");
    }
    void printD(){
        System.out.println("D : "+d);
    }
}
public class Demo {
    public static void main(String[] args) {
        new D();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a;
    static{
        System.out.println("Static block of A");
    }
}
class B extends A{
    int b;
    static{
        System.out.println("Static block of B");
    }
}
class C extends B{
    int c;
    static{
        System.out.println("Static block of C");
    }
}
class D extends B{
    int d;
    static{
        System.out.println("Static block of D");
    }
}
class E extends B{
    int e;
    static{
        System.out.println("Static block of E");
    }
}
class F extends E{
    int F;
    static{
        System.out.println("Static block of F");
    }
}
class G extends C{
    int g;
    static{
        System.out.println("Static block of G");
    }
}
public class Demo {
    public static void main(String[] args) {
        new F();
        System.out.println("---------");
        new G();
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Invoking Super class Constructors

package demo;
class A{
    int a;
    A(){
        System.out.println("A()");
    }
    A(int i){
        System.out.println("A(int)");
    }
    A(int i,int j){
        System.out.println("A(int,int)");
    }
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    B(){
        System.out.println("B()");
    }
    B(int i){
        System.out.println("B(int)");
    }
    B(int i,int j){
        System.out.println("B(int,int)");
    }
    void printB(){
        System.out.println("B : "+b);
    }
}
public class Demo {
    public static void main(String[] args) {
        new B();
        System.out.println("------------");
        new B(10);
        System.out.println("------------");
        new B(10,20);
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Compiler inserts "super()" as first statement of a constructor 

package demo;
class A{
    int a;
    A(){
        System.out.println("A()");
    }
    A(int i){
        System.out.println("A(int)");
    }
    A(int i,int j){
        System.out.println("A(int,int)");
    }
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    B(){
        super(); //compiler inserts
        System.out.println("B()");
    }
    B(int i){
        super(); //compiler inserts
        System.out.println("B(int)");
    }
    B(int i,int j){
        super(); //compiler inserts
        System.out.println("B(int,int)");
    }
    void printB(){
        System.out.println("B : "+b);
    }
}
public class Demo {
    public static void main(String[] args) {
        new B();
        System.out.println("------------");
        new B(10);
        System.out.println("------------");
        new B(10,20);
    }
}

//////////////////////////////////////////////////////////////////////////////////////

class A{
    int a;
    A(){
        System.out.println("A()");
    }
    A(int i){
        System.out.println("A(int)");
    }
    A(int i,int j){
        System.out.println("A(int,int)");
    }
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    B(){
        super();
        System.out.println("B()");
    }
    B(int i){
        super(i);
        System.out.println("B(int)");
    }
    B(int i,int j){
        super(i,j); 
        System.out.println("B(int,int)");
    }
    void printB(){
        System.out.println("B : "+b);
    }
}
public class Demo {
    public static void main(String[] args) {
        new B();
        System.out.println("------------");
        new B(10);
        System.out.println("------------");
        new B(10,20);
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

import javax.swing.JFrame;
class Calculator extends JFrame{

    Calculator(String title){
        super(title);//
    }
     
}
public class Demo {
    public static void main(String[] args) {
        Calculator c1=new Calculator("Calculator");
        c1.setSize(300, 300);
        c1.setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
        c1.setVisible(true);
        
        /*JFrame f1=new JFrame("Calculator");
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);*/
        
                
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a;
    A(){
        System.out.println("A()");
    }
    A(int i){
        System.out.println("A(int)");
    }
    A(int i,int j){
        System.out.println("A(int,int)");
    }
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    B(){
        super();
        System.out.println("B()");
    }
    B(int i){
        System.out.println("B(int)");
        super(i);
    }
    B(int i,int j){
        System.out.println("B(int,int)");
        super(i,j); 
    }
    void printB(){
        System.out.println("B : "+b);
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class A{
    int a;
    A(){
        System.out.println("A()");
    }
    A(int i){
        this();
        System.out.println("A(int)");
    }
    A(int i,int j){
        this(i);
        System.out.println("A(int,int)");
    }
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    B(){
        this(100);
        System.out.println("B()");
    }
    B(int i){
        this(i,i);
        System.out.println("B(int)");
    }
    B(int i,int j){
        super(i,j);
        System.out.println("B(int,int)");
    }
    void printB(){
        System.out.println("B : "+b);
    }
}
public class Demo {
    public static void main(String[] args) {
        new B();
    }
}

//////////////////////////////////////////////////////////////////////////////////////


package demo;
class A{
    int a;
    A(int i){
        System.out.println("A(int)");
    }
}
class B extends A{

}

//////////////////////////////////////////////////////////////////////////////////////


package demo;
class A{
    int a;
    A(int i){
        System.out.println("A(int)");
    }
    A(int i,int j){
        System.out.println("A(int,int)");
    }
}
class B extends A{
    int b;
    B(int i){
        //Insert Code
        System.out.println("B(int)");
    }
    B(int i,int j){
        super(i);
        System.out.println("B(int)");
    }
}
//A.    this(i,i);
//B.    this();
//C.    super();
//D.    super(i);
//E.    super(i,i);
//F.    Insert nothing

//////////////////////////////////////////////////////////////////////////////////////


package demo;
class A{
    int a=10;
    static int x=20;
    A(int i){
        System.out.println("A(int)");
    }
}
class B extends A{
    int b=100;
    static int y=200;
    B(int i){
        //Insert Code
        System.out.println("B(int)");
    }
}
//A.    super(100);
//B.    super(i);
//C.    super(a);
//D.    super(b);
//E.    super(x);
//F.    super(y);

//////////////////////////////////////////////////////////////////////////////////////
// Case VIII

package demo;
class A{
    int a;
    void printA(){
        System.out.println("A : "+a);
    }
}
class B extends A{
    int b;
    void printB(){
        System.out.println("B : "+b);
    }
}
class C{}
public class Demo {
    public static void main(String[] args) {
        A a1=new B();
        a1.a=10;
        a1.printA();
        //a1.b=100; //Illegal
        //a1.printB(); //Illegal
        
        B b1=new A(); //Illegal
        b1.a=100;
        b1.b=200;
        b1.printA();
        b1.printB();
    }
}

//////////////////////////////////////////////////////////////////////////////////////


package demo;
class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Demo {
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        C c1=new C();
        D d1=new D();
        //Insert Code here
    }
}
//A.    a1=b1;
//B.    a1=c1;
//C.    a1=d1;
//D.    b1=a1;
//E.    b1=c1;
//F.    b1=d1;
//G.    c1=a1;
//H.    c1=b1;
//I.    c1=d1;
//K.    d1=a1;
//L.    d1=b1;
//M.    d1=c1;

//////////////////////////////////////////////////////////////////////////////////////
// Case IX

package demo;
class A{
    int a;
    void printA(){
        System.out.println("A : "+a);
    }
    void myMethod(int i){
        System.out.println("myMethod(int) of class A");
    }
}
class B extends A{
    int b;
    void printB(){
        System.out.println("B : "+b);
    }
    void myMethod(int i){ //Method Overriding
        System.out.println("myMethod(int) of class B");
    }
    void myMethod(double i){ //method overloading
        System.out.println("myMethod(double) of class A");
    }
}

public class Demo {
    public static void main(String[] args) {
        B b1=new B();
        b1.myMethod(100);
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Case X dynamic method dispath

package demo;
class A{
    int a;
    void printA(){
        System.out.println("A : "+a);
    }
    void myMethod(int i){ //Method Overriding
        System.out.println("myMethod(int) of class A");
    }
}
class B extends A{
    int b;
    void printB(){
        System.out.println("B : "+b);
    }
    void myMethod(int i){ //Method Overriding
        System.out.println("myMethod(int) of class B");
    }
}

public class Demo {
    public static void main(String[] args) {
        A a1=new B();
        a1.myMethod(100);
    }
}

//////////////////////////////////////////////////////////////////////////////////////


package demo;
class Animal{
    void run(){
        System.out.println("Running Animal");
    }
}
class Lion extends Animal{

    void run() {
        System.out.println("Running Lion");
    }
}
class Man extends Lion{
    void run(){
        System.out.println("Running Man");
    }
}
public class Demo {
    public static void main(String[] args) {
        Animal a1;

        a1=new Lion();
        a1.run(); 
        
        a1=new Man();
        a1.run();
                
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Animal{
    void run(){
        System.out.println("Running Animal");
    }
    void callRun(){
        run();
    }
}
class Lion extends Animal{
    void run() {
        System.out.println("Running Lion");
    }
}
public class Demo {
    public static void main(String[] args) {
        Lion ob=new Lion();
        ob.callRun();
    }
}

//////////////////////////////////////////////////////////////////////////////////////


package demo;
class Animal{
    void run(){
        System.out.println("Running Animal");
    }
    void callRun(){
        run();
    }
}
class Lion extends Animal{
    void run() {
        System.out.println("Running Lion");
    }
}
class Man extends Animal{
    void run() {
        System.out.println("Running  Man");
    }
}
public class Demo {
    public static void main(String[] args) {
        Animal ob=new Animal();
        ob.callRun();
        
        Lion ob1=new Lion();
        ob1.callRun();
        
        Man ob2=new Man();
        ob2.callRun();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Animal{
    void run(){
        System.out.println("Running Animal");
    }

    public Animal() {
        run();
    }
    
}
class Lion extends Animal{
    void run() {
        System.out.println("Running Lion");
    }
}
class Man extends Animal{
    void run() {
        System.out.println("Running  Man");
    }
}
public class Demo {
    public static void main(String[] args) {
        new Man();
    }
}

/////////////////////////////////////////////////////////////////////////////////////
// (No dynamic method dispath)

package demo;
class Animal{
    void run(){
        System.out.println("Running Animal");
    }
}
class Lion extends Animal{
    void run() {
        System.out.println("Running Lion");
    }
}
class Man extends Animal{
    void run() {
        System.out.println("Running  Man");
    }
}
public class Demo {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.run();
        
        Lion l1=new Lion();
        l1.run();
        
        Man m1=new Man();
        m1.run();
    }
}

/////////////////////////////////////////////////////////////////////////////////////
