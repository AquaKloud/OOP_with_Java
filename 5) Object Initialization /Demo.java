
class Box{
	int length;
	int width;
	int height;
	/* Compiler inserts
	Box(){
		length=0;
		width=0;
		height=0;
	}
	*/
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
		b1.printVolume();
		System.out.println("length : "+b1.length);
		System.out.println("width  : "+b1.width);
		System.out.println("height : "+b1.height);
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Box{
	int length;
	int width;
	int height;
	//-------------Constructor Declaration---------------
	Box(){
		length=1;
		width=1;
		height=1;
		System.out.println("Calling Constructor Box()....");
	}
	//------------------------------------------------------
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
		Box b1=new Box(); //"Box()"--->Calling constructor
		b1.printVolume();
		System.out.println("length : "+b1.length);
		System.out.println("width  : "+b1.width);
		System.out.println("height : "+b1.height);
	}
}

///////////////////////////////////////////////////////////////////////////////////

// Parameterized Constructor

class Box{
	int length;
	int width;
	int height;
	//-------------Constructor Declaration---------------
	Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	//------------------------------------------------------
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
		//Box b1=new Box();//Illegal
		Box b1=new Box(12,5,3);
		b1.printVolume();
		System.out.println("length : "+b1.length);
		System.out.println("width  : "+b1.width);
		System.out.println("height : "+b1.height);
	}
}

///////////////////////////////////////////////////////////////////////////////////

// Constructor Overloading

class Box{
	int length;
	int width;
	int height;
	//-------------Constructor Declaration---------------
	Box(){
		this.length=1;
		this.width=1;
		this.height=1;
	}
	Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	Box(int length){
		this.length=length;
		this.width=length;
		this.height=length;
	}
	//------------------------------------------------------
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
		Box b2=new Box(10);
		Box b3=new Box(12,5,3);
		b1.printVolume();
		b2.printVolume();
		b3.printVolume();
		
	}
}

///////////////////////////////////////////////////////////////////////////////////

// Declaration Values

class Box{
	int length=10;
	int width=10;
	int height=10;
	
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume  : "+volume);
	}
}
class Demo{
	public static void main(String args[]){
		Box b1=new Box();
		b1.printVolume();
		System.out.println("length : "+b1.length);
		System.out.println("width  : "+b1.width);
		System.out.println("height : "+b1.height);		
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int a=111;
	Test(int a){
		
	}
	Test(){
		a=200;
	}
	Test(int i, int j){
		a=400;
		a=i;
		a=j;
	}
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		System.out.println(t1.a);
		
		Test t2=new Test(100);
		System.out.println(t2.a);
		
		Test t3=new Test(10,20);
		System.out.println(t3.a);
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int a;
	a=111; //Illegal
	
}
 
///////////////////////////////////////////////////////////////////////////////////

// Instance Blocks

class Test{
	int a;
	//a=111; //Illegal
	{
		a=111;
		System.out.println("Instance block...");
	}
	Test(){
		System.out.println("Test()");
	}	
	Test(int i){
		System.out.println("Test(int)");
	}	
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		Test t2=new Test(100);
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int a=10;
	{
		a=30;
	}
	Test(){
		
	}
	Test(int i){
		a=i;
	}	
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		System.out.println(t1.a);
		
		Test t2=new Test(100);
		System.out.println(t2.a);
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	{
		a=30;
	}
	Test(){
		
	}
	Test(int i){
		a=i;
	}	
	int a=10;
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		System.out.println(t1.a);
		
		Test t2=new Test(100);
		System.out.println(t2.a);
	}
}

///////////////////////////////////////////////////////////////////////////////////





