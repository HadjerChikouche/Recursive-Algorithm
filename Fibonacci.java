public class Fibonacci {
	
	public static void main (String args[]) {
		System.out.print("fibonacci de 5 = "+fibonacci(5));
		
	}
	
	/**
	 * it calculates the value of the sequence of fibonacci
	 * @param n
	 * @return int N
	 * */
	public static int fibonacci(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}

