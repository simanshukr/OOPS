package oops;

public class DynamicArray {
	
	private int Data[];
	private int nextElementIndex;
	
	
	public DynamicArray(){
		Data = new int[5];
		nextElementIndex = 0;
	}
	
	public int size(){
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		return nextElementIndex ==0;
	}
	
	public int get(int i) {
		if(i>=nextElementIndex) {
			//throw error
			return -1;
		}
		return Data[i];
	}
	
	public void set(int i , int element) {
		if(i>=nextElementIndex) {
			//throw error
			return;
		}
		Data[i] = element;
	}
	
	
	public int removeLast(){
		if(nextElementIndex == 0) {
			return -1;
		}
		int temp = Data[nextElementIndex-1];
		Data[nextElementIndex-1]=0;
		nextElementIndex--;
		return temp;
	}
	
	//add function
	public void add(int element) {
		if(nextElementIndex == Data.length) {
			doublecapacity();
		}
		Data[nextElementIndex] = element;
		nextElementIndex++;
	}

	private void doublecapacity() {
		
		int temp[]= Data;
		Data = new int[2*temp.length];
		for(int i =0; i<temp.length; i++) {
			Data[i] = temp[i];
		}
	}
	
	

}
