
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class 
{


	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int max = 0 , min = 0 , temp = 0 , max2 = 0;
	    boolean l = false;
	    /*ArrayList<Integer> arr2 = new ArrayList<Integer>();
	    System.out.println("Enter the # of the array : ");
	    int n = input.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ; i<n ; i++) {
	    	System.out.println("Enter "+(i+1)+"-number : ");
	    	int x = input.nextInt();
	    	arr[i] = x;
	    }*/
	    
	    int[] arr1 = {2 , 3 , 5 , 6};
	    int[] arr2 = {1 , 4 , 6 , 8 , 9 , 2};
	    int[] arr3 = {4 , 6 , 2};
	    for(int i = 0 ; i<arr1.length ; i++) {
	    	for(int k = 0 ; k<arr2.length ; k++) {
	    		if(arr1[i] == arr2[k]) {
	    			temp++;
	    		}
	    	}
	    	for(int c = 0 ; c<arr3.length ; c++) {
    			if(arr1[i] == arr3[c]) {
    				temp++;
    			}
    		}
	    	if(temp == 2) {
	    		System.out.println(arr1[i]+" is in three arrays");
	    		temp = 0;
	    	}
	    	else {
	    		temp = 0;
	    	}
	    }
	    
	}
}	    a
	    
	    
	
