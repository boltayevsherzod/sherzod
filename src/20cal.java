import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;
public class Main {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		 int twenty = 0;
		 System.out.println("Enter the # of array : ");
		 int n = input.nextInt();
		 int[] arr = new int[n];
		 System.out.print("Enter the values : ");
		 for(int i = 0 ; i<=n-1 ; i++) { 
			 arr[i] = input.nextInt();
			 if(arr[i] == 20) {
				 twenty++;
			 }
			 for(int k = 0 ; k<=n-2 ; k++){
				 if(arr[k] == 20 && arr[k+1] == 20) {
					 System.out.println("false");
				 }
			 }
		 }
		 if(twenty<=3) {
			 System.out.println("It is less than 3 times");
		 }
		 else {
			 System.out.println("It is more than 3 times");
		 }
		 
	     
	}
}