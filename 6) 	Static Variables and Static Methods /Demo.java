class Test{
	int x;
	int y;
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		t1.x=1;
		t1.y=2;
		Test t2=new Test();
		t2.x=10;
		t2.y=20;
		Test t3=new Test();
		t3.x=100;
		t3.y=200;
		
		System.out.println("t1 : "+t1.x+" "+t1.y); //1 2
		System.out.println("t2 : "+t2.x+" "+t2.y); //10 20
		System.out.println("t3 : "+t3.x+" "+t3.y); //100 200
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int x;
	static int y;
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		t1.x=1;
		t1.y=2;
		Test t2=new Test();
		t2.x=10;
		t2.y=20;
		Test t3=new Test();
		t3.x=100;
		t3.y=200;
		
		System.out.println("t1 : "+t1.x+" "+t1.y); //1 200
		System.out.println("t2 : "+t2.x+" "+t2.y); //10 200
		System.out.println("t3 : "+t3.x+" "+t3.y); //100 200
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int x;
	static int y;
}
class Demo{
	public static void main(String args[]){
		Test t1=new Test();
		t1.x=1;
		t1.y=2;
		Test t2=new Test();
		t2.x=10;
		t2.y=20;
		Test t3=new Test();
		t3.x=100;
		t3.y=200;
		
		System.out.println("t1 : "+t1.x+" "+t1.y); //1 200
		System.out.println("t2 : "+t2.x+" "+t2.y); //10 200
		System.out.println("t3 : "+t3.x+" "+t3.y); //100 200
		
		Test.y=1111;
		System.out.println("t1 : "+t1.x+" "+t1.y); //1 1111
		System.out.println("t2 : "+t2.x+" "+t2.y); //10 1111
		System.out.println("t3 : "+t3.x+" "+t3.y); //100 1111
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Test{
	int x;
	static int y;
}
class Demo{
	public static void main(String args[]){
		//Test.x=1000; //Illegal
		Test.y=2000; //Legal
		
		Test t1=new Test();
		t1.x=100; //Legal
		t1.y=200; //Legal
	}
}

///////////////////////////////////////////////////////////////////////////////////




