package zi;

public class Inheritance4 extends Inheritance3 {
	
	
	public void multiply(int a,int b) {
		z=a*b;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritance4 i4 = new Inheritance4();
		i4.multiply(4,5);
		i4.add(6, 9);
		
		

	}

}
