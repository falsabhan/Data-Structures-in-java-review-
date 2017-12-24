import java.util.InputMismatchException;

public class Stack {

private int stackSize;
private int topItem;
private int [] stackArray;

	
public Stack(int s) {
	stackSize = s;
	stackArray = new int[stackSize];
	topItem = 0;
	}
public void push(int item) {
	if(topItem < stackSize) {
	stackArray[topItem] = item;
	topItem++;
	
	
	}
	else {
		System.out.println("error, stack overflow");
		
	}
	
	}
public int peek() {
	return stackArray[topItem-1];
	}
public boolean isEmpty() {
	
	return (topItem == 0);
	}

public int pop() throws StackOverflowError  {
	if(topItem == 0) {
		 throw new StackOverflowError();
		}
	else {
		return stackArray[topItem--];
		
		}
	
	
}
public int isSize() {
return topItem;

}

}

