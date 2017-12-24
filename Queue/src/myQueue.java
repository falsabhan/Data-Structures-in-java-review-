
public class myQueue {
private int queueSize;
private int[] queueArray;
private int queueIndex;

// instructor 
public myQueue(int size) 
{
queueSize = size;
queueArray = new int[queueSize];
queueIndex = 0; 

}
// insert an element to the tail of the array
public void enQueue(int item) 
{
	if(queueIndex < queueSize) {
		queueArray[queueIndex] = item;
		
		queueIndex++;
	}
	else {
		System.out.println("error, can't add more elements. the queue is full");
		
	}
	


}
// removes the first element in the array at location 0
public void deQueue()
{
	if (!this.isEmpty()) {
		
		remove(0, queueArray); 
		queueIndex--;
		
	}
	else {
		
		System.out.println("the queue is empty");
	
	}

}

// returns true if the array in empty and false if not.
public boolean isEmpty() {return(queueIndex==0);}

public int peek() {
	if(queueIndex == 0) {
		System.out.println("queue is Empty");
		return 0;
	}
	else
	{
		
		return queueArray[queueIndex-1];
		
		
	}
}
private void remove(int removeIndex,int[] my_array) {
	for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
	
}
public int isSize() {
	return queueIndex;
	
	
}

// TODO: Add poll method.
public int poll() {
	
	if (!this.isEmpty()) {
		return queueArray[0];
	}
	else {
		
		System.out.println("the queue is empty");
		return 0;
	}
	
	
}
}