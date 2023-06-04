import java.util.*;
class Demo{
	public static int nextPos=0;
	public static int[] queue=new int[10];
	
	public static void main(String args[]){
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		printQueue(); //[10,20,30,40]
		
		deQueue();
		printQueue(); //[20,30,40]
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int nextPos=0;
	public static int[] queue=new int[10];
	
	public static void enQueue(int data){
		queue[nextPos++]=data;
	}
	public static void printQueue(){
		System.out.print("[");
		for (int i = 0; i < nextPos; i++){
			System.out.print(queue[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void deQueue(){
		for (int i = 0; i < nextPos; i++){
			queue[i]=queue[i+1];
		}
		nextPos--;	
	}
	public static void main(String args[]){
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		printQueue(); //[10,20,30,40]
		
		deQueue();
		printQueue(); //[20,30,40]
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int nextPos=0;
	public static int[] queue=new int[10];
	
	public static void enQueue(int data){
		queue[nextPos++]=data;
	}
	public static void printQueue(){
		System.out.print("[");
		for (int i = 0; i < nextPos; i++){
			System.out.print(queue[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void deQueue(){
		for (int i = 0; i < nextPos; i++){
			queue[i]=queue[i+1];
		}
		nextPos--;	
	}
	public static void main(String args[]){
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		printQueue(); //[10,20,30,40]
		System.out.println("Size     : "+size()); //4
		System.out.println("Capacity : "+capacity()); //10
		
		enQueue(new int[]{50,60,70,80,90,100});
		
		printQueue(); //[10,20,30,40,50,60,70,80,90,100]
		System.out.println("Size     : "+size()); //10
		System.out.println("Capacity : "+capacity()); //10
		
		enQueue(110);
		printQueue(); //[10,20,30,40,50,60,70,80,90,100,110]
		System.out.println("Size     : "+size()); //11
		System.out.println("Capacity : "+capacity()); //15
		
		deQueue();
		deQueue();
		printQueue(); //[30,40,50,60,70,80,90,100,110]
		
		clear();
		System.out.println("Size     : "+size()); //0
		System.out.println("Capacity : "+capacity()); //15
		
		deQueue(); //Print "Queue is empty..."
	}
}
	
///////////////////////////////////////////////////////////////////////////////////

import java.util.*;
class Demo{
	public static int nextPos=0;
	public static int[] queue=new int[10];
	
	public static int capacity(){
		return queue.length;		
	}
	public static int size(){
		return nextPos;
	}
	public static void enQueue(int[] data){
		for (int i = 0; i < data.length; i++){
			enQueue(data[i]);
		}
	}
	public static void enQueue(int data){
		if(size()>=capacity()){
			int[] newQueue=new int[capacity()+capacity()/2];
			for (int i = 0; i < nextPos; i++){
				newQueue[i]=queue[i];
			}
			queue=newQueue;
		}
		queue[nextPos++]=data;
	}
	public static void printQueue(){
		System.out.print("[");
		for (int i = 0; i < nextPos; i++){
			System.out.print(queue[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void deQueue(){
		if(size()<=0){
			System.out.println("Queue is empty...");
		}else{
			for (int i = 0; i < nextPos; i++){
				queue[i]=queue[i+1];
			}
			nextPos--;	
		}
	}
	public static void clear(){
		nextPos=0;
	}
	public static void main(String args[]){
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		printQueue(); //[10,20,30,40]
		System.out.println("Size     : "+size()); //4
		System.out.println("Capacity : "+capacity()); //10
		
		enQueue(new int[]{50,60,70,80,90,100});
		
		printQueue(); //[10,20,30,40,50,60,70,80,90,100]
		System.out.println("Size     : "+size()); //10
		System.out.println("Capacity : "+capacity()); //10
		
		enQueue(110);
		printQueue(); //[10,20,30,40,50,60,70,80,90,100,110]
		System.out.println("Size     : "+size()); //11
		System.out.println("Capacity : "+capacity()); //15
		
		deQueue();
		deQueue();
		printQueue(); //[30,40,50,60,70,80,90,100,110]
		
		clear();
		System.out.println("Size     : "+size()); //0
		System.out.println("Capacity : "+capacity()); //15
		
		deQueue(); //Print "Queue is empty..."
	}
}

///////////////////////////////////////////////////////////////////////////////////

