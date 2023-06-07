// Step I

package demo;
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        s1.pop();
        s1.printStack(); //[30,20,10]
        
        s1.push(100);
        s1.printStack(); //[100,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step II

package demo;
class Stack{
    
    public void push(int data){
        
    }
    public void printStack(){
        
    }
    public void pop(){
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        s1.pop();
        s1.printStack(); //[30,20,10]
        
        s1.push(100);
        s1.printStack(); //[100,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step III

package demo;
class Stack{
    int a;
    int b;
    int c;
    int d;
    int e;
    
    public void push(int data){
        this.a=data; //wrong logic
    }
    public void printStack(){
        
    }
    public void pop(){
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        s1.pop();
        s1.printStack(); //[30,20,10]
        
        s1.push(100);
        s1.printStack(); //[100,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step IV

package demo;
class Stack{
    int[] dataArray;

    public Stack() {
        dataArray=new int[10];
    }
    
    public void push(int data){

    }
    public void printStack(){
        
    }
    public void pop(){
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        s1.pop();
        s1.printStack(); //[30,20,10]
        
        s1.push(100);
        s1.printStack(); //[100,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step V

package demo;
class Stack{
    int[] dataArray;
    int nextIndex;
    public Stack() {
        dataArray=new int[10];
        nextIndex=0;
    }
    
    public void push(int data){
        dataArray[nextIndex++]=data;
    }
    public void printStack(){
        
    }
    public void pop(){
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        s1.pop();
        s1.printStack(); //[30,20,10]
        
        s1.push(100);
        s1.printStack(); //[100,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step VI

package demo;
class Stack{
    int[] dataArray;
    int nextIndex;
    public Stack() {
        dataArray=new int[10];
        nextIndex=0;
    }
    
    public void push(int data){
        dataArray[nextIndex++]=data;
    }
    public void printStack(){
        System.out.print("[");
        for (int i = nextIndex-1; i >=0 ; i--) {
            System.out.print(dataArray[i]+", ");
        }
        System.out.println("\b\b]");
    }
    public void pop(){
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        s1.pop();
        s1.printStack(); //[30,20,10]
        
        s1.push(100);
        s1.printStack(); //[100,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step VII

package demo;
class Stack{
    int[] dataArray;
    int nextIndex;
    public Stack() {
        dataArray=new int[10];
        nextIndex=0;
    }
    
    public void push(int data){
        dataArray[nextIndex++]=data;
    }
    public void printStack(){
        System.out.print("[");
        for (int i = nextIndex-1; i >=0 ; i--) {
            System.out.print(dataArray[i]+", ");
        }
        System.out.println("\b\b]");
    }
    public void pop(){
        nextIndex--;
    }
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        s1.pop();
        s1.printStack(); //[30,20,10]
        
        s1.push(100);
        s1.printStack(); //[100,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step VIII

package demo;
class Stack{
    int[] dataArray;
    int nextIndex;
    public Stack() {
        dataArray=new int[10];
        nextIndex=0;
    }
    
    public void push(int data){
        dataArray[nextIndex++]=data;
    }
    public void printStack(){
        System.out.print("[");
        for (int i = nextIndex-1; i >=0 ; i--) {
            System.out.print(dataArray[i]+", ");
        }
        System.out.println("\b\b]");
    }
    public void pop(){
        nextIndex--;
    }
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack(5);
        System.out.println("Capacity : "+s1.capacity()); //5
        System.out.println("Size     : "+s1.size()); //0
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        System.out.println("Capacity : "+s1.capacity()); //5
        System.out.println("Size     : "+s1.size()); //5
        
        s1.push(60); //Prints "Stack is full.....
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        System.out.println("Capacity : "+s1.capacity()); //5
        System.out.println("Size     : "+s1.size()); //4
        
        s1.clear();
        System.out.println("Capacity : "+s1.capacity()); //5
        System.out.println("Size     : "+s1.size()); //0
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

class Stack {

    int[] dataArray;
    int nextIndex;

    public Stack(int capacity) {
        dataArray = new int[capacity];
        nextIndex = 0;
    }

    public int capacity() {
        return dataArray.length;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full...");
        } else {
            dataArray[nextIndex++] = data;
        }
    }

    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            nextIndex--;
        }
    }
    public void clear(){
        nextIndex=0;
    }
}

public class Demo {

    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        System.out.println("Capacity : " + s1.capacity()); //5
        System.out.println("Size     : " + s1.size()); //0
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //5
        System.out.println("Size     : " + s1.size()); //5

        s1.push(60); //Prints "Stack is full.....

        s1.pop();
        s1.printStack(); //[40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //5
        System.out.println("Size     : " + s1.size()); //4

        s1.clear();
        System.out.println("Capacity : " + s1.capacity()); //5
        System.out.println("Size     : " + s1.size()); //0
        s1.pop(); //Stack is empty...
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step IX

package demo;

class Stack {

    int[] dataArray;
    int nextIndex;

    public Stack(int capacity) {
        dataArray = new int[capacity];
        nextIndex = 0;
    }

    public int capacity() {
        return dataArray.length;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full...");
        } else {
            dataArray[nextIndex++] = data;
        }
    }

    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            nextIndex--;
        }
    }
    public void clear(){
        nextIndex=0;
    }
}

public class Demo {

    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        System.out.println("Capacity : " + s1.capacity()); //5
        System.out.println("Size     : " + s1.size()); //0
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //5
        System.out.println("Size     : " + s1.size()); //5

        s1.push(60);
        s1.printStack(); //[60,50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //10
        System.out.println("Size     : " + s1.size()); //6
        s1.push(70);
        s1.push(80);
        s1.push(90);
        s1.printStack(); //[90,80,70,60,50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //10
        System.out.println("Size     : " + s1.size()); //9
        
        s1.push(100);
        s1.printStack(); //[100,90,80,70,60,50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //10
        System.out.println("Size     : " + s1.size()); //10
        
        s1.push(200);
        s1.printStack(); //[200,100,90,80,70,60,50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //20
        System.out.println("Size     : " + s1.size()); //11

    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

class Stack {

    int[] dataArray;
    int nextIndex;

    public Stack(int capacity) {
        dataArray = new int[capacity];
        nextIndex = 0;
    }

    public int capacity() {
        return dataArray.length;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void incrementArraysize() {
        int[] temp = new int[dataArray.length * 2];
        for (int i = 0; i < dataArray.length; i++) {
            temp[i] = dataArray[i];
        }
        dataArray = temp;
    }

    public void push(int data) {
        if (isFull()) {
            incrementArraysize();
        }
        dataArray[nextIndex++] = data;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            nextIndex--;
        }
    }

    public void clear() {
        nextIndex = 0;
    }
}

public class Demo {

    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        System.out.println("Capacity : " + s1.capacity()); //5
        System.out.println("Size     : " + s1.size()); //0
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //5
        System.out.println("Size     : " + s1.size()); //5

        s1.push(60);
        s1.printStack(); //[60,50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //10
        System.out.println("Size     : " + s1.size()); //6
        s1.push(70);
        s1.push(80);
        s1.push(90);
        s1.printStack(); //[90,80,70,60,50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //10
        System.out.println("Size     : " + s1.size()); //9

        s1.push(100);
        s1.printStack(); //[100,90,80,70,60,50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //10
        System.out.println("Size     : " + s1.size()); //10

        s1.push(200);
        s1.printStack(); //[200,100,90,80,70,60,50,40,30,20,10]
        System.out.println("Capacity : " + s1.capacity()); //20
        System.out.println("Size     : " + s1.size()); //11

    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step X (Encapsulation)

package demo;

class Stack {

    int[] dataArray;
    int nextIndex;

    public Stack(int capacity) {
        dataArray = new int[capacity];
        nextIndex = 0;
    }

    public int capacity() {
        return dataArray.length;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void incrementArraysize() {
        int[] temp = new int[dataArray.length * 2];
        for (int i = 0; i < dataArray.length; i++) {
            temp[i] = dataArray[i];
        }
        dataArray = temp;
    }

    public void push(int data) {
        if (isFull()) {
            incrementArraysize();
        }
        dataArray[nextIndex++] = data;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            nextIndex--;
        }
    }

    public void clear() {
        nextIndex = 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack(10);
        s1.dataArray[3]=40;
        s1.nextIndex=5;
        s1.printStack();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

class Stack {

    int[] dataArray;
    int nextIndex;

    public Stack(int capacity) {
        dataArray = new int[capacity];
        nextIndex = 0;
    }

    public int capacity() {
        return dataArray.length;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void incrementArraysize() {
        int[] temp = new int[dataArray.length * 2];
        for (int i = 0; i < dataArray.length; i++) {
            temp[i] = dataArray[i];
        }
        dataArray = temp;
    }

    public void push(int data) {
        if (isFull()) {
            incrementArraysize();
        }
        dataArray[nextIndex++] = data;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            nextIndex--;
        }
    }

    public void clear() {
        nextIndex = 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack(10);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack();
        s1.nextIndex=12;
        s1.printStack(); //Runtime error
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

class Stack {

    int[] dataArray;
    int nextIndex;

    public Stack(int capacity) {
        dataArray = new int[capacity];
        nextIndex = 0;
    }

    public int capacity() {
        return dataArray.length;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void incrementArraysize() {
        int[] temp = new int[dataArray.length * 2];
        for (int i = 0; i < dataArray.length; i++) {
            temp[i] = dataArray[i];
        }
        dataArray = temp;
    }

    public void push(int data) {
        if (isFull()) {
            incrementArraysize();
        }
        dataArray[nextIndex++] = data;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            nextIndex--;
        }
    }

    public void clear() {
        nextIndex = 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack();
        System.out.println("Stack is full : "+s1.isFull()); //?
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

class Stack {

    int[] dataArray;
    int nextIndex;

    public Stack(int capacity) {
        dataArray = new int[capacity];
        nextIndex = 0;
    }

    public int capacity() {
        return dataArray.length;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isFull() {
        return size() == capacity();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void incrementArraysize() {
        int[] temp = new int[dataArray.length * 2];
        for (int i = 0; i < dataArray.length; i++) {
            temp[i] = dataArray[i];
        }
        dataArray = temp;
    }

    public void push(int data) {
        if (isFull()) {
            incrementArraysize();
        }
        dataArray[nextIndex++] = data;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            nextIndex--;
        }
    }

    public void clear() {
        nextIndex = 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack(5);
        s1.incrementArraysize();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("capacity : "+s1.capacity());
        
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// (Using encapsulatyion)

package demo;

class Stack {

    private int[] dataArray;
    private int nextIndex;

    public Stack(int capacity) {
        dataArray = new int[capacity];
        nextIndex = 0;
    }

    public int capacity() {
        return dataArray.length;
    }

    public int size() {
        return nextIndex;
    }

    private boolean isFull() {
        return size() == capacity();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private void incrementArraysize() {
        int[] temp = new int[dataArray.length * 2];
        for (int i = 0; i < dataArray.length; i++) {
            temp[i] = dataArray[i];
        }
        dataArray = temp;
    }

    public void push(int data) {
        if (isFull()) {
            incrementArraysize();
        }
        dataArray[nextIndex++] = data;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = nextIndex - 1; i >= 0; i--) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty..");
        } else {
            nextIndex--;
        }
    }

    public void clear() {
        nextIndex = 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack(10);
        s1.dataArray[3]=40; //Illegal
        s1.nextIndex=5; //Illegal
        s1.printStack();        
        
        System.out.println("Stack is full : "+s1.isFull()); //Illegal
        s1.incrementArraysize(); //Illegal
    }
}

//////////////////////////////////////////////////////////////////////////////////////

// Step I

package demo;
public class Demo {
    public static void main(String[] args) {
        Queue q1=new Queue(5);
        q1.enQueue(10); //s1.push(int)
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.printQueue(); //[10,20,30,40,50];
        
        q1.deQueue(); //s1.pop()
        q1.printQueue(); //[20,30,40,50];
        
        q1.deQueue();
        q1.printQueue(); //[30,40,50];
        
        System.out.println("Capacity : "+q1.capacity()); //5
        System.out.println("Size     : "+q1.size());//3
        
        q1.enQueue(60);
        q1.enQueue(70);
        q1.printQueue(); //[30,40,50,60,70];
        System.out.println("Capacity : "+q1.capacity()); //5
        System.out.println("Size     : "+q1.size());//5
        
        
        q1.enQueue(80);
        q1.printQueue(); //[30,40,50,60,70,80];
        System.out.println("Capacity : "+q1.capacity()); //10
        System.out.println("Size     : "+q1.size());//6

    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Queue{
    private int[] dataArray;
    private int nextIndex;

    public Queue(int capacity) {
        dataArray=new int[capacity];
        nextIndex=0;
    }
    public int size(){
        return nextIndex;
    }
    public int capacity(){
        return dataArray.length;
    }
    private boolean isFull(){
        return size()==capacity();
    }
    private boolean isEmpty(){
        return size()==0;
    }
    private void incrementArraySize(){
        int[] temp=new int[dataArray.length*2];
        for (int i = 0; i < dataArray.length; i++) {
            temp[i]=dataArray[i];
        }
        dataArray=temp;
    }
    public void enQueue(int data){
        if(isFull()){
            incrementArraySize();
        }
        dataArray[nextIndex++]=data;
    }
    public void printQueue(){
        System.out.print("[");
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(dataArray[i]+", ");
        }
        System.out.println("\b\b]");
    }
    public void deQueue(){
        if(!isEmpty()){
            for (int i = 0; i < nextIndex-1 ; i++) {
                dataArray[i]=dataArray[i+1];
            }
            nextIndex--;
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Queue q1=new Queue(5);
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.printQueue(); //[10,20,30,40,50];
        
        q1.deQueue();
        q1.printQueue(); //[20,30,40,50];
        
        q1.deQueue();
        q1.printQueue(); //[30,40,50];
        
        System.out.println("Capacity : "+q1.capacity()); //5
        System.out.println("Size     : "+q1.size());//3
        
        q1.enQueue(60);
        q1.enQueue(70);
        q1.printQueue(); //[30,40,50,60,70];
        System.out.println("Capacity : "+q1.capacity()); //5
        System.out.println("Size     : "+q1.size());//5
        
        
        q1.enQueue(80);
        q1.printQueue(); //[30,40,50,60,70,80];
        System.out.println("Capacity : "+q1.capacity()); //10
        System.out.println("Size     : "+q1.size());//6

    }
}

//////////////////////////////////////////////////////////////////////////////////////	
	Class "List"
//////////////////////////////////////////////////////////////////////////////////////

package demo;
public class Demo {
    public static void main(String[] args) {
        List list=new List(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.printList(); //[10,20,30,40,50]
        
        list.remove(2); //public void remove(int index)
        list.printList(); //[10,20,40,50]
        
        list.add(2,300);//public void remove(int index,int data)
        list.printList(); //[10,20,300,40,50]
        
        list.add(6,111); //Runtime error=>Prints "out of bounds"
        
        list.set(2,500);
        list.printList(); //[10,20,500,40,50]
        
        list.add(new int[]{1,2,3});
        list.printList(); //[10,20,500,40,50,1,2,3]
        
        list.add(2,new int[]{100,200,300});
        list.printList(); //[10,20,100,200,300,500,40,50,1,2,3]
        
        list.remove(2,5); //public void remove(int start, int end)
        list.printList(); //[10,20,40,50,1,2,3]
    }
}



//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Customer{
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public void printCustomer(){
        System.out.println(code+" : "+name);
    }
}
public class Demo {
    public static void main(String[] args) {
        Customer c1;
        c1=new Customer(1001,"Danapala");
        c1.printCustomer();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Box{
    int length;
    Box box;
    
}

public class Demo {
    public static void main(String[] args) {
        Box b1=new Box();
        b1.length=100;
        b1.box=new Box();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Customer{
    int code;
    String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public void printCustomer(){
        System.out.println(code+" : "+name);
    }
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1002,"Gunapala");
        c1=c2;
        c1.code=1111;
        c2.printCustomer();
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;
class Customer{
    int code;
    String name;
    Customer next;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
    public void printCustomer(){
        System.out.println(code+" : "+name);
    }
}
public class Demo {
    public static void main(String[] args) {
        Customer c1=new Customer(1001,"Danapala");
        Customer c2=new Customer(1002,"Gunapala");
        Customer c3=new Customer(1003,"Somapala");
        c1.next=c2;
        c2.next=c3;
        c3.next=c1;
        
        c1.next.next.printCustomer();
        c2.next.next.printCustomer();
        c3.next.printCustomer();
        
    }
}

//////////////////////////////////////////////////////////////////////////////////////

package demo;

class Customer {

    int code;
    String name;
    Customer next;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void printCustomer() {
        System.out.println(code + " : " + name);
    }
}

public class Demo {

    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Danapala");
        c1.next = new Customer(1002, "Gunapala");
        c1.next.next = new Customer(1003, "Somapala");
        c1.next.next.next = c1;
        c1.printCustomer();
        c1.next.printCustomer();
        c1.next.next.printCustomer();
        c1.next.next.next.next.printCustomer();
    }
}


//////////////////////////////////////////////////////////////////////////////////////
	Linked List, Queue, Stack
//////////////////////////////////////////////////////////////////////////////////////
// Class "Stack"

package demo;


public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step I

package demo;
class Stack{
    public void push(int data){
        
    }
    public void pop(){
        
    }
    public void printStack(){
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step II

package demo;
class Stack{
    Node top;
    public void push(int data){
        //
    }
    public void pop(){
        //
    }
    public void printStack(){
        //
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step III

package demo;
class Stack{
    Node top;
    public void push(int data){
        Node d1=new Node(data);
        d1.next=top;
        top=d1;
    }
    public void pop(){
        //
    }
    public void printStack(){
        //
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        s1.push(60);
        s1.pop();
        s1.printStack(); //[40,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step IV

package demo;
class Stack{
    Node top;
    public void push(int data){
        Node d1=new Node(data);
        d1.next=top;
        top=d1;
    }
    public void pop(){
        //
    }
    public void printStack(){
        System.out.print("[");
        while(top!=null){
            System.out.print(top.data+", ");
            top=top.next;
        }
        System.out.println("\b\b]");
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        s1.printStack(); //[50,40,30,20,10]
        //s1.push(60);
        //s1.pop();
        //s1.printStack(); //[40,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step V

package demo;
class Stack{
    Node top;
    public void push(int data){
        Node d1=new Node(data);
        d1.next=top;
        top=d1;
    }
    public void pop(){
        //
    }
    public void printStack(){
        System.out.print("[");
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        s1.printStack(); //[50,40,30,20,10]
        //s1.push(60);
        //s1.pop();
        //s1.printStack(); //[40,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step VI

package demo;
class Stack{
    Node top;
    public void push(int data){
        Node d1=new Node(data);
        d1.next=top;
        top=d1;
    }
    public void pop(){
        if(top!=null){
            top=top.next;
        }
    }
    public void printStack(){
        System.out.print("[");
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        s1.printStack(); //[50,40,30,20,10]
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step VII

package demo;
class Stack{
    Node top;
    public void push(int data){
        Node d1=new Node(data);
        d1.next=top;
        top=d1;
    }
    public void pop(){
        if(top!=null){
            top=top.next;
        }
    }
    public void printStack(){
        System.out.print("[");
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        System.out.println("Size : "+s1.size());//5
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        System.out.println("Size : "+s1.size());//4
        
        s1.clear();
        System.out.println("Size : "+s1.size());//0
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// From Q83

package demo;
class Stack{
    Node top;
    public void push(int data){
        Node d1=new Node(data);
        d1.next=top;
        top=d1;
    }
    public void pop(){
        if(top!=null){
            top=top.next;
        }
    }
    public void printStack(){
        System.out.print("[");
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
    public int size(){
        int count=0;
        Node temp=top;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void clear(){
        top=null;
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
    
}
public class Demo {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        System.out.println("Size : "+s1.size());//5
        
        s1.pop();
        s1.printStack(); //[40,30,20,10]
        System.out.println("Size : "+s1.size());//4
        
        s1.clear();
        System.out.println("Size : "+s1.size());//0
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step VIII (With Encapsulation)

package demo;

class Stack {

    private Node top;

    public void push(int data) {
        Node d1 = new Node(data);
        d1.next = top;
        top = d1;
    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }

    public void printStack() {
        System.out.print("[");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }

    public int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void clear() {
        top = null;
    }
    //------start inner class Node-------------------------
    class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }//------end inner class Node-------------------------
    
}//------end class Stack-----------------------------

public class Demo {

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.printStack(); //[50,40,30,20,10]
        System.out.println("Size : " + s1.size());//5

        s1.pop();
        s1.printStack(); //[40,30,20,10]
        System.out.println("Size : " + s1.size());//4

        s1.clear();
        System.out.println("Size : " + s1.size());//0
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Class "Queue"

package demo;

public class Demo {
    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.printQueue(); //[10,20,30,40,50]
        
        q1.deQueue();
        q1.printQueue(); //[20,30,40,50]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step I

package demo;
class Queue{
    private Node front;
    
    public void enQueue(int data){
        
    }
    public void deQueue(){
        
    }
    public void printQueue(){
        
    }
    private class Node{
        private int code;
        private Node next;

        public Node(int code) {
            this.code = code;
        }
        
    }
}
public class Demo {
    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.printQueue(); //[10,20,30,40,50]
        
        q1.deQueue();
        q1.printQueue(); //[20,30,40,50]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// Step II

package demo;

class Queue {

    private Node front;

    public void enQueue(int data) {
        Node d1 = new Node(data);
        if (front == null) {
            front = d1;
        } else {
            Node temp = front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = d1;

        }
    }

    public void deQueue() {
        if(front!=null){
            front=front.next;
        }
    }

    public void printQueue() {
        System.out.print("[");
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.code+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }

    private class Node {

        private int code;
        private Node next;

        public Node(int code) {
            this.code = code;
        }

    }
}

public class Demo {

    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.printQueue(); //[10,20,30,40,50]

        q1.deQueue();
        q1.printQueue(); //[20,30,40,50]
    }
}

//////////////////////////////////////////////////////////////////////////////////////
