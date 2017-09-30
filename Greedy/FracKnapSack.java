import java.io.*;
import java.util.*;


public class FracKnapSack {

	public static double getMaxValueCarriedInKnapsack(Stuff[] stuffs, int w) {
		Arrays.sort(stuffs, Collections.reverseOrder());
		double value = 0.0;
		int i;
		for (i = 0; i < stuffs.length ; i++) {
			if (w > 0 && w >= stuffs[i].weight) {
				w = w - stuffs[i].weight;
				value += stuffs[i].value;
			}
			else {
				break;
			}
		}
		if (w > 0) {
			value += w*stuffs[i].valuePerUnitWeight;
		}
		return value;
	}

	public static void main(String[] args) {
		System.out.println("Enter the total capacity of kanpsack");

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();

		System.out.println("Enter the number of objects");
		int n = sc.nextInt();

		System.out.println("Enter weight and value of each object");
		Stuff[] stuffs = new Stuff[n];
		for (int i = 0; i < n; i++ ) {
			int weight = sc.nextInt();
			int value = sc.nextInt();
			stuffs[i] = new Stuff(weight, value);
		}

		System.out.println(getMaxValueCarriedInKnapsack(stuffs, w));
	}
}