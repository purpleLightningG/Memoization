package memoization;

public class Memoization {

	public static int getFib(int x) {
		int arr[] = new int[x + 1];
		int output = getFib(arr, x);
		return output;
	}

	public static int getFib(int arr[], int x) {
		if (x == 0 || x == 1) {
			return x;
		}
		if (arr[x] == 0) {
			arr[x] = getFib(x - 1) + getFib(x - 2);
		}
		return arr[x];
	}

}
