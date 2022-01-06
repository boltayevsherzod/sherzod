 
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		System.out.println("Enter the # of an array : ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.println("Enter "+(i+1)+"-number : ");
			int x = input.nextInt();
			arr[i] = x;
		}
		for(int k = 1 ; k<4; k++) {
			a = arr[arr.length-1];
			for(int l = 1 ; l<arr.length ; l++) {
				arr[arr.length-l] = arr[arr.length - 1 - l];

			}
			arr[0] = a;
		}
		System.out.println(Arrays.toString(arr));
	}
}