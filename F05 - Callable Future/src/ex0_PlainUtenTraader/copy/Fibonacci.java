package ex0_PlainUtenTraader.copy;

class Fibonacci {
	public long fib(int n) {
		return n <= 1 ? n : fib(n-1) + fib(n-2);
	}
}