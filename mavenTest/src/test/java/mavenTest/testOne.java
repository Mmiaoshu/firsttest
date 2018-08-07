package mavenTest;

public class testOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0 ;
		do {
			i+=2 ;
		} while (i<10);
		System.out.println(i);
		System.out.println("++++++++++++++++++++++");
		i=10;
		do {
			i+=2;
			System.out.println(i);	
		} while (i<10);
		
		i=0;
		while (true) {
			i++;
			System.out.println("1234567890");	
			if (i==100) {
				break;
			}
		}
		
		System.out.println("==========================123456789");
	}
	
}
