import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.InputMap;

import java.math.RoundingMode;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Your password should have at least 2 digits , contains only digits and letters , at least 8 elements");
		System.out.println("Enter your password : ");
		String str = input.next();
		func(str);
	}

	public static void func(String string) {
		int n = 0 , l = 0;
		boolean b = false , a = false , c = false;
		char[] ch = string.toCharArray();
		if(ch.length >= 8) {
			c = true;
			for(int i = 0 ; i<ch.length ; i++) {
				if(Character.isLetter(ch[i]) || Character.isDigit(ch[i])){
					n++;
					{if(Character.isDigit(ch[i])) {
						l++;
					}}
					if(n == ch.length) {
						a = true;
						if(l >= 2) {
							b = true;
						}
						else {
							b = false;
						}
					}
					else {
						a = false;
					}
				}
			}
		}
		else {
			c = false;
		}
		
		if(c == true) {
			if(a == true) {
				if(b == true) {
					System.out.println("Your code is accepted");
				}
				else {
					System.out.println("At least 2 digits");
				}
			}
			else {
				System.out.println("Only digits and letters");
			}
		}
		else {
			System.out.println("At least 8 elements");



		}
		
	}

}