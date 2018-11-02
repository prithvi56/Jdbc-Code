package com.caps;
import java.util.Random;
import java.util.Scanner;
public class RandomNum {

	public static void main(String[] args) {

		Random rand = new Random();
		System.out.print("Generated OTP : ");
		int  n = rand.nextInt(999999);	
		System.out.println(n);

//		Scanner in = new Scanner(System.in);
//
//		System.out.println("Enter the password : ");
//		int pass = in.nextInt();
//
//		System.out.println("Enter the OTP  : ");
//		int otp = in.nextInt();
//		if(pass == 1234 && n == otp)
//		{
//			System.out.println("access garanted");
//		}else {
//			System.out.println("access denied");
//		}

	}

}
