package oops;

public class DynamicArrayUse {

	public static void main(String[] args) {
		
		DynamicArray d = new DynamicArray();
		
		for(int i=1; i<100;i++) {
			d.add(100+i);
		}

		System.out.println(d.size());
		System.out.println(d.get(98));
	}

}
