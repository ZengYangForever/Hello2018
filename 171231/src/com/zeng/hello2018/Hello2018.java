package com.zeng.hello2018;

public class Hello2018 {
	public static int M = 100;
	public static long[] fib = new long[M];

	public static long F(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return F(N - 1) + F(N - 2);
	}

	public static long FOptimization(int N) {
		if (0 == N)
			fib[0] = 0;
		else if (1 == N)
			fib[1] = 1;
		else
			fib[N] = fib[N - 1] + fib[N - 2];
		return fib[N];
	}

	/*
	 * public static double cal(long N){ if(N == 1) return 0; else return
	 * Math.ln(N) + cal(N-1); }
	 */
	public static void main(String[] args) {
		for (int N = 0; N < 100; ++N) {
			fib[N] = FOptimization(N);
			System.out.print(fib[N] + " ");
		}
		System.out.println();
		System.out.println("Hello 2018!");
	}
}
