import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int[] numbers = {2 , 6 , -4 , -9 , 18 , 0 , 3};
		 int max = 0, min = 0;
		 for(int i = 0 ; i<=numbers.length-1 ; i++) {
			 if(numbers[i] >= max) {
				 max = numbers[i];
			 }
			 else if(min >= numbers[i]){
				 min = numbers[i];
			 }
		 }  

		 System.out.println("The maximum is : "+max);
		 System.out.println("The minimum is : "+min);


	}
}
