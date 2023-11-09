
import java.util.*;

public class QueueList {
	
	private Stack<Integer> myStack1;
	private Stack<Integer> myStack2;
	private int count;
	
	public QueueList() {
		
		myStack1 = new Stack<>();
		myStack2 = new Stack<>();
		count = 0;
	}
	
	public void enqueue(Integer a) {
		
		while(!myStack1.empty()) {
			
			myStack2.push(myStack1.pop());
		}
		
		myStack1.push(a);
		count++;
		
		while(!myStack2.empty()) {
			
			myStack1.push(myStack2.pop());
		}
		
	}
	
	public Integer dequeue() throws Exception{
		
		int value;
		
		if(count == 0) {
			
			throw new Exception("The queue is empty");
		}
		
		while(!myStack2.empty()) {
			
			myStack1.push(myStack2.pop());
		}
		
		value = (myStack1.pop());
		count--;
		
		while(!myStack1.empty()) {
			
			myStack2.push(myStack1.pop());
		}
		
		return value;
	}
	
	public Integer getFront() throws Exception {
		
		int value;
		
		if(count == 0) {
			
			throw new Exception("The queue is empty");
		}
		
		while(!myStack2.empty()) {
			
			myStack1.push(myStack2.pop());
		}
		
		value = (myStack1.peek());
		
		while(!myStack1.empty()) {
			
			myStack2.push(myStack1.pop());
		}
		
		return value;
	}
	
	public boolean isEmpty() {
		
		if(count == 0) {
			
			return true;
		}
		
		return false;
	}
	
	public int size() {
		
		return count;
	}
	
	public void clear() {
		
		while(!myStack2.empty()) {
			
			myStack2.pop();
			count--;
		}
	}
	
	
	public void display() throws Exception{
		
		if(count == 0) {
			
			throw new Exception();
		}
		
		while(!myStack1.empty()) {
			
			// print next in queue
			System.out.println(myStack1.peek() + " ");
			
			// move values to stack 2
			myStack2.push(myStack1.pop());
		}
		
		while(!myStack1.empty()) {
			
			// move values back to stack 1
			myStack1.push(myStack2.pop());
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		QueueList myQueue = new QueueList();
		
		myQueue.enqueue(1);
		myQueue.enqueue(2);
		myQueue.enqueue(3);

		try {
			
			myQueue.display();
			System.out.println();	
		}
		catch(Exception e) {
			
			System.out.println("The queue is empty");
		}
		
		try {
			
			myQueue.dequeue();
			myQueue.dequeue();
			myQueue.dequeue();
			myQueue.dequeue();
		}
		catch(Exception e) {
			
			System.out.println("The queue is empty");
		}
		
		myQueue.enqueue(4);
		myQueue.enqueue(5);
		myQueue.enqueue(6);
		
		try {
			
			myQueue.display();
			System.out.println();
			
			System.out.println("The first value in the queue is: " + myQueue.getFront());
		}
		catch(Exception e) {
			
			System.out.println("The queue is empty");
		}
		
		if(myQueue.isEmpty()) {
			
			System.out.println("The queue is empty");
		}
		else
			System.out.println("The queue is not empty");
		
		System.out.println("The size of the queue is: " + myQueue.size());
		
		myQueue.clear();
		
		if(myQueue.isEmpty()) {
			
			System.out.println("The queue is empty");
		}
		else
			System.out.println("The queue is not empty");
		
		
	}
	
}
