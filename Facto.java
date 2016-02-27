
public class Facto {
	
	public static void main (String args[]) {
		int n = 5;
		System.out.println(n + "! = " + fact(n));
	}
	
	/**
	 * It calculate n!
	 * 
	 * @param n
	 * @return n!
	 * */
	public static int fact(int n){
		
		if( n == 0){
			return 1;
		}
		return n * fact(n-1);
	}
	
}

