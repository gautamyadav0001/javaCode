package coreJava;

public class addEven {
 
	public static void main (String var[]) {
		
		int n = 50;
		int sum = 0;
		
		for(int i = 1; i<=n ; i++) {
			
			if(i%2==0) {
				
				sum+=i;
				
			}
		}System.out.println(sum);
		
	}
}
