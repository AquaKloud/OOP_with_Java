class Demo{
	static int x=100;
	public static void increment(){
		x++;
	}
	public static void printX(){
		System.out.println(x); //Legal
	}
	
	public static void main(String args[]){
		System.out.println(x);	
		increment();
		System.out.println(x);	
		printX();
		increment();
		printX();
	}
}

///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int x=100;
	public static int[] xr=new int[4];
	public static void readMarks(){
		Random r=new Random();
		for (int i = 0; i < xr.length; i++){
			xr[i]=r.nextInt(101);
		}
	}
	public static void printMarks(){
		System.out.print("[");
		for (int i = 0; i < xr.length; i++){
			System.out.print(xr[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void main(String args[]){
		readMarks();
		printMarks();
	}
}

///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int[] stack=new int[10];
	
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		pop();
		printStack(); //[40,30,20,10]
		
		pop();
		printStack(); //[30,20,10]
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int nextPos=0;
	public static int[] stack=new int[10];
	public static void push(int data){
		stack[nextPos++]=data;
	}	
	public static void printStack(){
		System.out.print("[");
		for (int i = nextPos-1; i >=0 ; i--){
			System.out.print(stack[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		//pop();
		printStack(); //[40,30,20,10]
		
		//pop();
		printStack(); //[30,20,10]
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

// Adding method "public static void pop()"

import java.util.*;
class Demo{
	public static int nextPos=0;
	public static int[] stack=new int[10];
	public static void push(int data){
		stack[nextPos++]=data;
	}	
	public static void printStack(){
		System.out.print("[");
		for (int i = nextPos-1; i >=0 ; i--){
			System.out.print(stack[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void pop(){
		nextPos--;
	}
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		pop();
		printStack(); //[40,30,20,10]
		
		pop();
		printStack(); //[30,20,10]
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

// using "currentPos"

import java.util.*;
class Demo{
	public static int currentPos=-1;
	public static int[] stack=new int[10];
	
	public static void push(int data){
		
	}	
	public static void printStack(){
		
	}
	public static void pop(){
		
	}
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		pop();
		printStack(); //[40,30,20,10]
		
		pop();
		printStack(); //[30,20,10]
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int currentPos=-1;
	public static int[] stack=new int[10];
	
	public static void push(int data){
		stack[++currentPos]=data;
	}	
	public static void printStack(){
		System.out.print("[");
		for (int i = currentPos; i >=0 ; i--){
			System.out.print(stack[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void pop(){
		currentPos--;
	}
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		pop();
		printStack(); //[40,30,20,10]
		
		pop();
		printStack(); //[30,20,10]
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int currentPos=-1;
	public static int[] stack=new int[10];
	
	public static void push(int data){
		stack[++currentPos]=data;
	}	
	public static void printStack(){
		System.out.print("[");
		for (int i = currentPos; i >=0 ; i--){
			System.out.print(stack[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void pop(){
		currentPos--;
	}
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		System.out.println("Size : "+size()); //5
		System.out.println("Total : "+total());
		System.out.println("Max   : "+max());
		System.out.println("Min   : "+min());
		push(new int[]{60,70,80,90,100});
		
		printStack(); //[100,90,80,70,60,50,40,30,20,10]
		System.out.println("Size : "+size()); //10
		
		push(99); //Prints "Stack is full....."
		
		clear();
		System.out.println("Size : "+size()); //0
		
		pop(); //Prints "Stack is empty..."
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int currentPos=-1;
	public static int[] stack=new int[10];
	
	public static void push(int data){
		if(currentPos>=stack.length-1){
			System.out.println("Stack is full....");
		}else{
			stack[++currentPos]=data;
		}
	}	
	public static void push(int[] data){
		for(int i=0; i<data.length; i++){
			push(data[i]);
		}
	}	
	public static void printStack(){
		System.out.print("[");
		for (int i = currentPos; i >=0 ; i--){
			System.out.print(stack[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void pop(){
		if(currentPos<=-1){
			System.out.println("Stack is empty...");
		}else{
			currentPos--;
		}
	}
	public static void clear(){
		currentPos=-1;
	}
	public static int size(){
		return currentPos+1;
	}
	public static int total(){
		int tot=0;
		for (int i = 0; i <=currentPos; i++){
			tot+=stack[i];
		}
		return tot;
	}
	public static int max(){
		int max=stack[0];
		for (int i = 0; i <=currentPos; i++){
			if(stack[i]>max){
				max=stack[i];
			}
		}
		return max;
	}
	public static int min(){
		int min=stack[0];
		for (int i = 0; i <=currentPos; i++){
			if(stack[i]<min){
				min=stack[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		System.out.println("Size : "+size()); //5
		System.out.println("Total : "+total());
		System.out.println("Max   : "+max());
		System.out.println("Min   : "+min());
		push(new int[]{60,70,80,90,100});
		
		printStack(); //[100,90,80,70,60,50,40,30,20,10]
		System.out.println("Size : "+size()); //10
		
		push(99); //Prints "Stack is full....."
		
		clear();
		System.out.println("Size : "+size()); //0
		
		pop(); //Prints "Stack is empty..."
	}
}

///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int currentPos=-1;
	public static int[] stack=new int[10];
	
	public static void push(int data){
		//
		//
		//
	}	
	public static void push(int[] data){
		for(int i=0; i<data.length; i++){
			push(data[i]);
		}
	}	
	public static void printStack(){
		System.out.print("[");
		for (int i = currentPos; i >=0 ; i--){
			System.out.print(stack[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void pop(){
		if(currentPos<=-1){
			System.out.println("Stack is empty...");
		}else{
			currentPos--;
		}
	}
	public static void clear(){
		currentPos=-1;
	}
	public static int size(){
		return currentPos+1;
	}
	public static int total(){
		int tot=0;
		for (int i = 0; i <=currentPos; i++){
			tot+=stack[i];
		}
		return tot;
	}
	public static int max(){
		int max=stack[0];
		for (int i = 0; i <=currentPos; i++){
			if(stack[i]>max){
				max=stack[i];
			}
		}
		return max;
	}
	public static int min(){
		int min=stack[0];
		for (int i = 0; i <=currentPos; i++){
			if(stack[i]<min){
				min=stack[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		System.out.println("Size : "+size()); //5
		System.out.println("Capacity  : "+capacity()); //10
		System.out.println("Total : "+total());
		System.out.println("Max   : "+max());
		System.out.println("Min   : "+min());
		push(new int[]{60,70,80,90,100});
		
		printStack(); //[100,90,80,70,60,50,40,30,20,10]
		System.out.println("Size : "+size()); //10
		
		push(99); //
		System.out.println("Size : "+size()); //6
		System.out.println("Capacity  : "+capacity()); //15
		
		clear();
		System.out.println("Size : "+size()); //0
		
		pop(); //Prints "Stack is empty..."
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int currentPos=-1;
	public static int[] stack=new int[10];
	
	public static int capacity(){
		return stack.length;
	}
	public static void push(int data){
		if(size()>=capacity()){
			int[] newStack=new int[stack.length+stack.length/2];
			for (int i = 0; i <= currentPos; i++){
				newStack[i]=stack[i];
			}
			stack=newStack;
		}
		stack[++currentPos]=data;
	}	
	public static void push(int[] data){
		for(int i=0; i<data.length; i++){
			push(data[i]);
		}
	}	
	public static void printStack(){
		System.out.print("[");
		for (int i = currentPos; i >=0 ; i--){
			System.out.print(stack[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void pop(){
		if(currentPos<=-1){
			System.out.println("Stack is empty...");
		}else{
			currentPos--;
		}
	}
	public static void clear(){
		currentPos=-1;
	}
	public static int size(){
		return currentPos+1;
	}
	public static int total(){
		int tot=0;
		for (int i = 0; i <=currentPos; i++){
			tot+=stack[i];
		}
		return tot;
	}
	public static int max(){
		int max=stack[0];
		for (int i = 0; i <=currentPos; i++){
			if(stack[i]>max){
				max=stack[i];
			}
		}
		return max;
	}
	public static int min(){
		int min=stack[0];
		for (int i = 0; i <=currentPos; i++){
			if(stack[i]<min){
				min=stack[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		printStack(); //[50,40,30,20,10]
		System.out.println("Size : "+size()); //5
		System.out.println("Capacity  : "+capacity()); //10
		System.out.println("Total : "+total());
		System.out.println("Max   : "+max());
		System.out.println("Min   : "+min());
		push(new int[]{60,70,80,90,100});
		
		printStack(); //[100,90,80,70,60,50,40,30,20,10]
		System.out.println("Size : "+size()); //10
		
		push(99); //
		printStack();
		System.out.println("Size : "+size()); //6
		System.out.println("Capacity  : "+capacity()); //15
	}
}

///////////////////////////////////////////////////////////////////////////////////
