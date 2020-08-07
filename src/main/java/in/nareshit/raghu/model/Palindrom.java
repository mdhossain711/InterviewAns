package in.nareshit.raghu.model;

import java.util.Arrays;

public class Palindrom {

	public static void main(String[] args) {

		long num = 11211230;
		System.out.println(num);
		do {
			if (ispalindrom(num)) {
				System.out.println("Number is palindrom");
				break;
			} else {
				num = Sum(num);
				if (num < 9) {
					System.out.println("Number is not palindrom");
					break;
				}
			}
		} while (true);

	}

	private static long Sum(long num) {
		long res = 0;
		long[] ar = new long[10];
		int i = 0;
		while (num > 0) {
			ar[i] = num % 10;
			num = num / 10;
			i++;
		}
		for (int j = 9; j >= 0; j--) {
			long temp = ar[j] + ar[--j];
			res = res * 10 + temp;
		}
		return res;
	}

	public static boolean ispalindrom(long num) {
		long temp = num;
		long rem;
		long sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}
}
