public class Primes {

   public static void main(String[] args) {
   		for (int i = 2; i <= 100; i++){
      		if (isPrime(i) == true)
      			System.out.println(i);
      	}
    }

    public static boolean isPrime(int n) {
      if (n%2 == 0 && n != 2) {
        return false;
      } else {
      	for (int i = 3; i < n; i = i+2) {
      		if (n%i == 0)
      			return false;
      	}
      }
    	return true;
    }
}