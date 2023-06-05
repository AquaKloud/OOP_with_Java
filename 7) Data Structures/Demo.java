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
