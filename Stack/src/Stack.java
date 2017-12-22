
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
	stackArray[++topItem] = item;
	}
	else {
		System.out.println("stack is full, can't add more data");
		
	}
	
	}
public int peek() {
	return stackArray[topItem];
	}
public boolean isEmpty() {
	
	return (topItem == 0);
	}
public int pop()  {
	if(topItem == 0) {
		 System.out.println("error, stack overflow");
		 return 0 ;
		}
	else {
		return stackArray[topItem--];
		
		}
	
	
}
public int isSize() {
return topItem;

}

}

