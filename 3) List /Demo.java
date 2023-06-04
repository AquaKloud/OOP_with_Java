import java.util.*;
class Demo{
	public static int nextPos=0;
	public static int[] list=new int[10];
	
	public static int capacity(){
		return queue.length;		
	}
	public static int size(){
		return nextPos;
	}
	public static void printList(){
		System.out.print("[");
		for (int i = 0; i < nextPos; i++){
			System.out.print(queue[i]+", ");
		}
		System.out.println("\b\b]");
	}
	public static void clear(){
		nextPos=0;
	}
	public static void main(String args[]){
		add(10);
		add(20);
		add(30);
		add(40);
		
		printList(); //[10,20,30,40]
		System.out.println("Size    : "+size()); //4
		System.out.println("Capacity: "+capacity()); //10
		
		add(2,22);
		printList(); //[10,20,22,30,40]
		
		add(new int[]{1,2,3,4,5});
		
		printList(); //[10,20,22,30,40,1,2,3,4,5]
		System.out.println("Size    : "+size()); //10
		System.out.println("Capacity: "+capacity()); //10
		
		add(99);
		printList(); //[10,20,22,30,40,1,2,3,4,5,99]
		System.out.println("Size    : "+size()); //11
		System.out.println("Capacity: "+capacity()); //15
		
		remove();
		printList(); //[10,20,22,30,40,1,2,3,4,5]
		System.out.println("Size    : "+size()); //10
		System.out.println("Capacity: "+capacity()); //15
		
		add(5,new int[]{100,200,300,400});
		
		printList(); //[10,20,22,30,40,100,200,300,400,1,2,3,4,5]
		System.out.println("Size    : "+size()); //14
		System.out.println("Capacity: "+capacity()); //15
		
		remove(2);	
		printList(); //[10,20,30,40,100,200,300,400,1,2,3,4,5]
		System.out.println("Size    : "+size()); //13
		System.out.println("Capacity: "+capacity()); //15
		
		remove(4,7);	
		printList(); //[10,20,30,40,1,2,3,4,5]
		System.out.println("Size    : "+size()); //9
		System.out.println("Capacity: "+capacity()); //15
		
		set(4,111);
		printList(); //[10,20,30,40,111,2,3,4,5]
		System.out.println("Size    : "+size()); //9
		System.out.println("Capacity: "+capacity()); //15
		
		set(2,5,new int[]{11,22,33,44,55});
		printList(); //[10,20,11,22,33,44,55,3,4,5]
		System.out.println("Size    : "+size()); //10
		System.out.println("Capacity: "+capacity()); //15
		
		clear();
		printList(); //[empty]
		System.out.println("Size    : "+size()); //0
		System.out.println("Capacity: "+capacity()); //15
	}
}
