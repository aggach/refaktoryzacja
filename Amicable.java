public class Amicable

{
	public static void main(String[] args) {
		int sumDividers = 0;

		for (int n = 1; n < 10000; n++) {
			int b = sumOfDivisors(n);
			if (b > n && b < 10000) {
				int a = sumOfDivisors(b);
				if (a == n)
					sumDividers = sumDividers + n + b;
			}
		}

		System.out.println("The sum of all the amicable numbers under 10000 is " + sumDividers);
	}

	
	//This method return sum of proper divisors of n.
	
	public static int sumOfDivisors(int n) {
		int sum = 1; 

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				sum = sum + i + n / i;
		}
		return sum;
	}
}