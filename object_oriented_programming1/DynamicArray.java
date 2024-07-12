package object_oriented_programming1;

public class DynamicArray {
	private int data[];//yha bs reference store krne ke liye gazah ban gayi hai
	private int nextIndex;
	
	public DynamicArray() {
		data=new int[5];//array yha bana hai 
		nextIndex=0;
	}
	public int size() {
		return nextIndex;
	}
	public void add(int element) {
		
		if(nextIndex==data.length) {
			restructure();
		}

		data[nextIndex]=element;
		nextIndex++;
	}
	public void set(int index,int element) {
		if(index>nextIndex) {
			return;
		}
		if(index<nextIndex) {
			data[index]=element;
		}
		else {
			add(element);
		}
	}
	public int get(int index) {
		if(index>=nextIndex) {
			//error out
			return -1;
		}
		return data[index];
		}
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public int removeLast() {
		if(size()==0) {
			//error out
			return -1;
		}
		int value=data[nextIndex-1];
		data[nextIndex-1]=0;
		nextIndex--;
		return value;
	}
	public void restructure() {
		int temp[]=data;//temp ek reference hai jo ki data array ko point kr rha h matlab temp ka length data ke length ke equal hoga
		data=new int[data.length*2];//yha pe data ke length ko 2 se multiply kr rhe h aur data yha pe point ho rha h
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
	
		}
	}

}
