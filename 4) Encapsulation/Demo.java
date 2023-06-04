class Demo{
	public static void main(String args[]){
		int length;
		int width;
		int height;
		
		length=12;
		width=5;
		height=3;
		
		int volume;
		volume=length*width*height;
		System.out.println("Volume : "+volume);
		
		int area;
		area=2*length*width+2*length*height+2*width*height;
		System.out.println("Area   : "+area);
		
	}
}

///////////////////////////////////////////////////////////////////////////////////


//-------------------------------Box.java-----------------------------------------
class Box{
	int length;
	int width;
	int height;	
	
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume : "+volume);		
	}
	public void setSize(int l, int h, int w){
		length=l;
		width=w;
		height=h;
	}
	public void printArea(){
		int area;
		area=2*length*width+2*length*height+2*width*height;
		System.out.println("Area   : "+area);		
	}
}

//-----------------------------------Demo.java-----------------------------------
class Demo{
	public static void main(String args[]){
		Box b1=new Box(); //int[] xr= new int[3]
		b1.setSize(12,5,3);
		b1.printVolume();
		b1.printArea();
	}
}

///////////////////////////////////////////////////////////////////////////////////

// Step I (Template, Object, Reference Variable)

class Box{
	int length;
	int width;
	int height;
}

class Demo{
	public static void main(String args[]){
		int[] xr;
		xr=new int[3];
		System.out.println(xr);
		xr[0]=100;
		System.out.println(xr[0]);
		
		Box b1; //Create a reference Variable type Box
		b1=new Box(); //Create an Object type "Box"
		System.out.println(b1);	
		b1.length=100;
		System.out.println(b1.length);	
		
		b1.length=12;
		b1.width=5;
		b1.height=3;
		
		int volume;
		volume=b1.length*b1.width*b1.height;
		System.out.println("Volume : "+volume);
	}
}

///////////////////////////////////////////////////////////////////////////////////

 // Step II (Adding a method) - [Methods, local variable, attributes]

class Box{
	int length; //Attriibute Declarations
	int width;
	int height;
	
	//-----------Method Declaration-----------------
	public void printVolume(){
		int volume; //Local Variable
		volume=length*width*height;
		System.out.println("Volume  : "+volume);
	}
	//---------------------------------------------
}
class Demo{
	public static void main(String args[]){
		Box b1; //Create a reference Variable type Box
		b1=new Box(); //Create an Object type "Box"
		
		b1.length=12;
		b1.width=5;
		b1.height=3;
		
		/*int volume;
		volume=b1.length*b1.width*b1.height;
		System.out.println("Volume : "+volume);*/
		b1.printVolume();
	}
}

///////////////////////////////////////////////////////////////////////////////////

// Step III - Adding a parameterized method 

class Box{
	int length;
	int width;
	int height;
	
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume  : "+volume);
	}
	public void setSize(int l, int w, int h){
		length=l;
		width=w;
		height=h;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box(); 
		b1.setSize(12,5,3);
		b1.printVolume();
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Demo{
	public static void main(String args[]){
		Date d1=new Date();
		d1.setDate(2019,4,6);
		d1.printDate(); //2019-4-6
		
		d1.setYear(1999);
		d1.setMonth(12);
		d1.setDay(31);
		d1.printDate(); //1999-12-31
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Date{
	int year;
	int month;
	int day; 
	
	public void setDate(int y, int m, int d){
		year=y;
		month=m;
		day=d;
	}
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
	public void setYear(int y){
		year=y;
	}
	public void setMonth(int m){
		month=m;
	}
	public void setDay(int d){
		day=d;
	}
}
class Demo{
	public static void main(String args[]){
		Date d1=new Date();
		d1.setDate(2019,4,6);
		d1.printDate(); //2019-4-6
		
		d1.setYear(1999);
		d1.setMonth(12);
		d1.setDay(31);
		d1.printDate(); //1999-12-31
	}
}

///////////////////////////////////////////////////////////////////////////////////

// Step IV

class Box{
	int length;
	int width;
	int height;
	
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume  : "+volume);
	}
	public void setSize(int length, int width, int height){
		length=length;
		width=width;
		height=height;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box(); 
		b1.setSize(12,5,3);
		b1.printVolume();
	}
}

///////////////////////////////////////////////////////////////////////////////////

// Step IV (using "this")

class Box{
	int length;
	int width;
	int height;
	
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume  : "+volume);
	}
	public void setSize(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box(); 
		b1.setSize(12,5,3);
		b1.printVolume();
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int a;
	public void myMethod(){
		System.out.println(this); //this-->pre-defined variable
	}
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		System.out.println(t1);
		t1.myMethod();
		
		System.out.println("================");
		Test t2=new Test();
		System.out.println(t2);
		t2.myMethod();
		
	}
}

///////////////////////////////////////////////////////////////////////////////////

Step V (Null Pointer)
=========================
class Box{
	int length;
	int width;
	int height;
	
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume  : "+volume);
	}
	public void setSize(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=null;
		b1.setSize(12,5,3);
		b1.printVolume();
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int a=100;
	public void myMethod(){
		int a=200;
		System.out.println("local a : "+a);  //200
		System.out.println("test  a : "+a);  //100
	}
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		t1.myMethod();
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int a=100;
	public void myMethod(){
		int a=200;
		System.out.println("local a : "+a);  //200
		System.out.println("test  a : "+this.a);  //100
	}
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		t1.myMethod();
	}
}

///////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setDefaultCloseOperation(2);
		f1.setVisible(true);
		
		JFrame f2=new JFrame();
		f2.setSize(500,400);
		f2.setTitle("Add Customer Form");
		f2.setDefaultCloseOperation(2);
		f2.setVisible(true);
	}
}

///////////////////////////////////////////////////////////////////////////////////

// Step VI - Encapsulation

class Date{
	int year;
	int month;
	int day; 
	
	public void setDate(int y, int m, int d){
		year=y;
		month=m;
		day=d;
	}
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
	public void setYear(int y){
		year=y;
	}
	public void setMonth(int m){
		month=m;
	}
	public void setDay(int d){
		day=d;
	}
}
class Demo{
	public static void main(String args[]){
		Date d1=new Date();
		d1.year=1999;
		d1.month=2;
		d1.day=31;
		d1.printDate();
		
		d1.year=2000;
		d1.month=-13;
		d1.day=32;
		d1.printDate();
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Date{
	private int year;
	private int month;
	private int day; 
	
	public void setDate(int y, int m, int d){
		year=y;
		month=m;
		day=d;
	}
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
	public void setYear(int y){
		year=y;
	}
	public void setMonth(int m){
		month=m;
	}
	public void setDay(int d){
		day=d;
	}
}
class Demo{
	public static void main(String args[]){
		Date d1=new Date();
		d1.year=1999;
		d1.month=2;
		d1.day=31;
		d1.printDate();
		
		d1.year=2000;
		d1.month=-13;
		d1.day=32;
		d1.printDate();
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Date{
	private int year=1970;
	private int month=1;
	private int day=1; 
	
	public void setDate(int y, int m, int d){
		year=y;
		month=m;
		day=d;
	}
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
	public void setYear(int year){ //mutator
		if(year>0){
			this.year=year;
		}
	}
	public void setMonth(int month){
		if(month>=1 && month<=12) {
			this.month=month;
		}
	}
	public void setDay(int day){
		if(day<=31 && day>=1){ //month=1, month=3
			this.day=day;
		}
	}
	public int getYear(){ //
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
}
class Demo{
	public static void main(String args[]){
		Date d1=new Date();
		d1.setYear(-1999);
		d1.printDate();
		
		d1.setMonth(13);
		d1.setDay(32);
		d1.printDate();
		
		System.out.println("Year  : "+d1.getYear());	
		System.out.println("Month : "+d1.getMonth());	
		System.out.println("Day   : "+d1.getDay());	
	}
}

///////////////////////////////////////////////////////////////////////////////////



