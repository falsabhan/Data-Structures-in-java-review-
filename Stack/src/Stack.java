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
public void push(int item) throws ArrayIndexOutOfBoundsException {
	if(topItem < stackSize) {
	stackArray[++topItem] = item;
	System.out.println(topItem);
	
	}
	else {
		throw new ArrayIndexOutOfBoundsException();
		
	}
	
	}
public int peek() {
	return stackArray[topItem];
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

