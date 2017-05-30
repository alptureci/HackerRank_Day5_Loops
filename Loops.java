
import java.util.*;


public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Loops l = new Loops();
		
		
		//For Loop
		for (int i = 1; i<=10; i++) {
			int result;
			result = n * i;
			
			l.printer(n,i,result);
		}
		
		//While Loop
		int w = 1;
		while (w <= 10) {
			int result;
			result = n * w;			
			l.printer(n,w,result);
			w++;
		}
		
		//Do While Loop
		int dw = 1;
		do {
			int result;
			result = n * dw;			
			l.printer(n,dw,result);
			dw++;
		} while (dw <= 10);
		
		sc.close();
	}
	
	
	public void printer(int x, int y, int z){
		System.out.println(x + " x " + y + " = " + z);
	}

}
