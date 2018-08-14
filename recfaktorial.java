public class recfaktorial{
	public static void main(String[] args){
		if(args.length!=1){
			System.err.println("Usage: recfaktorial <angka>");
			return;
		}	
		int n = Integer.parseInt(args[0]);
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}
		else{
			return(n *factorial(n-1));
		}
	}
}
